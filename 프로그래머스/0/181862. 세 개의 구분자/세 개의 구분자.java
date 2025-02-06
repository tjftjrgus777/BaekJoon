import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        // 'a', 'b', 'c'를 기준으로 나누기
        String[] arr = myStr.split("a");
        myStr = String.join(" ", arr);
        String[] arr1 = myStr.split("b");
        myStr = String.join(" ", arr1);
        String[] arr2 = myStr.split("c");
        myStr = String.join(" ", arr2);

        // 다시 split(" ")을 사용하여 결과 배열 생성
        String[] answer = myStr.split(" ");
        List<String> nonEmptyList = new ArrayList<>();

        // 빈 문자열을 제거하고 nonEmptyList에 추가
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].isEmpty()) {
                nonEmptyList.add(answer[i]);
            }
        }

        // 리스트를 배열로 변환
        String[] result = nonEmptyList.toArray(new String[0]);

        // 배열이 비어 있으면 "EMPTY" 반환
        if (result.length == 0) {
            return new String[]{"EMPTY"};
        }

        return result;
    }
}
