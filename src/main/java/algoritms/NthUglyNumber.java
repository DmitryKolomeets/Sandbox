//package algoritms;
//
//public class NthUglyNumber {
//
//    /* Function to get the nth ugly number*/
//    public long getNthUglyNo(int n) {
//        long[] ugly = new long[n];
//        int two = 0, three = 0, five = 0;
//        long nm2 = 2, nm3 = 3, nm5 = 5;
//        long next = 1;
//
//        ugly[0] = 1;
//
//        for (int i = 1; i < n; i++) {
//            next = Math.min(nm2, Math.min(nm3, nm5));
//
//            ugly[i] = next;
//            if (next == nm2) {
//                two = two + 1;
//                nm2 = ugly[two] * 2;
//            }
//            if (next == nm3) {
//                three = three + 1;
//                nm3 = ugly[three] * 3;
//            }
//            if (next == nm5) {
//                five = five + 1;
//                nm5 = ugly[five] * 5;
//            }
//        }
//        return next;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = sc.nextInt();
//        NthUglyNumber ob = new NthUglyNumber();
//        long ugly = ob.getNthUglyNo(n);
//        System.out.println("nth Ugly number is : " + ugly);
//    }
//}
