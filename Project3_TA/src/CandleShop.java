import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CandleShop {

    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("Project 3");
        System.out.println("*******************************");

        // Setup
        List<Candle> candleList = new ArrayList<Candle>();
        List<Integer> purchaseAmounts = new ArrayList<Integer>();
        Double totalPrice = 0.0;
        Double discountedPrice = 0.0;
        Integer totalBurnTime = 0;
        Integer counter = 96;
        Double costPerMinute;
        Scanner scan = new Scanner(System.in);

        System.out.println("There are 3 candle types, each with a name, type, price, and burn time. Please input the info for these candles");

        // Gather Candle info and add them to a list to hold them
        for (int i = 1; i <= 3; i++ ) {
            // Get the names of each candle
            System.out.printf("Please enter the name for candle %d: ", i);
            String name = scan.next();

            // Get the unique type number of each candle
            System.out.printf("Please enter the unique type number for candle %d: ", i);
            Integer type = scan.nextInt();
            for (Candle candle: candleList) {
                if (candle.getType() == type) {
                    System.out.println("Error! Duplicate Type Number");
                    System.exit(0);
                }
            }

            // Get the price of each candles
            System.out.printf("Please enter the price for candle %d: ", i);
            Integer price = scan.nextInt();

            // Get the burn time of each candle
            System.out.printf("Please enter the burn time for candle %d: ", i);
            Integer burnTime = scan.nextInt();

            // Use the data we just got and use it to create a candle object
            Candle candle = new Candle(name, type, price, burnTime);

            // Add the new Candle object to our list
            candleList.add(candle);

        }

        // Gather amount of each candle the customer would like to purchase
        for (int i = 0; i < candleList.size(); i++) {
            System.out.printf("Please enter the quantity the customer would like to buy of the %s candle: ", candleList.get(i).getName());
            Integer purchaseAmount = scan.nextInt();

            // Add purchase amount to list of amounts
            purchaseAmounts.add(purchaseAmount);
        }

        for (int i = 0; i < candleList.size(); i++) {
            totalPrice += candleList.get(i).getCost() * purchaseAmounts.get(i);
        }
        // System.out.printf("Total price is %.2f \n", totalPrice);

        // Conditionals for setting the discount for the purchase to the total price
        if (totalPrice > 20.0 && totalPrice <= 35.0) {
            discountedPrice = totalPrice - (totalPrice * 0.05);
        }
        if (totalPrice > 35.0 && totalPrice <= 55.0) {
            discountedPrice = totalPrice - (totalPrice * 0.07);
        }
        if (totalPrice > 55.0 && totalPrice <= 100.0) {
            discountedPrice = totalPrice - (totalPrice * 0.10);
        }
        if (totalPrice > 100.0) {
            discountedPrice = totalPrice - (totalPrice * 0.20);
        }

        // System.out.printf("Total price with discount is %.2f \n", discountedPrice);

        // Loop through our lists of Candles & Purchase Amounts to calculate the total burn time
        for (int i = 0; i < candleList.size(); i++) {
            totalBurnTime += candleList.get(i).getTime() * purchaseAmounts.get(i);
        }

        // System.out.printf("Total burn time is %d \n", totalBurnTime);
        
        // Calculate the total cost per minute of the candles
        costPerMinute = discountedPrice/totalBurnTime;

        // System.out.printf("Total cost per minute is %.2f", costPerMinute);

        String line = "@______________________________________________________________________________________________@";
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (int i = 0; i < candleList.size(); i++) {
            String candleLine = String.format("@ Candle Name: %s | Amount Purchased: %d | Candle Type: %d  ", candleList.get(i).getName(), purchaseAmounts.get(i), candleList.get(i).getType());
            System.out.printf("%-95s@\n", candleLine);
            System.out.println(line);
        }
        String priceLine = String.format("@ Total Price: $%.2f | Discounted Price: $%.2f", totalPrice, discountedPrice);
        System.out.printf("%-95s@\n", priceLine);
        System.out.println(line);
        String infoLine = String.format("@ Total Burn Time: %d Minutes | Cost Per Minute: $%.2f", totalBurnTime, costPerMinute);
        System.out.printf("%-95s@\n", infoLine);
        System.out.println(line);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");



    }//end main
}// end class
