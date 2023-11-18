package opgaver.opg21;

public class CustomerDatabase {
    Customer[] customers;

    public CustomerDatabase() {
        this.customers = new Customer[10];
    }

    public int CountCustomers() {
        return this.customers.length;
    }

    public void removeCustomers(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].id == id) {
                customers[i] = null;
            }
        }
    }
    public boolean saveCustomer(Customer customer) {
        for(int i = 0; i < customers.length; i++) {
            if(customers[i] == null) {
                customers[i] = customer;
                return true;
            }
        }
        return false;
    }

    public Customer[] getCustomers() {
        return this.customers.clone();
    }


    public void printAllCustomerNames() {
        for(Customer c: this.customers) {
            if(c != null) {
                System.out.println(c.name);
            } else {
                System.out.println("null");
            }
        }
    }


    public void printCustomerValues() {
        for(Customer c : this.customers) {
            if(c != null) {
                System.out.println("Name: " + c.name + " ID: " + c.id + " Balance: " + c.balance);
            } else {
                System.out.println("Null value");
            }
        }
    }
}
