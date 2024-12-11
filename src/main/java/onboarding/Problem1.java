package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int pobiMax = 0;
        int crongMax = 0;

        if(pobi.get(0) % 2 == 0) return -1;
        if(pobi.get(1) % 2 != 0) return -1;

        if(crong.get(0) % 2 == 0) return -1;
        if(crong.get(1) % 2 != 0) return -1;

        if(pobi.get(0) + 1 != pobi.get(1)) return -1;
        if(crong.get(0) + 1 != crong.get(1)) return -1;

        for(int i = 0; i < pobi.size(); ++i){
            //List 값 접근 및 수정 -> get / set


            var pobiScore = pobi.get(i);
            var crongScore = crong.get(i);

            var pobiString = pobiScore.toString();
            var crongString = crongScore.toString();

            int sum = 0;
            int mux = 1;

            for(int j = 0; j < pobiString.length(); ++j){
                sum += Integer.parseInt(String.valueOf(pobiString.charAt(j)));
                mux *= Integer.parseInt(String.valueOf(pobiString.charAt(j)));

            }

            pobiMax = Math.max(sum, mux);

            sum = 0;
            mux = 1;

            for(int j = 0; j < crongString.length(); ++j){
                sum += Integer.parseInt(String.valueOf(crongString.charAt(j)));
                mux *= Integer.parseInt(String.valueOf(crongString.charAt(j)));

            }
            crongMax = Math.max(sum, mux);
        }

        if(pobiMax > crongMax) return 1;
        else if(pobiMax < crongMax) return 2;
        else  return 0;
    }
}