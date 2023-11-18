package opgaver.opg21;


public class opg21 {
    public static void main(String[] args) {
        CustomerDatabase customerDatabase = new CustomerDatabase();
        for(int i =0; i < 10; i++){
            Customer customer = new Customer("Customer " + i, i, 20000*i+200);
            customerDatabase.saveCustomer(customer);
        }

        customerDatabase.printCustomerValues();


    }
}
