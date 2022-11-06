package Factor;

import java.util.Scanner;

public class Facts {

	public static void main(String[] args) {
		int result = 2; 
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение степени числа 2:");
		int n = in.nextInt();
		if(n==1) {
			result = 2;
		}
		else
		for (int i = 1; i < n;i++) {

				result = result * 2;		
		}
		System.out.println("Ответ: "+result); 
		in.close();
	}

}
