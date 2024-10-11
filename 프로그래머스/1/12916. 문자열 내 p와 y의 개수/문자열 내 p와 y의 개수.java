class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
            char[] w = new char[s.length()];

    int pplus = 0;
    
    int yplus = 0;
        
         for (int i = 0; i < s.length(); i++) {
        w[i] =  s.charAt(i);
      w[i] =  Character.toLowerCase(w[i]);

      if (w[i] =='p') {
        pplus++;
      }else if (w[i] == 'y') {
        yplus++;
      }
    }

    if (pplus == yplus) {
        answer  = true;
    }else{
        answer =false;
    }


        return answer;
    }
}