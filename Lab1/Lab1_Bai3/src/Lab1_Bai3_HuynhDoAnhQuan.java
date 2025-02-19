import java.util.Scanner;

public class Lab1_Bai3_HuynhDoAnhQuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		
		double theTich = Math.pow(canh, 3);
		
		System.out.printf("Thể tích khối lập phương: %.2f\n", theTich);
	}
	
}
