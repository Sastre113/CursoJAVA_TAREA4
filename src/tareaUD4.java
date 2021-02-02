
public class tareaUD4 {
	
//	3 - Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
//	dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por
//	pantalla:
//		• El valor de cada variable.
//		• La suma X + Y
//		• La diferencia X – Y
//		• El producto X * Y
//		• El cociente X / Y
//		• El resto X % Y
//		• La suma N + M
//		• La diferencia N – M
//		• El producto N * M
//		• El cociente N / M
//		• El resto N % M
//		• La suma X + N
//		• El cociente Y / M
//		• El resto Y % M
//		• El doble de cada variable
//		• La suma de todas las variables
//		• El producto de todas las variables

	
	static void  ejercicio3() {
		int X = 2,Y = 5;
		double N = 4.5, M = 3.14 ;
		System.out.println("Valor de X = " + X + " Valor de Y = " + Y + " Valor de N = " + N + " Valor de M = " + M);
		System.out.println(" - X + Y = " + (X + Y));
		System.out.println(" - X - Y = " + (X - Y));
		System.out.println(" - X * Y = " + (X * Y));
		System.out.println(" - X / Y = " + (X / Y));
		System.out.println(" - X % Y = " + (X % Y));
		
		System.out.println(" - N + M  = " + (N + M ));
		System.out.println(" - N - M = " + (N - M));
		System.out.println(" - N * M = " + (N * M));
		System.out.println(" - N / M = " + (N / M));
		System.out.println(" - N % M = " + (N % M));
		
		System.out.println(" - X + N  = " + (X + N ));
		System.out.println(" - Y / M = " + (Y / M));
		System.out.println(" - Doble de cada variable: X = " + X*2 + " ,Y = " + Y*2 + " ,N = " + N*2 + " ,M = " + M*2 );
		System.out.println(" - Suma de todas las variables = " + (X + Y + N + M));
		System.out.println(" - Producto de todas las variables = " + (X * Y * N * M));
	}
	
//	4 - Escribe un programa Java que declare una variable entera N y asígnale un valor. A
//	continuación escribe las instrucciones que realicen los siguientes:
//		• Incrementar N en 77.
//		• Decrementarla en 3.
//		• Duplicar su valor.
//	Si por ejemplo N = 1 la salida del programa será:
//		• Valor inicial de N = 1
//		• N + 77 = 78
//		• N - 3 = 75
//		• N * 2 = 150
	
	
	static void  ejercicio4() {
		int N = 10;
		
		System.out.println("Valor de N = " + N);
		System.out.println(" - N + 77 = " + (N + 77));
		System.out.println(" - N - 3 = " + (N - 3));
		System.out.println(" - N * 2 = " + (N * 2));
	}
	
//	5 - Programa java que declare cuatro variables enteras A, B, C y D y
//	asígnale un valor a cada una. A continuación realiza las instrucciones
//	necesarias para que:
//		• B tome el valor de C
//		• C tome el valor de A
//		• A tome el valor de D
//		• D tome el valor de B

	static void ejercicio5() {
		int A = 1,B = 2,C = 3,D = 4;
		System.out.println("Valores de las variables al inicio: A = "+ A + " B = " + B + " C = " + C + " D = " + D  );
		System.out.println(" - B tome el valor de C , B = " + (B = C));
		System.out.println(" - C tome el valor de A , C = " + (C = A));
		System.out.println(" - A tome el valor de D , A = " + (A = D));
		System.out.println(" - D tome el valor de B , D = " + (D = B));
		System.out.println("Valores de las variables al finalizar: A = "+ A + " B = " + B + " C = " + C + " D = " + D  );
	}
	
	public static void main(String[] args) {
		System.out.println("----- Tarea 4 -----");
		System.out.println("Ejercicio 1");
//		1 - Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
//		resta, multiplicación, división y módulo (resto de la división).	
		
		float num1 = 10, num2 = 20;
		
		System.out.println("Los numeros usados son: x = " + num1 + " , y =  " + num2);
		System.out.println(" - Suma: " + (num1 + num2) );
		System.out.println(" - Resta: " + (num1 - num2) );
		System.out.println(" - Multiplicación: " + (num1 * num2) );
		System.out.println(" - División: " + (num1 / num2) );
		System.out.println(" - Modulo: " + (num1 % num2) );
		
		
		
		System.out.println();
		System.out.println("Ejercicio 2");
//		2 - Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
//		una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.		
//		A continuación muestra por pantalla:
//			• El valor de cada variable.
//			• La suma de N + A
//			• La diferencia de A - N
//			• El valor numérico correspondiente al carácter que contiene la variable C.
//		Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
//		mostrar por pantalla:
//			• Variable N = 5
//			• Variable A = 4.56
//			• Variable C = a
//			• 5 + 4.56 = 9.559999999999999
//			• 4.56 - 5 = -0.4400000000000004
//			• Valor numérico del carácter a = 97
		
		int N = 10;
		double A = 20.54;
		char C = 'c';
		
		System.out.println("Valor de N = " + N + ", Valor de A = " + A + ", Valor de C = " + C);
		System.out.println(" - Suma N + A = " + (N + A) + " ,Diferencia N - A = " + (N - A) );
		System.out.println(" - Valor numérico de la variable C = " + (int)C);
		
		
		System.out.println();
		System.out.println("Ejercicio 3");
		ejercicio3();
		
		System.out.println();
		System.out.println("Ejercicio 4");
		ejercicio4();
		
		System.out.println();
		System.out.println("Ejercicio 5");
		ejercicio5();
		

		
	}

}
