import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        // 길이에 대한 카운트를 저장할 HashMap
        HashMap<Integer, Integer> lengthCountMap = new HashMap<>();

        // 각 문자열의 길이를 기준으로 카운트
        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();  // 문자열 길이 구하기
            lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
        }

        // 가장 큰 그룹 크기 찾기
        int answer = 0;
        for (int count : lengthCountMap.values()) {
            answer = Math.max(answer, count);
        }

        return answer;
    }
}
