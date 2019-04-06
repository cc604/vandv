/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitvandv;

import java.util.Scanner;

/**
 *
 * @author Sonia
 */
public class GitVandV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("checking out Git version control");
        System.out.println("Making changes to the class");
        System.out.println("new branch");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers to sum");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("The sum is " + (a + b));
        
    }
    
}
