class Solution {
    public int solution(int n) {
        int answer = 0;
         String a =Integer.toString(n);
        
        for (int i = 0; i < a.length(); i++) {
            char[] chars =  a.toCharArray();
            answer += chars[i] - 48;
        }
        
        return answer;
    }
}