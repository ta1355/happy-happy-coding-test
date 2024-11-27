import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
         List<Integer> list = new ArrayList<>();
        
        int c =0;
        
          for (int i = 0; i < arr.length; i++) {

             if (arr[i]% divisor ==0){
                list.add(arr[i]);
             }
        }

        if (list.isEmpty()){
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        
       
        return answer;
    }
}