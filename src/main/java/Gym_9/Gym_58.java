package Gym_9;

import java.util.ArrayList;
import java.util.List;

public class Gym_58 {

    public List<Integer> getRow(int rowIndex) {
        // Initialize the row with 1s
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        // Calculate each element of the row based on the previous row
        for (int i = 0; i <= rowIndex; ++i) {
            row.add(1);
            for (int j = i - 1; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
