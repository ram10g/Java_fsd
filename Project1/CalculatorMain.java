package Calculator;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice for calculation:");
		System.out.println("1. Addition");
		System.out.println("2. Subraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulo");
		int choice=sc.nextInt();
		System.out.println("Enter first no. for the calculation");
		int first=sc.nextInt();
		System.out.println("Enter second no. for the calculation");
		int second=sc.nextInt();
		CalculatorDef obj=new CalculatorDef();
		switch(choice)
		{
		case 1:
			System.out.println(obj.addition(first, second));
			break;
		case 2:
			System.out.println(obj.subraction(first, second));
			break;
		case 3:
			System.out.println(obj.multiplication(first, second));
			break;
		case 4:
			System.out.println(obj.division(first, second));
			break;
		case 5:
			System.out.println(obj.modulo(first, second));
			break;
		default:
			System.out.println("Error! Enter correct operator");
			
		}
	}

}
