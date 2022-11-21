//package algoritms;
//
//public class JosephusProblem {
//
//
//    /**
//     * Find the Winner of the Circular Game.
//     *
//     * @param number of friends, n, and an integer k
//     * @return return the winner of the game
//     */
//
//    public static int findTheWinner(int n, int k) {
//        return winner(n, k) + 1;
//    }
//
//    public static int winner(int n, int k) {
//        if (n == 1) {
//            return 0;
//        }
//        return (winner(n - 1, k) + k) % n;
//    }
//}
