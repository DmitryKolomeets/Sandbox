package table;

public class Table {

    public static void main(String[] args) {
        for(int j=0 ; j <=9 ; j++) {
            for(int i=0 ; i<=j ; i++) {
                int sum = 0;
                sum += i*j;
                System.out.print(i+"*"+j+"="+sum + "\t");
            }
            System.out.println();
        }
    }
}
