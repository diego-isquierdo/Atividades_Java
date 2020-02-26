import java.util.Scanner;

public class TestaScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("informa sua idade: ");
		int i = scan.nextInt();		
		
		//System.out.println("informe sua altura:");
		//double d = scan.nextDouble();
		
		System.out.println("Informe seu nome:");
		String s = scan.nextLine();
		
		System.out.println("Olá " + s + " e sua idade é: " + i);
		
		scan.close();
		
        /*Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();*/
		
	}
}
