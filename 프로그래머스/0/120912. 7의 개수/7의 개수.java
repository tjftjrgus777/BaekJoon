class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        String s = " ";
        for(int i = 0; i < array.length; i++){
            s += "" + array[i];
        }
        while(answer != -1){
            answer = s.indexOf("7",answer+1);
            if(answer != -1){
                count++;
            }
        }
        
        return count;
    }
}