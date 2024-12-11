package onboarding;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new java.util.ArrayList<>();

        Map<String, Integer> dictionary = new HashMap<>();

        for(int i = 0; i < forms.size(); ++i){
            var curEmail = forms.get(i).get(0);
            var curNickname = forms.get(i).get(1);

            for(int j = 0; j < curNickname.length() - 1; ++j){
                String targetStr = curNickname.substring(j, j + 2);

                if(dictionary.containsKey(targetStr)){
                    answer.add(curEmail);
                    dictionary.put(targetStr, dictionary.get(targetStr) + 1);
                    break;
                }
                else{
                    dictionary.put(targetStr, 0);
                }
            }
        }

        var curEmail = forms.get(0).get(0);
        var curNickname = forms.get(0).get(1);

        for(int j = 0; j < curNickname.length() - 1; ++j){
            String targetStr = curNickname.substring(j, j + 2);

            if(dictionary.get(targetStr) >= 2){
                answer.add(curEmail);
                break;
            }
        }

        Collections.sort(answer);

        return answer;
    }
}
