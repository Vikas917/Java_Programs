package Java_IPA;

import java.util.*;
public class ProjectorProgram {
	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Projector[] arr = new Projector[4];
		for(int i=0;i< arr.length;i++) {
		int a = sc.nextInt();sc.nextLine();
		String b = sc.nextLine();
		int c = sc.nextInt();sc.nextLine();
		int d = sc.nextInt();sc.nextLine();
		String e = sc.nextLine();
		
		arr[i]= new Projector(a,b,c,d,e);
		}
		int rating = sc.nextInt();sc.nextLine();
		
	
		Projector ans = findMaximumPriceByRating(arr,rating);
		if(ans != null) {
			System.out.println(ans.getPid());
		}
		else {
			System.out.println("No such Projector");
		}	 
		sc.close();
	}
	public static Projector findMaximumPriceByRating(Projector[] arr,int rat) {
		Projector projector = null;
		int maxPrice = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getPrice() > maxPrice && arr[i].getRating() > rat && arr[i].getAvailableIn().equalsIgnoreCase("TataCliq")) {

				maxPrice = arr[i].getPrice();
				projector = arr[i];
			}
		}
		return projector;
	}
}
class Projector {
	int pid, price, rating;
	String pname,availableIn;
	
	public Projector(int pid, String pname, int price, int rating,String availableIn) {
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.rating = rating;
	this.availableIn = availableIn;
	}
	
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getPrice() {
		return price;
	}
	public int getRating() {
		return rating;
	}
	public String getAvailableIn() { 
		return availableIn;
	}
}
/*
1001
epson
30000
5
TataCliq
1002
benq
40000
4
amazon
1003
sony
80000
5
TataCliq
1004
optomo
7000
3
flipkart
3
 */