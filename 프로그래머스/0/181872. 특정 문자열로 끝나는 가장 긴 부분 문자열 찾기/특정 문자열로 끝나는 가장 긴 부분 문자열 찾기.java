class Solution {
    public String solution(String myString, String pat) {
        int startIndex = -1;

        for (int i = myString.length() - pat.length(); i >= 0; i--) {
            boolean checkMatch = true;
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    checkMatch = false;
                    break;
                }
            }
            if (checkMatch) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1) {
            return "";
        } else {
            return myString.substring(0, startIndex + pat.length());
        }
    }
}