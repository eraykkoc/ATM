import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int balance = 1000 , input,amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, Welcome to ErayBank ");
		System.out.println("Your current balance is : " + balance + " USD");
		
		while(balance > 0) {
			System.out.println();
			System.out.println("1: Deposit Money");
			System.out.println("2: Withdraw Money");
			System.out.println("3: Balance Inquiry");
			System.out.println("4: Exit");
			System.out.println();
			System.out.print("Please select the transaction : ");
			input = scan.nextInt();
			
			if(input == 1 ){
				System.out.print("Please enter the amount of money that you want to deposit : ");
				amount = scan.nextInt();
				balance += amount;
			}else if(input == 2 ) {
				System.out.print("Please enter the amount of money that you want to withdraw : ");
				amount = scan.nextInt();
				if (amount > balance){
					System.out.println();
					System.out.println("Insufficient balance");
				}else{
					balance -= amount ;
				}
			}else if(input == 3){
				System.out.println();
				System.out.println("Your current balance : " + balance + " USD");
			}else if(input == 4){
				System.out.println();
				System.out.println("Exiting...");
				break;
			}else{
				System.out.println();
				System.out.println ("Invalid transaction");
			}
			}
		System.out.println();
		System.out.println("Thank you for using ErayBank");
}
}
