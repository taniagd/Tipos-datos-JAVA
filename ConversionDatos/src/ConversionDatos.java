
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* 
Tipos de datos en Java:
* Numéricos: byte, short, int, long, float, double
Se puede hacer la conversión de datos numéricos siguiendo esta secuencia.
El cambio de datos funciona para cuando hay números mayores de los permitidos en
cada categoría y así se evita el desbordamiento. 
 * Boolean: True/false.
* Caracteres: char.
* Cadenas: String.
*/
		/*
		 * byte 8 bits
		 * short 16 bits
		 * int 32 bits
		 * long 64 bits
		 */
		
		byte smallnumber = 122;
		byte anothersmallnumber = 122;
		int suma = smallnumber + anothersmallnumber;
/*Declaro dos número bytes. Byte puede almacenar de -128 a 127 (rango de valores)
Pero si quiero sumarlos e incluirlos en una variable byte no se puede 
porque se sale del rango.
Eclipse detecta esas situaciones y sugiere algo para solucionarlo. 
Sugiere que se declare una variable int para la suma, pues int puede almacenar 
valores de -231 a 231-1
Entonces el numero de la suma si entra en un int y se ejecuta el programa */
		
		int number1 = 1000;
		long number2 = number1;
		float number3 = number2;
		
/*Ejemplo uno de conversión de datos siguiendo la secuencia adecuada*/
		
		long number1 = 1000;
		int number2 = (int) number1;
		float number3 = number2;
		
/*Casteo. Recibe numero long, pero que se convierta en int y se almacene 
en variable number.
El número al que le hacemos cast debe caber en el que queremos almacenarlo*/
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(suma);
	}

}
