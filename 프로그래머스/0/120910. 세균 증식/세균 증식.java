class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i = 1; i <= t; i++){
            if(i == 1){
                answer  = n*2;
            }else{
                answer = answer*2;
            }
        }
        return answer;
    }
}