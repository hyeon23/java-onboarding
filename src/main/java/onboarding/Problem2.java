package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder answer = new StringBuilder(cryptogram);

        boolean trigger = true;

        while(trigger){
            for(int i = 0; i < answer.length() - 1; ++i){
                //같다면 제거
                if(answer.charAt(i) == answer.charAt(i+1)){
                    answer.deleteCharAt(i);
                    answer.deleteCharAt(i+1);
                }
            }
        }

        return answer.toString();
    }
}
