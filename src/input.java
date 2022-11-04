import java.util.Scanner;
public class input {
    public static double getAverage(int values[])
    {
        int getAverage = 0;
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        getAverage = (sum / values.length);
        System.out.println("The average of the values is: " + getAverage);
        return 0;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }
}
