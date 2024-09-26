package app;

import java.rmi.server.LogStream;

public class GitHomeworkL4Program {

    public static void main(String[] args) {

        int productNumber = 1;
        String producttype = "smartphone";
        String totalsales = "Total sales for 5 days is EUR";
        double salesbyday = 2430.68;
        int days = 5;
        double salessummary = (salesbyday +0.001) * (double)days;
        System.out.printf("Product No %d: %s,\n" +
                "%s %.2f, \n" +
                "Sales by day is EUR %.2f. \n",  productNumber, producttype, totalsales,
                salessummary ,salesbyday);

                        producttype = "laptop,";
                        totalsales = "Total sales for 7 days is EUR";
                        productNumber = 2;
                        salesbyday = 1498.12;
                        days = 7;
                        salessummary = (salesbyday + 0.001) * (double)days;
                        System.out.printf("Product No %d: %s \n" +
                        "%s %.2f, \n" +
                        "Sales by day is EUR %.2f. \n"  ,productNumber, producttype, totalsales,
                                salessummary, salesbyday);




        }
}
