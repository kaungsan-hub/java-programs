import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
    public static void main(String[]args){
        System.out.println("Please Your Budget?");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> percentage = new ArrayList<Double>();
        System.out.println("Enter your percentage of expense");
        do{
            System.out.println("Your percentage of expense is " + (i+1) + ":");
            double value = scan.nextDouble();
            percentage.add(value);
            sum += percentage.get(i);
            i++;
        }while(sum <= 100);
        scan.close();
        if(sum>100){
            double cumulativeSum = 0.0;
            for (int j=0; j<percentage.size() -1; j++){
                cumulativeSum += percentage.get(j);
            }
            percentage.set(percentage.size()-1, 100.0 - cumulativeSum);
        }
        for(double value : percentage){
            double expense = value * total / 100.0;
            System.out.println("Your "+value+"% equals $"+expense);
        }
    }
}
