package Com.Epam.Calculator;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		int a = 0;
		int b = 0;
		Calculator calci = new Calculator();
		System.out.println("1.ADD(+)");
	    System.out.println("2.SUB(-)");
	    System.out.println("3.MUL(*)");
	    System.out.println("4.DIV(/)");
	    while(true){
   	     System.out.println("SELECT OPTION");
   	     Scanner sc= new Scanner(System.in);
   	     int options = sc.nextInt();
   	     if(options == 5){
   	    	 System.out.println("Thank you");
   	    	 break;
   	     }
   	     if ((options < 1) || (options > 5)) throw new Exception("please enter value");
   	     System.out.println("enter number a");
   	     a = sc.nextInt();
   	     System.out.println("enter number b");
   	     b = sc.nextInt(); 
   	     int [] operations = {calci.add(a,b),calci.sub(a,b),calci.mul(a,b),calci.div(a,b)};  
   	     System.out.println(operations[options-1]);
	    }
	}
}
