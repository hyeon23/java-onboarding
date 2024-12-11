package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";

        String origin = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
        String dict = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        for(int i = 0; i < word.length(); ++i) {

            if(word.charAt(i) == ' '){
                answer += ' ';
            }
            else{
                char targetChar = dict.charAt(origin.indexOf(word.charAt(i)));
                answer += targetChar;
            }
        }

        return answer;
    }
}
