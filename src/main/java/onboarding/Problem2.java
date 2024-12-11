package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder answer = new StringBuilder(cryptogram);

        boolean trigger;

        do{
            trigger = false;

            for(int i = 0; i < answer.length() - 1; ++i){
                //같다면 제거
                if(answer.charAt(i) == answer.charAt(i+1)){
                    answer.deleteCharAt(i+1);
                    answer.deleteCharAt(i);

                    trigger = true;
                }
            }

        }while(trigger);

        return answer.toString();
    }
}
