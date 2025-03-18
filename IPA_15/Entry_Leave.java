package IPA_15;

import java.util.Arrays;
import java.util.Scanner;

public class Entry_Leave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Entry = new int[n];
        int[] Leave = new int[n];
        int[] remainingGuets = new int[n];
        int remaining = 0;

        if (1<=n && n<=25) {
            for (int i=0;i<n;i++) {
                System.out.println("Entry no." + (i+1) + ":");
                Entry[i] = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                System.out.println("Exit no." + (i+1) + ":");
                Leave[i] = sc.nextInt();
            }
        }

        for (int i=0;i<n;i++) {
            remaining += Entry[i] - Leave[i];
            remainingGuets[i]= remaining;
        }

        for (int i=0;i<n;i++) {
            System.out.println(remainingGuets[i] + " ");
        }

        System.out.println("\nMaximum number of guests on cruise at an instance : ");
        int maxGuests = Arrays.stream(remainingGuets).max().getAsInt();
        System.out.println(maxGuests);
    }
}
