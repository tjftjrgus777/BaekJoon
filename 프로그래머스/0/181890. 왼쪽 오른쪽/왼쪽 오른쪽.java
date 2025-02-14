class Solution {
    public String[] solution(String[] str_list) {

        int indexL = -1;
        int indexR = -1;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                indexL = i;
                break;  
            }
            if (str_list[i].equals("r")) {
                indexR = i;
                break; 
            }
        }

        if (indexL == -1 && indexR == -1) {
            return new String[0];  
        }
        if (indexL != -1 && (indexR == -1 || indexL < indexR)) {
            String[] answer = new String[indexL];
            for (int i = 0; i < indexL; i++) {
                answer[i] = str_list[i];
            }
            return answer;
        } else if (indexR != -1 && (indexL == -1 || indexR < indexL)) {
            String[] answer = new String[str_list.length - indexR - 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = str_list[indexR + 1 + i];
            }
            return answer;
        }

        return new String[0];
    }
}
