class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {

            int combined = arr1[i] | arr2[i];

            String binary = Integer.toBinaryString(combined);

            binary = String.format("%" + n + "s", binary).replace(' ', '0');

            binary = binary.replace('1', '#').replace('0', ' ');

            answer[i] = binary;
        }
       
        
        
        
        
        
        return answer;
    }
}