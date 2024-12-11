package onboarding;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        int curMoney = money;

        for(int i = 0; i < currencies.length; ++i){

            Integer temp = curMoney / currencies[i];
            answer.add(temp);
            curMoney %= currencies[i];
        }

        return answer;
    }
}
