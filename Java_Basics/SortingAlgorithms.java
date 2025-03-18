package Java_Basics;

public class SortingAlgorithms {
    //Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for(int i = 0;i < n-1;i++) {
            for(int j = 0;j < n-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    //Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i < n-1;i++) {
            int smallest = i;
            for(int j = i+1;j < n;j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    //Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for(int i = 0;i < n;i++) {
            int curr = arr[i];
            int j = i-1;

            while ((j >= 0 && curr < arr[j])) {
                arr[j+1] = arr[j];
                j--;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,3,9};

        bubbleSort(arr);
        System.out.println();

        selectionSort(arr);
        System.out.println();
        
        insertionSort(arr);
    }
}
