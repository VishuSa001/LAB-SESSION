/* Question4:WAP to check the condition for checking the correct 
      password 
 @Author- Vishal Saini
 @Date- 6 Oct 2022   */

import java.util.*;

public class CheckPass {
    public static void main(String[] args) {
        System.out.println(" Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Welcome" + name + "enter your password and proceed");
        int password = sc.nextInt();
        // check password is correct or not
        if (password == 12345) {
            System.out.println("login");
        } else {
            System.out.println(" otherwise incorrect password");
        }

    }
}