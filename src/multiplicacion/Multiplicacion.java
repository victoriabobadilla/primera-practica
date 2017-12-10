/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Multiplicacion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int i=0,r=0;
        //System.out.println("LA TABLA DE MILTIPLICACIÓN");
        
        JOptionPane.showMessageDialog(null,"Ingrese Un Digito A Multiplicar:");
       // System.out.println("Ingrese Un Digito A Multiplicar:");
        int n=sc.nextInt();
        do
        {
            if(i==0)
            {
                r=0;
            }
            else
            {
                r=n+r;
            }
        //System.out.println(n+"*"+i+"="+r+"\n");
            JOptionPane.showMessageDialog(null,n+"*"+i+"="+r+"\n");
        i++;
            
        }
        while 
        (i<=12);   
       }        
            
    }
                    

        
    
    

