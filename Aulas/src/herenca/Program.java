package herenca;

public class Program {
	
	public static void main (String args[]) {
		
		Account acc = new Account(001, "Felipe", 0.0);
		BusssinesAccount bacc = new BusssinesAccount(002, "Maria", 1000.0, 500.0);
		
		// UPCASTING
		
		Account acc0 = bacc;
		Account acc1 = new BusssinesAccount(003, "Teteu", 0.0, 500.0);
		Account acc2 = new SavingAccount(004, "Xueu", 0.0, 0.01);
		acc0.saque(200);
		System.out.println(acc0.getSaldo());
		
		
		
		// DOWNCAST
		
		//SavingAccount sacc1 = (SavingAccount)acc2;
	
		if(acc2 instanceof BusssinesAccount) {
			BusssinesAccount bacc1 = (BusssinesAccount)acc2;
		}
		
		if(acc2 instanceof SavingAccount) {
			SavingAccount bacc1 = (SavingAccount)acc2;
			System.out.println("Update");
		}
		
	
	}
}
