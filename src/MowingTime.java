import java.util.Scanner;

public class MowingTime {
    public static void main(String[] args) {
        /*
        Creat a method that consolidates all the calculating so that all that is required
        is user input for variables.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter block length: ");
        int length_1 = scn.nextInt();
        System.out.println("Enter block width: ");
        int width_1 = scn.nextInt();
        System.out.println("Enter house length: ");
        int length_2 = scn.nextInt();
        System.out.println("Enter house width: ");
        int width_2 = scn.nextInt();

        mowing_job(length_1,width_1,length_2,width_2);

    }
    public static double mowing_job (double block_length, double block_width, double house_length, double house_width){
        double mowing_area = (block_length*block_width) - (house_length*house_width);
        double mowing_time = mowing_area/2;
        System.out.println("The mowing are is "+mowing_area+" and will take approximately "+mowing_time);

    return mowing_area;}
}
