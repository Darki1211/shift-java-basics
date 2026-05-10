package main.java.homework18;

public class LogicalOperationTable {
    public static void main(String[] args) {
        boolean p;
        boolean q;

        System.out.println("P\t\tQ\t\tP AND Q\tP OR Q\tP XOR Q\tNOT P");

        p = false;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
    }
}