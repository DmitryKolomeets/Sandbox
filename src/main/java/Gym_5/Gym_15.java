package Gym_5;

public class Gym_15 {

    public int lengthOfLastWord(String s) {
        int wordLenght = 0;
        String[] words = s.split(" ");
        if (words.length > 0) {
            wordLenght = words[words.length - 1].length();
        } else {
            wordLenght = 0;
        }
        return wordLenght;
    }

}
