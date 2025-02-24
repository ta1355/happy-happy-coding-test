import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        
        PriorityQueue<Integer> hallofFame = new PriorityQueue<>();

        List<Integer> dailyMinScores = new ArrayList<>();


        for (int i = 0; i < score.length; i++) {
            hallofFame.offer(score[i]);

            if (hallofFame.size() > k ) {
                hallofFame.poll();
            }

            dailyMinScores.add(hallofFame.peek());

            answer = dailyMinScores.stream().mapToInt(Integer :: intValue).toArray();
        }
        
        return answer;
    }
}