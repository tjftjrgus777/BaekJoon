class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        for(int i = 1; i <= n; i += 2){
            count++;
        }
        int[] answer = new int[count];
        for(int i = 1 , j =0; i <= n; i += 2, j++){
            answer[j] = i;
        }
        return answer;
    }
}