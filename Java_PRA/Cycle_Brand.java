/*
Write a Java code that implements the following:

Create a class Customer with following:

1.Attributes

customerid: Integer
customerName: String
noofcycles: Integer
Cycle: List of Cycles for the Customer,

2. Getters and Setters Methods
3.Parameterized constructor

Create a class Cycle with following:

1.Attributes

cycleld Integer
cycleName. String
price Integer

2 Getters and Setters Methods
3.Parameterized constructor

Relationship

Each Customer can have multiple Cycle objects.

Create a class Service with following methods

1.Calculate TotalPriceByCycleName:

This method will take a list of Customer objects and a cycleName as input. This method calculates and Prints the total price
by cycleName. If no Cycle is found the method should print a message "No cycle found with mentioned name." (Without quotes)
You need to throw an custom based exception in case of, if the Price of a cycle is negative. The method should throw an
exception called PriceisNegativeException which includes a message "Invalid Price: Price cannot be negative." (without quotes).

2.findCustomerNames Of CyclesByPrice:

This method will take a list of Customer objects and integer parameter price. Method should print the list of all the Customers
Names who have purchased cycle/cycles where their cycle price is greater than the price mentioned, (refer The output)
If no match is found then method should print the message "No matching customers found."(Without quotes)

Create a class Tester

1. Take inputs
2. Create Object of Service class to call the methods
Refer the sample input and output.

Sample Input:

3 -->No Of Customers
1001-->Customer id for First Customer
Customer 1-->name of First Customer
2>No of Cycles purchased by the First
101-->id of 1st order
Zeeta-->Cycle name
12000-->price of the Cycle
102-->id of the 2nd order
Voltic-->Cycle name
2500-->price of the Cycle
1002-->Customer id for second Customer
Customer2-->name of the Second Customer
1--> No of Cycles purchased by the Second Customer
201-->id of 1 st order
Zeeta-->Cycle name
3000-->price of the Cycle
1003--> Customer id for First Customer
Customer3-->Name of Third Customer
2-->No of Cycles purchased by the Third
301 ->id of 1st order
ZeetaLX-->Cycle name
1200-->price of the Cycle
302-->id of the 2nd order
VolticLX-->Cycle name
2500→price of the Cycle
Zeeta-->Cycle NameInput
3000-->Integer Input Price
String Input to find total price


Sample output:

15000
Customer1

Explanation:

The first line of output is total price of the cycles of the given cycle name
The following line(s) is/are the list of name/names of the customer(s) who have purchased a cycle more than the given input price

 */


package Java_PRA;
import java.util.*;

public class Cycle_Brand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            int custId = sc.nextInt();sc.nextLine();
            String custName = sc.nextLine();
            int noOfCycles = sc.nextInt();sc.nextLine();

            List<Cycle> cycles = new ArrayList<>();
            for(int j=0;j<noOfCycles;j++) {
                int cycleId = sc.nextInt();sc.nextLine();
                String cycleName = sc.nextLine();
                int price = sc.nextInt();sc.nextLine();

                cycles.add(new Cycle(cycleId, cycleName, price));
            }
            customers.add(new Customer(custId, custName, noOfCycles, cycles));
        }
        String cycleName = sc.nextLine();
        int price = sc.nextInt();

        Service service = new Service();

        try{
            int ans = service.TotalPriceByCyclename(customers, cycleName);
            if(ans > 0) {
                System.out.println(ans);
            }
            else {
                System.out.println("No cycle found with mentioned name.");
            }
        }
        catch(PriceisNegativeException e) {
            System.out.println(e.getMessage());
        }

        List<String> custList = service.findCustomerNamesOfCycleByPrice(customers, price);
        if (custList.isEmpty()) {
            System.out.println("No matching customers found.");
        }
        else {
            for(String s : custList) {
                System.out.println(s);
            }
        }
    }
}
class Customer {
    int custId, noOfCycles;
    String custName;
    List<Cycle> cycle;

    public Customer(int custId, String custName, int noOfCycles, List<Cycle> cycle) {
        this.custId = custId;
        this.custName = custName;
        this.noOfCycles = noOfCycles;
        this.cycle = cycle;
    }

    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public int getNoOfCycles() {
        return noOfCycles;
    }
    public List<Cycle> getCycle() {
        return cycle;
    }
}

class Cycle {
    int cycleId, price;
    String cycleName;

    public Cycle(int cycleId, String cycleName, int price) {
        this.cycleId = cycleId;
        this.cycleName = cycleName;
        this.price = price;
    }

    public int getCycleId() {
        return cycleId;
    }
    public String getCycleName() {
        return cycleName;
    }
    public int getPrice() {
        return price;
    }
}

class Service {
    public int TotalPriceByCyclename(List<Customer> customers, String cycleName) throws PriceisNegativeException {
        int total = 0;
        for(Customer customer : customers) {
            for(Cycle cycle : customer.getCycle()) {
                if(cycle.getCycleName().equalsIgnoreCase(cycleName)) {
                    if(cycle.getPrice() < 0) {
                        throw new PriceisNegativeException("Invalid Price: Price cannot be negative.");
                    }
                    else {
                        total += cycle.getPrice();
                        break;
                    }
                }
            }
        }

        return total;
    }

    public List<String> findCustomerNamesOfCycleByPrice(List<Customer> customers, int price) {
        List<String> result = new ArrayList<>();
        for(Customer customer : customers) {
            for(Cycle cycle : customer.getCycle()) {
                if(cycle.getPrice() > price) {
                    result.add(customer.getCustName());
                    break;
                }
            }
        }

        return result;
    }
}

class PriceisNegativeException extends Exception {
    public PriceisNegativeException(String message) {
        super(message);
    }
}
