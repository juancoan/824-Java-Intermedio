
//Crea Nuevos Numeros Aleatorios

import java.util.Random;

public class GenerarNumeros

		{
		
		
			Random rand = new Random();  //Metodo para generar un aleatorio
			private int numero; // Variable para trabajar el numero
                        private int nuevonumero;
                        
                       
			public void GenerarNuevo()
			
                        {
                           numero = rand.nextInt(12);
                        }
                        
                        public void GeneraCero()
                        {
                            nuevonumero = rand.nextInt(12);
                        }
	
			public int ObtenerNumero()
                        {
                            return numero;
                        }
				
                      
                                    
                        
		
		}