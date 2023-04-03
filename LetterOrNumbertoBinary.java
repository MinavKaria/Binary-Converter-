mport java.util.*;
public class LetterOrNumberToBinary
{

    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Letter Or Number to convert it to Binary Number");
        String a= sc.next();
        char b= a.charAt(0);
       
        if(Character.isLetterOrDigit(b)==true)
        {
           if(Character.isDigit(b)==true)
            {
            int q=0;
            int c= Integer.parseInt(a);
            int d=c;
            int num=c;
            for(int i=0;i<=c;i++)
            {
               d=d/2;
               if(d>0)
               q++;
               else
               break;
            }
            
            for(int i=q;i>=0;i--)
            {  
                double square=Math.pow(2.0,i);
                 if((num-square)>=0 && num!=0  )
                {
                   System.out.print("1 ");
                   num=num%(int)square;
                   
                 }
                else
               {
                System.out.print("0 ");
               
                }
                
                
            }
                
            }
            
            
            
            
        
        else
        {
            int num1=(int)b;
            int num2=num1;
            int v=0;
            for(int i=0;i<=num1;i++)
            {
                num2=num2/2;
               if(num2>0)
               v++;
               else
               break;
            }
            System.out.print("0 ");
            for(int i=v;i>=0;i--)
            {  
                double square1=Math.pow(2.0,i);
                 if((num1-square1)>=0 && num1!=0  )
                {
                   System.out.print("1 ");
                   num1=num1%(int)square1;
                   
                 }
                else
               {
                System.out.print("0 ");
               
                }
                
                
            }
            
            
            
            
            
            
        }
    
    }
    else
    {
        System.out.println("Wrong choice! Try again");
        System.exit(0);
    }
}
}


            
