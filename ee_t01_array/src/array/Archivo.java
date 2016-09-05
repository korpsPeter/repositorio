package array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Archivo {
	ArrayList<String> arre= new ArrayList<>();
public   void leerArchivoNombres( BufferedReader br ) throws IOException{
        
        String cadena= br.readLine();
        while(cadena != null){
          
        	arre.add(cadena);
            cadena= br.readLine();
        }
        Collections.sort(arre);
        for(int i=0; i<arre.size(); i++){
        	System.out.println(arre.get(i));
        }
    }
    public void ver_archivo() throws IOException{
         try {
        	 String a = JOptionPane.showInputDialog("nombre del archivo");
             BufferedReader oh =new BufferedReader (new FileReader(a));
            
             leerArchivoNombres(oh);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
	public static void main(String[] arg) throws IOException{
		Archivo a = new Archivo();
		a.ver_archivo();
		
		
		
	}
}
