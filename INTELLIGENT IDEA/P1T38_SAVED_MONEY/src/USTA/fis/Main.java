package USTA.fis;
/* Author: Juan Felipe Villanueva Arias
Date: 25-march-2021
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	p_show_info_program();
	int v_total_saved=0;
        for (int i=1; i<=12; i=i +1){
            System.out.println("---month"+i+"---");
            v_total_saved = v_total_saved+ p_user_saved_money();
        }
              {
            
        }
        System.out.println("the total money saved is"+v_total_saved+"");
    }
    public static void p_show_info_program(){
        //Description: This method show info program (software)
        System.out.println("Author: Juan Felipe Villanueva Arias");
        System.out.println("Date: 25-march-2021");
    }
public static int p_user_saved_money (){
Scanner keyboard = new Scanner(System.in);
int v_saved_money = keyboard.nextInt();
while (v_saved_money<0){
    System.err.println("ERR: you saved money that is a negative number please put again");
    v_saved_money=keyboard.nextInt();
}
    return v_saved_money;
}
}
