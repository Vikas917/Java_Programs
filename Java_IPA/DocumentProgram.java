/*
Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages.

This method should be called from main method and display values of returned objects as shared in the sample (in ascending
order of id attribute).

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above
sequence.

Next call the method and display the result.

Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45



Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc.
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
22
hello

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value hello. Instead it may be """".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.
 */
package Java_IPA;

import javax.print.Doc;
import java.util.Arrays;
import java.util.Scanner;

public class DocumentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] arr = new Document[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Document(a, b, c, d);
        }
        Document[] res = docsWithOddPages(arr);
        if (res != null) {
            for (int i=0;i<res.length;i++){
                System.out.println(res[i].getId() + " " + res[i].getTitle() + " " + res[i].getFolderName() + " " +res[i].getPages());
            }
        }
        else {
            System.out.println("No odd pages");
        }
    }
    public static Document[] docsWithOddPages(Document[] arr) {
        Document[] docs = new Document[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i].getPages() % 2 == 1) {
                docs = Arrays.copyOf(docs,docs.length+1);
                docs[docs.length-1] = arr[i];
            }
        }
        for (int i=0;i< docs.length;i++) {
            for (int j=1;j< docs.length;j++) {
                if (docs[i].getId() > docs[i].getId()) {
                    Document d = docs[i];
                    docs[i] = docs[j];
                    docs[j] = d;
                }
            }
        }
        if (docs.length > 0){
            return docs;
        }
        else {
            return null;
        }
    }
}
class Document {
    int id;
    String title;
    String folderName;
    int pages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
}
