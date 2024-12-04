class Solution {
    public String solution(String s, int n) {
        
                char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        
       for (int i = 0; i < s.length(); i++) {

            if (chars[i] == ' ') {
                stringBuilder.append(' ');
            } else if (Character.isLetter(chars[i])) {
                char base = Character.isLowerCase(chars[i]) ? 'a' : 'A';
                chars[i] = (char) ((chars[i] - base + n) % 26 + base);
                stringBuilder.append(chars[i]);
            }
        }
        
    
        
        String answer = stringBuilder.toString();
        
        
        return answer;
    }
}