package Cym_4;

public class Gym_103 {

    public int firstUniqChar(String s) {

        int[] freq = new int[26];
        char[] letters = s.toCharArray();

        for (char c : letters) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < letters.length; i++) {
            if (freq[letters[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
