/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *
 * @author acena2028
 */
public class NumberFormatPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1: Percentage of Girls and Boys
        // create a Scanner object
        Scanner scan = new Scanner(System.in);
        // get the percent instance
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        // Ask user for number of students at a school
        System.out.print("Total number of students: ");
        int students = scan.nextInt();
        // Ask user for number of girls at that school, calculate percentage with number formatting
        System.out.print("Number of female students: ");
        int girls = scan.nextInt();
        String pctgirls = fmt1.format((double) girls / students);
        // calculate number of boys at that school
        int boys = students - girls;
        String pctboys = fmt1.format((double) boys / students);
        // Use Number formatting to output % of girls and % of boys at that school
        System.out.println("The school with " + students + " students is " + pctgirls + " girls and " + pctboys + " boys\n");
        
        
        // 2: Converting Currencies
        // Ask user for amount of money in US dollars and cents
        System.out.print("Total amount of USD (dollars.cents): $");
        double totalUSD = scan.nextDouble();
        // use conversion rates to find total GBP and EUR
        double totalGPB = totalUSD * 0.76;
        double totalEUR = totalUSD * 0.89;
        // get currency instance for British Pounds and Euros locales
        NumberFormat gbpFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat eurFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // print currency equivalents, including conversion rates
        System.out.println("In British Pounds (0.76 pence = $1): " + gbpFormat.format(totalGPB));
        System.out.println("In Euros (89 eCents = $1): " + eurFormat.format(totalEUR) + "\n");
        
        
        // 3: Decimal Places of Pi
        // Ask user for an integer value from 0 to 15
        System.out.print("Integer from 0-15: ");
        int places = scan.nextInt();
        // Print pi with user-defined number of decimal places
        System.out.print("Pi with " + places + " decimal points: ");
        System.out.printf("%." + places + "f", Math.PI);
        
        
        // 4: Random Large Number
        // create random object
        Random random = new Random();
        double min = 100_000_000;
        double max = 999e18;
        // generate random number from 100,000,000 to 999e18
        double result = 100_000_000 + (random.nextDouble() * (max - min));
        // define DecimalFormat
        DecimalFormat df = new DecimalFormat("#,###");
        // Print generated number
        System.out.print("\n\n" + df.format(result));
    }
    
}