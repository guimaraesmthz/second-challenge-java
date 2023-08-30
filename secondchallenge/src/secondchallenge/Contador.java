package secondchallenge;

import java.util.Scanner;

public class Contador{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int firstNumber = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int secondNumber = sc.nextInt();
		
		try {
			contagemNumeros(firstNumber,secondNumber);
		}catch(ParametrosInvalidosException e){
			System.out.println("O segundo número deve ser maior que o primeiro.");
		}
	}
	static void contagemNumeros(int numberOne, int numberTwo) throws ParametrosInvalidosException{
		
		if(numberOne > numberTwo) {
			throw new ParametrosInvalidosException();
		}else{
			int cont = numberTwo - numberOne;
			for(int i = 0; i < cont ; i++) {
				System.out.println(i);
			};
		};
		
	}

}
