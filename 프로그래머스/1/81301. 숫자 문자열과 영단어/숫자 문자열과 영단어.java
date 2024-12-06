import java.util.*;

class Solution {
    public int solution(String s) {
        
         Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);
        
        StringBuilder builder = new StringBuilder();
        
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)){
                builder.append(c);
                continue;
            }

            result += c;

            if (map.containsKey(result)){
                builder.append(map.get(result));
                result = "";
            }
        }

        int answer = Integer.parseInt(builder.toString());

       
        
        
        return answer;
    }
}