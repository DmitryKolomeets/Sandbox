package Gym_2;

public class Gym_6 {
    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }

                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] array = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(islandPerimeter(array));

    }
}