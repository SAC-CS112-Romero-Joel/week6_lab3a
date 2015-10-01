import java.util.Scanner;

public class lab3a {

	
	
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Scanner op =  new Scanner(System.in);
					
int computerNum;
int Num;

computerNum = 0 + (int) ( Math.random() * 10 );
			 
			 
System.out.println("Guess a Number between 1 and 10");
Num = input.nextInt();

if (Num < 0 || Num > 10)

{
	System.out.println("Badd enter number in Range!!");
}

 if ( computerNum < Num )
System.out.println("Your Number is to high");

else if ( computerNum > Num )
{
System.out.println("Your Number is to low ");
}
else if (computerNum == Num)  
{	
System.out.println("we got the Same Number you win "); 
}			 
System.out.println(" My Number Was : "+(computerNum));
        
    }

}
