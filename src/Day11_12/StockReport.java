package Day11_12;

import java.util.Scanner;

public class StockReport {


    static String stockName;
    static int stockPrice;
    static int stockQuantity;

    public StockReport(String stockName, int stockPrice, int stockQuantity) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockQuantity = stockQuantity;
    }

    public String toString() {
        return "stock report is as follows" + "\nstock name " + stockName + "\nstock price " + stockPrice + "\nquantity " + stockQuantity + "\ntotal value " + (stockPrice * stockQuantity) + " " + "\n";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter stock name");
        stockName = sc.next();

        System.out.println("enter stock price");
        stockPrice = sc.nextInt();

        System.out.println("enter stock quantity");
        stockQuantity = sc.nextInt();

        StockReport stock = new StockReport(stockName, stockPrice, stockQuantity);
        System.out.println(stock.toString());

    }
}