/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forarithmetic;
import java.util.*;

/**
 *
 * @author Desktop Pc
 */
public class Arithmetic {
        public void Arithmetic()
    {
          int x,y;
          
          Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=obj.nextInt();
        System.out.println("Enter the value of y:");
        y=obj.nextInt();
        System.out.println("Arithmetic operations:");
         System.out.println("ADDITION");
         int add=x+y;
        System.out.println("The sum of two numbers:"+add);
         System.out.println("SUBTRACTION");
         int sub=x-y;
        System.out.println("The difference of two numbers:"+sub);
         System.out.println("MULTIPLICATION");
         int mul=x*y;
        System.out.println("The product of two numbers:"+mul);
         System.out.println("DIVISION");
          int div=x/y;
        System.out.println("The division of two numbers:"+div);
        
    }
  }



    
    

