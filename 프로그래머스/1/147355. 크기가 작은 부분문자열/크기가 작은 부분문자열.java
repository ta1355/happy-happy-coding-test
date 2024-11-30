class Solution {
    public int solution(String t, String p) {
        
        long i1 = Long.parseLong(p);

        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long i2 = Long.parseLong(t.substring(i, i + p.length()));
            if (i1 >= i2) {
                answer++;
            }
        }
        
        return answer;
    }
}