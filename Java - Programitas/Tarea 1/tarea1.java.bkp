

import java.util.Random;
import java.util.Scanner;


public class tarea1	

// Inicio de Programa

	{
		
		public static void main(String[] args)
			{
				Random rand = new Random(); //Random para numeros
				int a;
				int b;
				
				a = 0;
				b = 9;
				
				int operacion = 0;
				int respuesta = 0;
				int aciertos = 0;
				int desaciertos = 0;
				String continuidad = "S"; //Iniciado en Cero para que entre en el loop
				String operacion_str = ""; //Variable para impresion en pantalla
				Scanner entrada = new Scanner(System.in);  //Valores de Respuesta
				Scanner continuar = new Scanner(System.in); //Valor para la continuidad (s/n)
		
				Random random_operador = new Random();  //Random de operaciones (+,-,/,*)
				
				while (a <= b)
					{
						int numero1 = rand.nextInt(12);
						int numero2 = rand.nextInt(12);
						int operadores = rand.nextInt(4);
												
						//### Operacion ###
						if (operadores == 0)
							{
								operacion = numero1 + numero2;
								operacion_str = Integer.toString(numero1) + " + " + Integer.toString(numero2);
							}
						
						if (operadores == 1)
							{
								operacion = numero1 - numero2;
								operacion_str = Integer.toString(numero1) + " - " + Integer.toString(numero2);
							}
						
						if (operadores == 2)
							{
								operacion = numero1 * numero2;
								operacion_str = Integer.toString(numero1) + " * " + Integer.toString(numero2);
							}
							
						if (operadores == 3)
							{
								if (numero2 == 0) //Evita la Division en Cero
									{
										numero2 = numero2+1;
									}
									
								if (numero2 > numero1) //Si el divisor es alto le damos la vuelta a la fraccion asi evitamos el cero racional.
									{
										if (numero1 == 0)
											{
												numero1 = numero1 + 1;
											}
										operacion = numero2 / numero1;
										operacion_str = Integer.toString(numero2) + " / " + Integer.toString(numero1);
									}
								else
									{
										operacion = numero1 / numero2;
										operacion_str = Integer.toString(numero1) + " / " + Integer.toString(numero2);
									}
							}
							
						System.out.print("Cuanto es " + operacion_str + " ? " );
						respuesta = entrada.nextInt();
						
						if (respuesta == operacion)
							{
								aciertos++;
							}
						else
							{
								desaciertos++;
							}
						a++;
						//Fin de Operacion
						
					}
					
				//Impresion de Resultados
				
				System.out.print("Respuestas Correctas: " + aciertos + "\n");
				System.out.print("Respuestas Incorrectas: " + desaciertos + "\n");
				System.out.print("Total de Puntos: " + aciertos * 1000 + "\n");
				System.out.print("Fin del Juego... Desea Otro? (S/N)? ");
				continuidad = continuar.nextLine();
				
			}


	}