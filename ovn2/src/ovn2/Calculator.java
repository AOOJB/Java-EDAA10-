package ovn2;

import java.util.Scanner;
import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;

public class Calculator 
{
	public static void main(String[] args) 
	{
		double nbr1, nbr2;
		System.out.println("Skriv tv? tal");
		Scanner scan = new Scanner(System.in);
		nbr1 = scan.nextDouble();
		nbr2 = scan.nextDouble();
		double sumaddition = nbr1+nbr2;
		double sumsubtraktion = nbr1-nbr2;
		double summultiplikation = nbr1*nbr2;
		double sumdivision = nbr1/nbr2;
		System.out.println("Summan av talen ?r " + sumaddition);
		System.out.println("Skillnaden av talen ?r " + sumsubtraktion);
		System.out.println("Produkten av talen ?r " + summultiplikation);
		System.out.println("Kvoten av talen ?r " + sumdivision);
		
		SimpleWindow w = new SimpleWindow(250,150,"turtle");
		Turtle t = new Turtle(w,50,0);
			t.turnNorth();
			t.penDown();
			t.right(120);
			t.forward(100);
			t.right(120);
			t.forward(100);
			t.right(120);
			t.forward(100);
			t.penUp();
			t.turnNorth();
			t.right(90);
			t.forward(100);
			t.penDown();
			t.right(30);
			t.forward(100);
			t.right(120);
			t.forward(100);
			t.right(120);
			t.forward(100);
			
			int[] nummer = {4, 7, 9, 4, 12, 6, 10, 7, 3, 2, 9, 6, 5, 4, 2, 5, 1, 2, 3};
			int st?rstatalet = 4;
			for(int i = 1; i < nummer.length; i++) {
				if(nummer[i] > st?rstatalet) {
					st?rstatalet = nummer[i];
				}
			}
			System.out.println(st?rstatalet);
			
			System.out.println("Skriv ett tal till");
			Scanner scanturtle = new Scanner(System.in);
			int n = scanturtle.nextInt();
			SimpleWindow v = new SimpleWindow(500,500,"turtle2");
			Turtle t2 = new Turtle(v, 100, 100);
			t2.turnNorth();
			t2.penDown();
			for(int j = 0; j < n; j++) {
				t2.right(360/n);
				t2.forward(100);
			}
	}
}

