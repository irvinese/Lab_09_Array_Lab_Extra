import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int [] dataPoints = new int[100];
        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; ++i){
            dataPoints[i] = rnd.nextInt(100) +1;
            }
        for (int i = 0; i < dataPoints.length; i++){
            System.out.printf(dataPoints[i] + "|");
        }
        System.out.println("");

        int sum = 0;
        int average = 0;
        for(int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        average = (sum / dataPoints.length);
        System.out.println("The average of the random array of dataPoints is: " + average );
        System.out.println("The total sum of the random array of dataPoints is: " + sum);

       Scanner pipe = new Scanner(System.in);
        int searchNumber = input.getRangedInt(pipe, "Enter a number between one and one hundred", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++){
            if( dataPoints[i] == searchNumber){
                found = true;
                System.out.printf("%n%d exsist at index %d", searchNumber, i);
                break;
            }
        }
        if(found){
            System.out.printf("%n%d exsist in the array", searchNumber);
        }else{
            System.out.printf("%n%d does not exsist in the array", searchNumber);
        }
        System.out.println(" ");

        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] > maxNumber){
                maxNumber = dataPoints[i];
            }
        }
        System.out.println("");
        System.out.println("The maximum number in this array is:" + maxNumber);

        int minimumNumber = Integer.MAX_VALUE;
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] < minimumNumber){
                minimumNumber = dataPoints[i];
            }
        }
        System.out.println("");
        System.out.println("The minimum number in this array is:" + minimumNumber);
        System.out.println("");

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));






        int findNumber = input.getRangedInt(pipe, "Enter another number between one and one hundred", 1, 100);
        int count = 0;
        for(int i = 0; i < dataPoints.length; i++){
            if(i == findNumber){
                count++;
            }else{
                System.out.println(findNumber + " is found " + count + " time(s)");
                count = dataPoints[i];
                findNumber = i;
                break;
            }
        }







    }
    public static double getAverage(int values[])
    {
        double getAverage = 0;
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        getAverage = (sum / values.length);
        return getAverage;
    }
}
