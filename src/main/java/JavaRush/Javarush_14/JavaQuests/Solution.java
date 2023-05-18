package JavaRush.Javarush_14.JavaQuests;

public class Solution {

    public static void main(String[] args) {

        JavarushQuest [] javarushQuests = JavarushQuest.values();
        for(JavarushQuest quest:  javarushQuests) {
            System.out.println(quest.ordinal());
        }




    }
}
