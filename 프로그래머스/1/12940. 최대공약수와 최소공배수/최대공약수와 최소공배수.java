class Solution {
    public int[] solution(int n, int m) {
        
          int gcd = 0;

        int lcm = 0;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        for (int i = (n > m ? n : m); ; i++) {      // for 문 2번 째 그냥 ; 는 무한 반복 break 필수
            if (i % n == 0 && i % m == 0) {
                lcm = i;
                break;
            }
        }

        int[] answer = {gcd , lcm};
        
        return answer;
    }
}