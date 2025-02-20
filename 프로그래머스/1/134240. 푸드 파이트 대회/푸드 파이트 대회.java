class Solution {
    public String solution(int[] food) {
       StringBuilder builder = new StringBuilder();

            for (int i = 1; i < food.length; i++) {
                int c = food[i] / 2;
                builder.append(String.valueOf(i).repeat(c));
            }
            String answer =  builder.toString();
            answer = answer +"0";

            builder.reverse();

            answer = answer +builder;

            System.out.println(answer);
            return answer;
    }
}