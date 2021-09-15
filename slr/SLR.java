/*
 *  Alejandro A. Manzano Carcamo.
    13/09/21
    Simple Linear Regression
 */
package slr;

import java.util.Scanner;

public class SLR {

    public static void main(String[] args) {

        //Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of <x>: ");
        double x= scan.nextDouble();
        
        //Implement "Data" class with input as parameter
        Data slr = new Data(x);
        
        slr.Data();
    }
    
    
}
