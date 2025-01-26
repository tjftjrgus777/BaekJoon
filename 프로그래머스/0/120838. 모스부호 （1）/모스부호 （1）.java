import java.util.Map;  
import java.util.HashMap; 
class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> MORSE_MAP = new HashMap<>();
        MORSE_MAP.put(".-", "a");
        MORSE_MAP.put("-...", "b");
        MORSE_MAP.put("-.-.", "c");
        MORSE_MAP.put("-..", "d");
        MORSE_MAP.put(".", "e");
        MORSE_MAP.put("..-.", "f");
        MORSE_MAP.put("--.", "g");
        MORSE_MAP.put("....", "h");
        MORSE_MAP.put("..", "i");
        MORSE_MAP.put(".---", "j");
        MORSE_MAP.put("-.-", "k");
        MORSE_MAP.put(".-..", "l");
        MORSE_MAP.put("--", "m");
        MORSE_MAP.put("-.", "n");
        MORSE_MAP.put("---", "o");
        MORSE_MAP.put(".--.", "p");
        MORSE_MAP.put("--.-", "q");
        MORSE_MAP.put(".-.", "r");
        MORSE_MAP.put("...", "s");
        MORSE_MAP.put("-", "t");
        MORSE_MAP.put("..-", "u");
        MORSE_MAP.put("...-", "v");
        MORSE_MAP.put(".--", "w");
        MORSE_MAP.put("-..-", "x");
        MORSE_MAP.put("-.--", "y");
        MORSE_MAP.put("--..", "z");
        
        String[] arrayMorse = letter.split(" ");
        for(String morese : arrayMorse){
            answer += MORSE_MAP.get(morese);
        }
    

        return answer;
    }
}