import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public String solution(String s) {
         String[] numbers = s.split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {

            list.add(Integer.parseInt(numbers[i]));
        }

        Integer max = Collections.max(list);

        Integer min = Collections.min(list);

        String answer = min + " " + max;
        return answer;
    }
}