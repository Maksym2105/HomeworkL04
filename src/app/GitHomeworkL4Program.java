package app;

public class GitHomeworkL4Program {

    public static void main(String[] args) {

        int productNumber = 1;
        String producttype = "smartphone";
        String totalsales = "Total sales for 5 days is EUR";
        int productQuantity = 50;
        double productPrice = 243.0682;
        int days = 5;
        double totalSales1 = (double)productQuantity * productPrice;
        double salesPerDay1 = totalSales1 / days;

        System.out.printf("Product No %d: %s,\n" +
                "%s %.2f, \n" +
                "Sales by day is EUR %.2f. \n",  productNumber, producttype, totalsales,
                totalSales1,salesPerDay1);

                        producttype = "laptop,";
                        totalsales = "Total sales for 7 days is EUR";
                        productNumber = 2;
                        productQuantity = 70;
                        productPrice = 149.8121;
                        days = 7;
                        totalSales1 = (double)productQuantity * productPrice;
                        salesPerDay1 = totalSales1 / days;
                        System.out.printf("Product No %d: %s \n" +
                        "%s %.2f, \n" +
                        "Sales by day is EUR %.2f. \n"  ,productNumber, producttype, totalsales,
                                totalSales1, salesPerDay1);




        }
}
