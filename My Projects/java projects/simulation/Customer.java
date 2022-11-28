package simulation;


	public class Customer implements SBI{
		int balance=0;
		@Override
		public void deposit(int amount){
			
			System.out.println(amount +"  Rupees is Deposited  Successfully.. ." );
			balance += amount;
			System.out.println("-----------------------------------------------");
		}
		@Override
		public void withdraw(int amount) {
			System.out.println("Amount  of  " + amount+"  is Withdrawn Successfully...");
			balance -= amount;
			System.out.println("----------------------------------------------------------");
		}
		@Override
		public void checkBalance() {
			System.out.println("Available Balance  is : "+ balance+"Rupees.");
			System.out.println("------------------------------------------------------");
		}
		
		
	}


