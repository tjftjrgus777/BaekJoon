class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int a = 0;
        int count = num_list.length;
        if(num_list[count -1] > num_list[count -2]){
            a = num_list[count -1] - num_list[count -2];
        }else{
            a = num_list[count -1] * 2;
        }
        for(int i = 0; i < answer.length - 1; i++){
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = a;
        
        return answer;
    }
}