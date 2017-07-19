/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFileChooser;

/**
 *
 * @author A
 */

public class FileHandler {
    
    //La siguiente variable se va a conservar aunque el dialogo de configuracion
    //Haya sido destruido.
    public static String Config_File; // Variable Global
    
    
    public String Random_Word(){
        //Este metodo toma el archivo y lo almacena en un array
        //Luego en forma aleatoria escoje una palabra de ese array
        String[] palabras = null; //Almacenamos un array para escojer random
        String palabra = null; // variable que va a contener la palabra escojida
        int picked_num = 0;
        try {
        palabras = readLines(Config_File); //Se carga el array
            }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
        Random rand = new Random();
        picked_num = rand.nextInt(palabras.length);
        palabra = palabras[picked_num];
        
        return palabra;
        
    }
    
    
    String FileName = null;  //Variable Local
    //readlines metodo que lee el archivo y lo carga en un array.
    public String[] readLines(String filename) throws IOException {
        
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }
    
    //GetFileName se utiliza para escojer el archivo desde un un jFileChooser
    public String GetFileName(){
        
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
         File selectedFile = fileChooser.getSelectedFile();
         System.out.println("Selected file: " + selectedFile.getAbsolutePath());
         FileName = selectedFile.getAbsolutePath();
      
        
        }
        return FileName;
    }
    
      
    public void Array2File(String _FileName, String[] _palabras) throws IOException{
    //Este metodo lee el contenido del TextField y lo pasa a un array         
        
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(_FileName));
        
        for (int i = 0; i < _palabras.length; i++) {
            outputWriter.write(_palabras[i]);
            outputWriter.newLine();
            
        }
        outputWriter.flush();
        outputWriter.close();
         
    }
       
       public String Choosed_File(){
           
       return Config_File;
       
       }
    
}