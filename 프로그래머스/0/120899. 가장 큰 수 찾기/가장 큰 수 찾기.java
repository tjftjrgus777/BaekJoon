import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer1 = new int[array.length];
        for(int i = 0; i < answer1.length; i++){
            answer1[i] = array[i];
        }
        Arrays.sort(array);
        int max = array[array.length - 1];
        int index = 0;
        for(int i = 0; i < answer1.length; i++){
            if(max == answer1[i]){
                index = i;
            }
        }
        int[] answer = {max , index};
        
        return answer;
    }
}