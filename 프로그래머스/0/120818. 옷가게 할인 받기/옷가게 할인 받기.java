class Solution {
    public int solution(int price) {
        double answer1 = 0;
        if(price >= 500000){
            answer1 = price - price * 0.2;
        }else if(price >= 300000){
            answer1 = price - price * 0.1;
        }else if(price >= 100000){
            answer1 = price - price * 0.05;
        }else{
            answer1 = price; 
        }
        int answer = (int) answer1;
        return answer;
    }
}