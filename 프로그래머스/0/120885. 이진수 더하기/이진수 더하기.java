

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int sum1 = 0;
        int sum2 = 0;
        String[] array1 = bin1.split(""); 
        String[] array2 = bin2.split(""); 

        for(int i = 0; i < array1.length; i++){
            if(array1[i].equals("1")){
                sum1 += Math.pow(2, array1.length -1 - i);
            }
        }
        
        for(int i = 0; i < array2.length; i++){
            if(array2[i].equals("1")){
                sum2 += Math.pow(2, array2.length -1 - i);
            }
        }
        answer = Integer.toBinaryString(sum1 + sum2); 
        return answer;
    }
}