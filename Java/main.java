package tamgiac;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap a: ");
	int a1 =sc.nextInt();
	System.out.println("nhap b: ");
	int b1 =sc.nextInt();
	System.out.println("nhap c: ");
	int c1 =sc.nextInt();
	tamgiacc tg1 = new tamgiacc(a1,b1,c1);
	System.out.println(tg1);
	
}
}
