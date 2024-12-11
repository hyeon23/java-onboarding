package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";

        String dict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < word.length(); ++i) {

            char targetChar = word.charAt(i);

            if(targetChar == ' '){
                answer += ' ';
            }
            else{
                if(Character.isUpperCase(targetChar)){
                    int idx = 25 - ((int)targetChar - 65);

                    answer += dict.charAt(idx) + "";
                }
                else if(Character.isLowerCase(targetChar)){
                    int idx = 25 - ((int)targetChar - 97);

                    answer += (dict.charAt(idx) + "").toLowerCase();
                }
            }
        }

        return answer;
    }
}
