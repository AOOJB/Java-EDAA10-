package ovn3;

import java.util.Scanner;

public class Ovn3 {
	public static void main(String[] args) 
	{
		int sum1 = 0;
		for(int i = 1; i < 100; i++) {
			sum1 = sum1 + i;
			System.out.println(sum1);
		}
		int sum2 = 1;
		int antaltermer1 = 0;
		while(sum2 <= 100000) {
			sum2 = sum2 + 2;
			antaltermer1 = antaltermer1 + 1;
		}
		System.out.println(antaltermer1);
		
		int[] nummer = {3, 2, 4, 6, 2, 0};
		int antaltal = 0;
		for(int j = 0; j < nummer.length; j++) {
			if(nummer[j] > 0) {
				antaltal = antaltal +1;
			}
		}
		System.out.println(antaltal);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Antal heltal:");
		int n = s.nextInt();
		int[] x = new int[n];
		int summax1 = 0;
		int summax2 = 0;
		for(int k = 0; k < n; k++) {
			System.out.println(k + "tal =");
			x[k] = s.nextInt();
			summax1 = summax1 + x[k];
			summax2 = summax2 + (x[k]*x[k]);
		}
		int m = summax1 /n;
		double standardavvikelse = 0;
		double standard = 0;
		if(n < 5) {
			standard = summax2 -(n*m*m)/(n-1);
			standardavvikelse = Math.sqrt(standard);
		}
		System.out.println("medelvärde:" + m);
		System.out.println("Standardavvikelse:" + standardavvikelse);
		
		int likadanatal = 0;
		for(int l = 1; l <= n; l++) {
			if(x[l-1] == x[l]) {
				likadanatal++;
			}
		}
		System.out.println("intilliggande heltal:" + likadanatal);
	}
}
