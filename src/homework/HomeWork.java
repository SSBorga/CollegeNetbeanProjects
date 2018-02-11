/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author sudhi
 */
public class HomeWork {

    /**
     * @param <error>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter first integer ");
        int x = scn.nextInt();

        System.out.println("enter second integer ");
        int y = scn.nextInt();

        while (y > 0){
            int rem = x % y;
            x = y;
            y = rem;}
            System.out.println("The gcd " + x);

        }
        

    }


