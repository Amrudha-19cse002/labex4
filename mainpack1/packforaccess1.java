/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainpack1;

/**
 *
 * @author Desktop Pc
 */
import pack1.*;
import pack1.subpack1.*;
import pack2.*;
import pack2.subpack2.*;

public class packforaccess1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ACCESSING PACKAGE-1
        no1 obj1=new no1();
        obj1.display1();
        no2 obj2=new no2();
        obj2.display2();
        
        //ACCESSING SUBPACKAGE-1 IN PACKAGE-1
        no3 obj3=new no3();
        obj3.display3();
        no4 obj4=new no4();
        obj4.display4();
        
        //ACCESSING PACKAGE-2
        no5 obj5=new no5();
        obj5.display5();
        no6 obj6=new no6();
        obj6.display6();
        
        //ACCESSING SUBPACKAGE-2 IN PACKAGAE-2
        no7 obj7=new no7();
        obj7.display7();
        no8 obj8=new no8();
        obj8.display8();
  }

  }
    

