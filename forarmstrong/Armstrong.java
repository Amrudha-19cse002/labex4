/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forarmstrong;
import java.util.*;
/**
 *
 * @author Desktop Pc
 */
public class Armstrong {
         public void Armstrong()
    {
       
        int n,x,r,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to check it is armstrong:");
        n=obj.nextInt();
        x=n;
        while(x!=0)
        {
            r=x%10;
            s=s+(r*r*r);
            x=x/10;
        }
        if(s==n)
            System.out.println(n+" is an armstrong number");
        else
            System.out.println(n+" is not an armstrong number");
    
    }
    
}

    



    
