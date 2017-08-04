
package factorial;

import java.util.Scanner;

/**
 *
 * @jugal
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k=1;
        System.out.println("Enter Your Number:");
        Scanner val = new Scanner(System.in);
        i=val.nextInt();
        for(j=1;j<=i;j++){
            k=k*j;
        }
        System.out.println("The Factorial of " +j+ " is: "+k);
    }
}
