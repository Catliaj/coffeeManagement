package cofeeshop;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		cofeeItems items = new cofeeItems();
		transaction transact = new transaction();
		Scanner scanner = new Scanner(System.in);
		String next;
		int userInput,chooseSizeOfCup, incrementQuantity = 0;
		
		do
		{
			items.menu();
			System.out.println("What is your order??");
			userInput = scanner.nextInt();
			
			switch (userInput)
			{
				case 1:
					items.setName("Mocha");
					items.sizeCupSelection();
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
				    chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(105);
					break;
				case 2:
					items.setName("Americano");
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
					chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(95);
					break;
				case 3:
					items.setName("Brewed");
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
					chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(100);
					break;
				case 4:
					items.setName("Hazelnut");
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
					chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(125);
					break;
				case 5:
					items.setName("Vanilla");
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
					chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(135);
					break;
				case 6:
					items.setName("Caramel");
					System.out.println("What size of cup?");
					System.out.print("Enter: ");
					chooseSizeOfCup = scanner.nextInt();
					items.sizeCup(chooseSizeOfCup);
					transact.setPrice(150);
					break;
				default:
					System.out.println("Not in the Choices");
					break;
			}
			scanner.nextLine();
			incrementQuantity++;
			System.out.println("do you want to add order? \n press \"y\" for yes and \"n\" for no");
			next = scanner.nextLine();
			
			
		}while(!next.equals("n"));
		
		
		
	}
}
