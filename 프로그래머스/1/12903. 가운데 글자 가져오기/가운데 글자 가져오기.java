class Solution {
    public String solution(String s) {
        String answer = "";
        
                StringBuilder builder = new StringBuilder();

        char c[] = new char[s.length()];
        
              for (int i = 0; i < s.length(); i++) {
            
            c[i] = s.charAt(i);

        }

        if (s.length()%2 ==0) {

          builder.append(c[s.length()/2-1]);
          builder.append(c[s.length()/2]);

          answer= builder.toString();
     
        }else{
        
            builder.append(c[s.length()/2]);

            answer = builder.toString();

        }
        
        
        
        
        
        return answer;
    }
}