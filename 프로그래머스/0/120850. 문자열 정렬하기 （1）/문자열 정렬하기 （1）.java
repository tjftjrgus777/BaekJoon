import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] strArray = my_string.split("");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}