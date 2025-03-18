package Java_Basics;

public class Functions {
    //Syntax - ReturnType FunctionName (type arg1, arg2)

    //First Function
    public static void HelloFunction(){ 
        System.out.println("Hello from a void Function");
        return; // In void there is no need
    }
    //Second Function
    public static void StringFunction(String name){
        System.out.println("Hello " + name);
    }
    //Third Function
    public static int IntegerFunction(int x){
        return x*x;
    }
    //Fourth Function
    public static void AverageFunction(int x,int y, int z){
        double avg = (double) (x + y + z) /3;
        System.out.println(avg);
        return; // No need for it in void
    }
    //Fifth Function
    public static Double FloatFunction(double d,double e){
        return (Double) (d+e);
    }
    public static void main(String[] args) {
        HelloFunction(); //First Function
        
        StringFunction("Vikas"); //Second Function

        int y = IntegerFunction(4); //Third Function
        System.out.println(y);       

        System.out.println(FloatFunction(2.4, 4.6));

        AverageFunction(7, 4, 9);
    }
}
