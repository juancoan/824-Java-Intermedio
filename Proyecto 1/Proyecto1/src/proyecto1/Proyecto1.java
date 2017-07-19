/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1;


/**
 *
 * @author A
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    
    Object [][] Matriz = null; // Matriz para trabajar los datos
    Object [][] Matriz2 = null; //Matriz clonada para encontrar escanos sin alterar la primera
    Object [][] MatrizFinal = null;
    Object [][] Datos = null;  // Matriz para recibir los datos
    String[] coordinate;
    int[] contador;
    
    public static void main(String[] args) {
        Vista App = new Vista();  //Empezamos de una vez el formulario
        App.setVisible(true);
        
    
    }
    
    
    // El siguiente metodo, recibe la matriz inicial para posterior procesamiento
    public void procesarDatos(Object[][] Datos, int escanos, int partidos){
        Matriz = Datos;
        divisiones(escanos, partidos);
    
    }
    
    // El siguiente metodo hace las divisiones en las siguientes columnas
    private void divisiones(int escanos, int partidos){
        int numero;
        int counter; //Para llenar los campos a partir de la tercera columna
        
        for (int i=0;i<partidos;i++){
            counter = 2;
            for (int j=0;j<escanos;j++){
                		
                numero = Integer.parseInt((String)Matriz[i][1]); // Convertimos el objeto en integer.
                numero = numero/(j+1);
                Matriz[i][counter] = numero;
                counter++;
                //System.out.print(numero);
                //System.out.print(" ");
                
            }
            //System.out.println("");
            
        }
        
    }
    //Devuelve la matriz a la vista
    public Object[][] obtenerMatriz(){
        return Matriz;
    }
    
    private void clonarMatriz(int escanos, int partidos){
        
        Matriz2 = new Object[partidos][escanos];
        for (int i=0;i<partidos;i++){
            for (int j=0;j<escanos;j++){
                Matriz2[i][j] = Matriz[i][j];
                
            }
        }
    }
    
    public int[] incluirContador(){
        
        return contador;
    }
    
   
    
    //El siguiente escoje los escanos mayores
    public void selectEscanos(int escanos, int partidos){
        
        coordinate = new String[partidos+1];
        contador = new int[partidos]; //Leva la cuenta de los partidos
        int counter = 0;
        int Max = 0;
        int numero;
        int x = 0; //Coordenada
        int y = 0; //Coordenada
        clonarMatriz(escanos+2,partidos);
        
        for(int i=0;i<escanos;i++){
            for (int p=0; p<partidos; p++){
                for (int e=2; e<=escanos+1; e++){
                    
                    numero = (Integer) Matriz2[p][e];
                    if (Max<numero){
                        Max = numero;
                        x = p;
                        y = e;
                    }
                }
            }
            Max = 0;
            Matriz2[x][y] = 0; // Al dejarla en cero ya no sera el numero mayor, por consiguiente otro lo sera
            contador[x] = contador[x] + 1; // Le da un puntaje al partido
            Matriz[x][y] = "*** " + Matriz[x][y] + " ***"; //Marca la casilla agregando unos asteriscos
            counter++;
            
        }
        
    }
    
    
}
