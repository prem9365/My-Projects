package simulation;

import java.util.Scanner;

public class ATMSimulation {
	public static void main(String[] args) {
		SBI cust =new Customer ();
		Scanner scan = new Scanner (System.in);
//		System.out.println("PRESS  (ON)  FOR START THE ATM MACHINE \t  PRESS (OFF) TO SWITCH OFF THE MACHINE");
//          String decision =scan.next();
//          
//          if(decision=="on"){
		while(true) {
			
			System.out.println(" *************** WELL  COME   TO   SBI  ATM ************");
			System.out.println("=========================================================");
			
			System.out.println("**      Press :-> 1  for Deposit an Amount             **");
			System.out.println("**      Press :-> 2  for Withdarw an Amount            **");
			System.out.println("**      Press :-> 3  for Check Available Balance       **");
			System.out.println("**      Press :-> 4  for End Operation                 **");
		    System.out.println("=========================================================");
			
			
			System.out.println("                 Select the CHOICE");
			 int choice = scan.nextInt();
			
			 System.out.println("---------------------------------------------------------");
			switch(choice){
			
			case 1:
				System.out.println("Enter the Amount to be Deposit...");
				System.out.println("give  confirmation");
				int confirm = scan.nextInt();
				if(confirm==1){
				 int amount = scan.nextInt();
				cust.deposit(amount);
				}
				else{
					
				}
				
					break;
			case 2 :
				System.out.println("Enter  the Amount to be Withdraw...");
				int amount1 = scan.nextInt();
					cust.withdraw(amount1);
					break;
			
			case  3 :
				 cust.checkBalance();
				 
				 break;
				
			case  4 :
				System.out.println( "               ******  THANK  YOU  ******");
			    System.exit(0);
			       
			default :
				System.out.println(" INVALID  CHOICE... !!");
			
			}
			
		
		 System.out.println("                           ***                          ");
	
		}
          }
//         else if(decision=="off"){
//        	  System.out.println("*******    GUD  BYEE   *********");
//       	  System.exit(0);
//         }
		
		
	}

   //}
