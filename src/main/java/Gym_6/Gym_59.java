package Gym_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gym_59 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) return result;
        result.add(Arrays.asList(1));
        List<Integer> resultSet;


        for (int i = 1; i < numRows; i++) {
            resultSet   = new ArrayList<>();

            resultSet.add(1);
            List<Integer> prewRow = result.get(i-1);
            for(int j = 1; j<i; j++) {
                resultSet.add(prewRow.get(j-1) + prewRow.get(j));

            }
            resultSet.add(1);
            result.add(resultSet);
        }


        return result;
    }
}
