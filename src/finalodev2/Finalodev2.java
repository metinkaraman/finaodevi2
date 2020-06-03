
package finalodev2;

import java.util.Scanner;

public class Finalodev2 
{
  public static void main(String[] args)
    {  
        int sayi;
        Scanner girdi=new Scanner(System.in);
        
        System.out.print("Girdiğiniz sayının faktöriyel ve fibonacci değeri...:");        
        sayi=girdi.nextInt();
        System.out.println("fibonacci değeri...:"+fibonacci(sayi));
        System.out.println("faktöriyel değeri...:"+faktoriyel(sayi));
    }
       static int fibonacci(int x)           
    {
       if(x<=1)                                       
           return x;			  
       else				
           return fibonacci(x-1)+fibonacci(x-2);    
    }
      static int faktoriyel (int sayi)            
      	{
		if(sayi==1  ||  sayi==0)     
		{
		return 1;                              
		}
		else                        
		{
		return sayi*faktoriyel(sayi-1);    
		}
        }
  }
    
