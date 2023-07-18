package Test.Binary_Search;

public class Binary {


    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 4, 10};


        System.out.println(4);


    }

    private static int binarySearch(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < sortedArray[middle]) {
                high = middle - 1;
            } else if (key > sortedArray[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }

        }
        return -1;
    }


}


