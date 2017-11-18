/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 *
 * @author user
 */
public class Archivo {
    public void loadFileWithJava8() {
		String fileName = "C:\\Users\\user\\Documents\\graficas Arboles";
                String totalText="";
		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(x ->{
                        totalText.concat(x).concat("\n");
                        System.out.println(x);
                        });

		} catch (IOException e) {
			e.printStackTrace();
		}
                System.out.println("--------------");
                System.out.println(totalText);
	}
        public void leerDocumento(){
               File archivo = null;
      
         archivo = new File ("ejemplo.txt");
        
            System.out.println(archivo);
                

                }
    
	public void writeUsingFileWriter(String data) {
		File file = new File("C:\\Users\\user\\Documents\\graficas Arboles");

		try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
        }

    void leerDocumento(String ejemplotxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
