/*Program: Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
@author: Vishal Saini
@date: 29 september 2022
*/

import java.util.Scanner;

class Calculations {

    public static void main(String[] args) {

        int add, sub, mul, div, mod;
        // creating Scanner class
        Scanner sc = new Scanner(System.in);
        // taking input value from user
        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("enter second number");
        int num2 = sc.nextInt();
        // taking value for operator
        System.out.println("enter any number 1,2,3,4");
        int op = sc.nextInt();

        // using if-else-if ladder Statement
        if (op == 1) { // prees 1 to addition
            add = num1 + num2;
            System.out.println("Addition is:" + add);
        } else if (op == 2) {// press 2 Substraction
            sub = num1 - num2;
            System.out.println("Substrction is:" + sub);
        } else if (op == 3) {// press 3 Multiplication
            mul = num1 * num2;
            System.out.println("Multiplication is:" + mul);
        } else if (op == 4) {// press 4 Division
            div = num1 / num2;
            System.out.println("divion is:" + div);
        } else { // otherwise invalid
            System.out.println("invalid number");
        }

    }
}