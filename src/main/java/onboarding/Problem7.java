package onboarding;

import java.util.*;

import java.util.stream.Collectors;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> recommentList = new ArrayList<String>();

        Map<String, List<String>>   dictionary  = new HashMap<>();
        Map<String, Integer>        scores      = new HashMap<>();

        for(int i = 0; i < friends.size(); ++i){
            var A = friends.get(i).get(0);
            var B = friends.get(i).get(1);

            if(!dictionary.containsKey(A)){
                dictionary.put(A, new ArrayList<>());
            }
            dictionary.get(A).add(B);

            if(!dictionary.containsKey(B)){
                dictionary.put(B, new ArrayList<>());
            }
            dictionary.get(B).add(A);
        }

        for(var entry : dictionary.entrySet()){
            var friend = entry.getKey();
            var friendList = entry.getValue();

            //유저이거나, 유저와 친구인 경우
            if(Objects.equals(friend, user)){
                continue;
            }
            if(friendList.contains(user)){
                continue;
            }
            for (int i = 0; i < friendList.size(); i++) {
                //친친구
                if(dictionary.get(user).contains(friendList.get(i))){
                    if(scores.containsKey(friend)){
                        scores.put(friend, scores.get(friend) + 10);
                    }
                    else{
                        scores.put(friend, 10);
                    }

                }
            }
        }

        var userFriendList = dictionary.get(user);

        //방문객
        for(int i = 0; i < visitors.size(); ++i){
            String cur = visitors.get(i);

            if(userFriendList.contains(cur)){
                continue;
            }

            if(scores.containsKey(cur)){
                scores.put(cur, scores.get(cur) + 1);
            }
            else{
                scores.put(cur, 1);
            }
        }

        recommentList = scores.entrySet().stream()
                .filter(entry -> entry.getValue() != 0)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return recommentList;
    }
}

