package Gym_6;

import java.util.HashMap;
import java.util.Map;

public class Gym_24 {

    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int result2 = romanNumbers.get(s.charAt(s.length() - 1));
        System.out.println("result2 ====> " + result2);



        char[] romanLetters = s.toCharArray();

        for (int i = 0; i < romanLetters.length; i++) {
            for(Map.Entry pair: romanNumbers.entrySet()) {
                if(pair.getKey().equals(romanLetters[i])) {
                    result = result + romanNumbers.get(pair.getKey());
                }
            }
        }

        for (int i = 0; i < romanLetters.length-1; i++) {

            if(romanLetters[i] == 'I') {
                if(romanLetters[i+1] == 'V' || romanLetters[i+1] == 'X') {
                    result = result -2;
                }
            }

            if(romanLetters[i] == 'X') {
                if(romanLetters[i+1] == 'L' || romanLetters[i+1] == 'C') {
                    result = result - 20;
                }
            }

            if(romanLetters[i] == 'C') {
                if(romanLetters[i+1] == 'D' || romanLetters[i+1] == 'M') {
                    result = result - 200;
                }
            }


        }


        System.out.println("Result is ====> " + result);
        return result;
    }

}
