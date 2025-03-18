package Java_Basics;

class MyEmployee {
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
}


public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        //emp.id;
        //emp.name; // This will generate error because both id & name are private
        //To resolve this error we will make getter & setter methods to access private attributes

        System.out.println(emp.getId());//No value is set so returns 0
        emp.setId(123);//Setting the values
        System.out.println(emp.getId());
        //  2 methods to get Ids
        int ids = emp.getId();
        System.out.println(ids);

        System.out.println(emp.getName());//No value is set so returns null
        emp.setName("John");
        System.out.println(emp.getName());

        emp.setId(27386);
        System.out.println(emp.getId());
    }
}
