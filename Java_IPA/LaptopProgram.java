package Java_IPA;

//import java.util.*;
//
//public class LaptopProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Laptop[] arr = new Laptop[4];
//
//        // Input for Laptop objects
//        for (int i = 0; i < arr.length; i++) {
//            int lid = sc.nextInt();
//            sc.nextLine(); // Consume newline
//            String brand = sc.nextLine();
//            String ost = sc.nextLine();
//            double price = sc.nextDouble();
//            int rating = sc.nextInt();
//            arr[i] = new Laptop(lid, brand, ost, price, rating);
//        }
//
//        // Input for brand and OS
//        sc.nextLine(); // Consume newline
//        String br = sc.nextLine();
//        String os = sc.nextLine();
//
//        int ans = countLaptops(arr, br);
//        if (ans > 0) {
//            System.out.println(ans);
//        } else {
//            System.out.println("The given brand is not available");
//        }
//
//        int[] res = searchLaptops(arr, os);
//        if (res != null) {
//            for (int i = res.length - 1; i >= 0; i--) {
//                System.out.println(res[i]);
//            }
//        } else {
//            System.out.println("The given OS is not available");
//        }
//
//        sc.close();
//    }
//
//    public static int countLaptops(Laptop[] arr, String br) {
//        int c = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getBrand().equalsIgnoreCase(br) && arr[i].getRating() > 3) {
//                c++;
//            }
//        }
//        return c > 0 ? c : 0;
//    }
//
//    public static int[] searchLaptops(Laptop[] arr, String os) {
//        int[] lps = new int[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getOst().equalsIgnoreCase(os)) {
//                lps = Arrays.copyOf(lps, lps.length + 1); // Resize array by one each time
//                lps[lps.length - 1] = arr[i].getLid(); // Add matching laptop ID
//            }
//        }
//        Arrays.sort(lps); // Sort array once after the loop completes
//        return lps.length > 0 ? lps : null;
//    }
//}
//
//class Laptop {
//    int lid;
//    String brand;
//    String ost;
//    double price;
//    int rating;
//
//    public Laptop(int lid, String brand, String ost, double price, int rating) {
//        this.lid = lid;
//        this.brand = brand;
//        this.ost = ost;
//        this.price = price;
//        this.rating = rating;
//    }
//
//    public int getLid() {
//        return lid;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getOst() {
//        return ost;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//}

//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Laptop {
//    private int laptopId;
//    private String brand;
//    private String osType;
//    private double price;
//    private int rating;
//
//    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
//        this.laptopId = laptopId;
//        this.brand = brand;
//        this.osType = osType;
//        this.price = price;
//        this.rating = rating;
//    }
//
//    public int getLaptopId() {
//        return laptopId;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getOsType() {
//        return osType;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//}
//
//class LaptopProgram {
//    public static int countOfLaptopsByBrand(Laptop[] laptops, String brand) {
//        int count = 0;
//        for (Laptop laptop : laptops) {
//            if (laptop.getBrand().equalsIgnoreCase(brand) && laptop.getRating() > 3) {
//                count++;
//            }
//        }
//        return count > 0 ? count : 0;
//    }
//
//    public static Laptop[] searchLaptopByOsType(Laptop[] laptops, String osType) {
//        ArrayList<Laptop> matchingLaptops = new ArrayList<>();
//        for (Laptop laptop : laptops) {
//            if (laptop.getOsType().equalsIgnoreCase(osType)) {
//                matchingLaptops.add(laptop);
//            }
//        }
//        if (matchingLaptops.isEmpty()) {
//            return null;
//        }
//
//        matchingLaptops.sort((a, b) -> b.getLaptopId() - a.getLaptopId());
//        return matchingLaptops.toArray(new Laptop[0]);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Laptop[] laptops = new Laptop[4];
//        for (int i = 0; i < 4; i++) {
//            int laptopId = scanner.nextInt();
//            scanner.nextLine(); // consume newline
//            String brand = scanner.nextLine();
//            String osType = scanner.nextLine();
//            double price = scanner.nextDouble();
//            int rating = scanner.nextInt();
//            laptops[i] = new Laptop(laptopId, brand, osType, price, rating);
//        }
//
//        scanner.nextLine(); // consume newline
//        String brandToSearch = scanner.nextLine();
//        String osTypeToSearch = scanner.nextLine();
//
//        // Count of laptops by brand
//        int count = countOfLaptopsByBrand(laptops, brandToSearch);
//        if (count > 0) {
//            System.out.println(count);
//        } else {
//            System.out.println("The given brand is not available");
//        }
//
//        // Search laptops by OS type
//        Laptop[] result = searchLaptopByOsType(laptops, osTypeToSearch);
//        if (result != null) {
//            for (Laptop laptop : result) {
//                System.out.println(laptop.getLaptopId() + "\n" + laptop.getRating());
//            }
//        } else {
//            System.out.println("The given OS is not available");
//        }
//
//        scanner.close();
//    }
//}

import java.util.*;

public class LaptopProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop[] arr = new Laptop[4];
        for (int i = 0; i < 4; i++) {
            int lid = sc.nextInt();
            sc.nextLine(); // Consume newline
            String brand = sc.nextLine();
            String ost = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();
            arr[i] = new Laptop(lid, brand, ost, price, rating);
        }
        sc.nextLine(); // Consume newline
        String br = sc.nextLine();
        String os = sc.nextLine();

        // Count of laptops by brand
        int ans = countLaptops(arr, br);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println("The given brand is not available");
        }

        // Search laptops by OS type
        Laptop[] res = searchLaptops(arr, os);
        if (res != null) {
            for (int i = res.length - 1; i >= 0; i--) {
                System.out.println(res[i].getLid());
                System.out.println(res[i].getRating());
            }
        } else {
            System.out.println("The given OS is not available");
        }

        sc.close();
    }

    public static int countLaptops(Laptop[] arr, String br) {
        int count = 0;
        for (Laptop laptop : arr) {
            if (laptop.getBrand().equalsIgnoreCase(br) && laptop.getRating() > 3) {
                count++;
            }
        }
        return Math.max(count, 0);
    }

    public static Laptop[] searchLaptops(Laptop[] arr, String os) {
        int count = 0;

        // First, count how many laptops match the OS
        for (Laptop laptop : arr) {
            if (laptop.getOst().equalsIgnoreCase(os)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        // Create a new array to store matching laptops
        Laptop[] matchingLaptops = new Laptop[count];
        int index = 0;

        // Populate the array with matching laptops
        for (Laptop laptop : arr) {
            if (laptop.getOst().equalsIgnoreCase(os)) {
                matchingLaptops[index++] = laptop;
            }
        }

        // Sort the array in descending order by laptopId
        Arrays.sort(matchingLaptops, (a, b) -> b.getLid() - a.getLid());

        return matchingLaptops;
    }
}

class Laptop {
    private int lid;
    private String brand;
    private String ost;
    private double price;
    private int rating;

    public Laptop(int lid, String brand, String ost, double price, int rating) {
        this.lid = lid;
        this.brand = brand;
        this.ost = ost;
        this.price = price;
        this.rating = rating;
    }

    public int getLid() {
        return lid;
    }

    public String getBrand() {
        return brand;
    }

    public String getOst() {
        return ost;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}



