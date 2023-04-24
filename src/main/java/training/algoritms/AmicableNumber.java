package training.algoritms;

public class AmicableNumber {

    public static void main(String[] args) {
        AmicableNumber.findAllInRange(1, 3000);
        /* Res -> Int Range of 1 till 3000there are 3Amicable_numbers These are  1: = ( 220,284)	2: = ( 1184,1210)
    3: = ( 2620,2924) So it worked	*/

    }

    /**
     * @param startValue
     * @param stopValue
     * @return
     */
    static void findAllInRange(int startValue, int stopValue) {
        /* the 2 for loops are to avoid to double check tuple. For example (200,100) and (100,200) is the same calculation
         * also to avoid is to check the number with it self. a number with itself is always a AmicableNumber
         * */
        StringBuilder res = new StringBuilder();
        int countofRes = 0;

        for (int i = startValue; i < stopValue; i++) {
            for (int j = i + 1; j <= stopValue; j++) {
                if (isAmicableNumber(i, j)) {
                    countofRes++;
                    res.append(
                            "" + countofRes + ": = ( " + i + "," + j + ")" + "\t"
                    );
                }
            }
        }
        res.insert(
                0,
                "Int Range of " +
                        startValue +
                        " till " +
                        stopValue +
                        " there are " +
                        countofRes +
                        " Amicable_numbers.These are \n "
        );
        System.out.println(res.toString());
    }

    /**
     * Check if {@code numberOne and numberTwo } are AmicableNumbers or not
     *
     * @param numberOne numberTwo
     * @return {@code true} if {@code numberOne numberTwo} isAmicableNumbers
     * otherwise false
     */
    static boolean isAmicableNumber(int numberOne, int numberTwo) {
        return (
                (
                        recursiveCalcOfDividerSum(numberOne, numberOne) == numberTwo &&
                                numberOne == recursiveCalcOfDividerSum(numberTwo, numberTwo)
                )
        );
    }

    /**
     * calculated in recursive calls the Sum of all the Dividers beside it self
     *
     * @param number div = the next to test dividely by using the modulo
     * operator
     * @return sum of all the dividers
     */
    static int recursiveCalcOfDividerSum(int number, int div) {
        if (div == 1) {
            return 0;
        } else if (number % --div == 0) {
            return recursiveCalcOfDividerSum(number, div) + div;
        } else {
            return recursiveCalcOfDividerSum(number, div);
        }
    }
}
