#main
public class Main {
    public static void main(String[] args) throws IOException {
		Archivo fileReader = new Archivo();
		fileReader.loadFileWithJava8();
		
		fileReader.writeUsingFileWriter("---Buscar un Archivo---");
		fileReader.leerDocumento("ejemplo.txt");
	}
}
#Class Archivo
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
#Class Graphics
import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;/**
 *
 * @author user
 */
public class Graphics {
    public void createDemoGraph() throws IOException {
		Graph g = graph("example1").directed().with(node("a").link(node("b")));
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("ejemplo.txt"));
	}
	
       
	public void createDemoFromDot() throws IOException {
		File file = new File("C:\\Users\\user\\Documents\\graficas Arboles");
		FileInputStream fis = null;
		
		fis = new FileInputStream(file);
		
		MutableGraph g = Parser.read(fis);
		Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("ejemplo.txt"));
	}
}
