package JavaRush.JavaRush_18.VillariboAndVillabadgo;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
       orchestra.add(new Organ());
       orchestra.add(new Piano());
       orchestra.add(new Piano());
       orchestra.add(new Piano());

    }

    public static void createStringedOrchestra() {
       orchestra.add(new Violin());
       orchestra.add(new Violin());
       orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
       for (MusicalInstrument musicalInstrument: orchestra) {
           if (musicalInstrument instanceof MusicalInstrument) {
               MusicalInstrument instrument = (MusicalInstrument) musicalInstrument;
               instrument.play();
           }
       }
    }


}
