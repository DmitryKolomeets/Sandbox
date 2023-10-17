package lara_dz_18;

public class User_28 {

    public static int lengthOfLastWord(String s) {
        int wordLenght =0;
        int result = 0;
        String[] words = s.split(" ");
        wordLenght = words[words.length-1].length();
        System.out.println(wordLenght);
        return wordLenght;
    }

    public static void main(String[] args) {

        lengthOfLastWord("luffy все еще джойбой");

    }



}
