package test;

public class TestO {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            double n = Math.pow(10,i);
            long staartTime = System.nanoTime();
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum = sum + j;
            long endTime = System.nanoTime();
            double xx = (endTime - staartTime)/1000000000.0;
            System.out.println("10^" +i +":"+ xx + "s");
        }
    }



}
