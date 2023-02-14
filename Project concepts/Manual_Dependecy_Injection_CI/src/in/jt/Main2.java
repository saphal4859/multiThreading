package in.jt;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value for  a ");
		int a = scan.nextInt();
		
		System.out.println("enter value for  b ");
		int b = scan.nextInt();
		
		
		int c = a/b;
		System.out.println(c);
	}
}

