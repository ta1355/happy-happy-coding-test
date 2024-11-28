import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int answer = 0;
        
        for (int i = 0; i < 10; i++) {

            if (Arrays.binarySearch(numbers,i) <0){
                answer +=i;
            }
        }
        return answer;
    }
}