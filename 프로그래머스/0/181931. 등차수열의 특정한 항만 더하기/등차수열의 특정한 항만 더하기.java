class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int idx = included.length;
        for(int i = 0; i < idx; i++) {
            if(included[i]) answer += a + (d * i);
        }
            
        return answer;
    }
}