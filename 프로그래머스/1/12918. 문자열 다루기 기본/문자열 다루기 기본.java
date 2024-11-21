class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() !=4 && s.length() != 6){
            answer = false;
        }
        
         for (int i = 0; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            if (!Character.isDigit(chars[i])){
             answer = false;
             break;
            }
        }
        
        return answer;
    }
}