import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
String c = Integer.toString(n);
        
        for (int i = 0; i < c.length(); i++) {
        int plus = Integer.parseInt(c.substring(i, i+1));
        answer = answer +plus;
       }
       

        return answer;
    }
}