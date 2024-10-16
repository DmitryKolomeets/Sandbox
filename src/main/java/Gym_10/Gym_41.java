package Gym_10;

import java.util.ArrayList;
import java.util.List;

public class Gym_41 {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> sum = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    sum.add(1);
                }
                else{
                    sum.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(sum);
        }

        return ans.get(rowIndex);


    }


}
