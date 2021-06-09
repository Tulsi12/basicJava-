package alog;
import java.util.Scanner;

public class Alog {
	public int sum(int x,int y) {
        return x + y;
    }
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public int mul(int x, int y) {
		return x*y;
		}
	public int div(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		Alog obj = new Alog();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the word: \n "
			  + "a for addition \n"
              + "s for Subtraction \n"
              + "m for Multiplication \n"
              + "d for Division \n"
              + "x for exit \n" );
			
			String word = input.nextLine();
			if(word.equals("a")) {
				System.out.println("Enter two number:");
				int a= input.nextInt();
				int b= input.nextInt();
				int sum = a+b;
				System.out.println(sum);
                break;
			}
			
			else if(word.equals("s")) {
				System.out.println("Enter two number:");
				int a= input.nextInt();
				int b= input.nextInt();
				int sub = a+b;
				System.out.println(sub);
               // break;	
			}
			
			else if(word.equals("m")) {
				System.out.println("Enter two number:");
				int a= input.nextInt();
				int b= input.nextInt();
				int mul = a*b;
				System.out.println(mul);
               // break;	
			}
			
			else if(word.equals("d")) {
				System.out.println("Enter two number:");
				int a= input.nextInt();
				int b= input.nextInt();
				double div = a/b;
				System.out.println(div);
                //break;	
			}
			
			else if (word.equals("x"))
            {
                System.out.println("Exit");
                break;
            }
            
			else {
	            System.out.println("Invalid input");
	        }
			
		}
		
		
	}
	
}
