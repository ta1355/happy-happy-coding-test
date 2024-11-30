class Solution {
    public long solution(long n) {
        long answer = 0;
        
     double p = Math.sqrt(n);

     if (p%1 ==0){
        answer =  (long)Math.pow(p+1 , 2);
     } else{
         answer = -1;

     }
        
        
        return answer;
    }
}