import java.util.Scanner;

public class Lab1_Bai1_DTB_test {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		System.out.println("Họ và tên: " + hoTen);
		System.out.printf("Điểm TB: %.2f\n", diemTB);
	}
}
