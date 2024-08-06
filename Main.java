package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new SqlDatabaseManager();
		customerManager.getCustomer();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomer();

	}

}
