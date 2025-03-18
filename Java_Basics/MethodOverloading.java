

static int addFunction(int a, int b) {
    return a + b;
}

static int addFunction(int a, int b, int c) {
    return a + b + c;
}

static double addFunction(double a, double b) {
    return a + b;
}

public static void main(String[] args) {
    System.out.println(addFunction(4, 5));
    System.out.println(addFunction(4, 5, 6));
    System.out.println(addFunction(1.2, 1.7));
}
