package week1.DSAexercise7FinancialForecasting;

import java.util.*;
public class forecastUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of previous years: ");
        int years = sc.nextInt();
        double[] sales = new double[years];
        System.out.println("Enter the sales for each year:");
        for (int i = 0; i < years; i++) {
            sales[i] = sc.nextDouble();
        }
        double forecast = forecastSales(sales, years);
        System.out.println("Forecasted sales for next year: " + forecast);
        sc.close();
    }

    public static double forecastSales(double[] sales, int years) {
        if (years == 1) {
            return sales[0];
        }
        return (sales[years - 1] + forecastSales(sales, years - 1)) / 2;  //Average of the last year and the forecast of the previous years
    }
}