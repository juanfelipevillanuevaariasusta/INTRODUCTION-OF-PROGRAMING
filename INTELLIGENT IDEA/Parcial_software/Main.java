package USTA.fis;
/* Autor: Juan Felipe Villanueva Arias
Date: 25-march-2021
Description: This software calculate the time (t=d/v)) between two cycles
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Calculate time = Distance / Velocity
        p_show_info_program();
        float v_time=0;
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time=v_distance/v_velocity;
        System.out.println("The time between two cities is "+v_time+" hours");
    }
    public static void p_show_info_program () {
//Description: This method show info program (software)
        System.out.println("Soft calculate time");
        System.out.println("maker: Juan Felipe Villanueva");
        System.out.println("Date: 25-march-2021");
    }
    public static int p_user_distance (){
        //This method return the distance than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the distance (km) between two cities");
        int v_distance = keyboard.nextInt();
        while (v_distance<0){
            System.err.println("ERR: The distance should be greater than zero, imput again the number");
        v_distance=keyboard.nextInt();
        }
        return v_distance;
    }
public static int p_user_velocity (){
        //Description: This method return the velocity than user input
    Scanner keyboard = new Scanner(System.in);
    System.out.println("input/type the constant velocity (km/H) between two cycles");
    int v_velocity =keyboard.nextInt();
    while (v_velocity==0){
    System.err.println("Err: the velocity cannot be same zero, imput again the velocity (KM/H)" );
    v_velocity =keyboard.nextInt();
    }
    return v_velocity;
}
}

