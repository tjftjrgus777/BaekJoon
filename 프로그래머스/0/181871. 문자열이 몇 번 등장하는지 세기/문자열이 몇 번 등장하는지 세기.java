class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = myString.indexOf(pat); // pat이 처음 등장하는 위치 찾기

        while (index != -1) {  // pat이 존재하는 동안 반복
            count++;
            index = myString.indexOf(pat, index + 1); // 다음 pat 위치 찾기
        }

        return count;
    }
}