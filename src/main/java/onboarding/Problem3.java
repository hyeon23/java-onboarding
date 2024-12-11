package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for(int targetNum = 1; targetNum <= number; ++targetNum){
            var targetStr = String.valueOf(targetNum);

            for(int idx = 0; idx < targetStr.length(); ++idx){
                if(targetStr.charAt(idx) == '3' || targetStr.charAt(idx) == '6' || targetStr.charAt(idx) == '9'){
                    ++answer;
                }
            }
        }

        return answer;
    }
}
