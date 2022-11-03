package T_lab;
import java.util.Scanner;
public class Question_no_1 {

	public static void main(String[] args) {
		int age;
		char gen;
		System.out.println("Check the Rate fo intrest for you........");
		System.out.println("Enter the details.....");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the age:");
		age = scan.nextInt();
		System.out.println("Enter the gender [For Male(m);Female(f);Transegender(t):]");
		gen = scan.next().charAt(0);
		
		if(gen == 't') {
			System.out.println("The rate of intrest for you by RBI is:8.0");
		}
		else if (age>=60) {
			if(gen == 'm'){
				System.out.println("The rate of intrest for you by RBI is : 7.0");
			}
			else if(gen == 'f'){
				System.out.println("The rate of intrest for you by RBI is : 7.5");
			}
		}
		else if(age < 60) {
			System.out.println("The rate of intrest for you by RBI is:5.0");
		}
	}
}
