/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 02/03/2022
 */

package main;

public class exceptionHandling {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        try {
            int sum = a / b;
            System.out.println(sum);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("ab crash hou kar dikha");
    }

}