
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws IOException {
		Archivo fileReader = new Archivo();
		fileReader.loadFileWithJava8();
		
		fileReader.writeUsingFileWriter("---Buscar un Archivo---");
		fileReader.leerDocumento("ejemplo.txt");
	}
}
