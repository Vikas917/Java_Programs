//Constructor is a member function used to initialize object while creating it.
//Constructors have same name as that of class

package Java_Basics;


class MainEmployee {
    private int id;
    private String name;

    //Getter = returns the values
    public int getId() {
        return id;
    }
    //Setter = sets or modifies the values
    public void setId(int i) {
        id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    //Default Constructor
    public MainEmployee() {
        this.id = 1234;
        this.name = "John";
    }
    //Parametrized Constructor
//    public MainEmployee(int newId, String NewName) { // Constructor without 'this'
//        id = newId; // No conflict: 'id' (instance) and 'newId' (parameter)
//        name = NewName; // No conflict: 'name' (instance) and 'NewName' (parameter)
//    }
    //Where to use this & where to not
    // Constructor with 'this' to resolve conflict
    public MainEmployee(int id, String name) {
        this.id = id;       // 'this.id' (instance) vs 'id' (parameter)
        this.name = name;   // 'this.name' (instance) vs 'name' (parameter)
    }

    //Parametrized Constructor
    public MainEmployee(String NewName) {
        name = NewName;
    }

}
public class Constructors {
    public static void main(String[] args) {
        //Default Constructor
        MainEmployee john = new MainEmployee();
        System.out.println(john.getId());
        System.out.println(john.getName());

        //Parametrized Constructor
        MainEmployee harry = new MainEmployee(123,"Harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());

        MainEmployee alice = new MainEmployee("Alice");
        System.out.println(alice.getName());
        System.out.println(alice.getId());
    }
}
