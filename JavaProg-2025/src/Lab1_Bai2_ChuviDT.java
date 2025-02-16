import java.util.Scanner;
public class Lab1_Bai2_ChuviDT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài: ");
		double chieuDai = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng: ");
		double chieuRong = scanner.nextDouble();
		
		double chuVi = (chieuDai + chieuRong) * 2;
		double dienTich = chieuDai * chieuRong;
		double canhNho = Math.min(chieuDai, chieuRong);
		
		System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
		System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
		System.out.printf("Cạnh nhỏ nhất của hình chữ nhật: %.2f\n", canhNho);
	}

}
