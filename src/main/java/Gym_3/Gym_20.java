package Gym_3;

import java.util.HashMap;

public class Gym_20 {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {

                {
                    if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
                        return false;
                    }
                }

            } else {
                if (hm.containsValue(t.charAt(i))) {
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;

    }

}
