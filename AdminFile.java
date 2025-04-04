import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class AdminFile {
    /**
     * @param args
     */
    public static void main(String[] args) {

    File folder = new File("192413");
    folder.mkdir();

    File file = new File("192413/loremTpaum.txt");
    try {
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(
        new FileWriter("192413/loremTpaum.txt",true)
        );
        writer.write("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto.");
        writer.newLine();
        writer.write("Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. ");
        writer.newLine();
        writer.write("persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.");
        writer.newLine();
        writer.write(" No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original.");
        writer.newLine();
        writer.write("Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        writer.close();

        BufferedReader read = new BufferedReader(new FileReader("192413/loremTpaum.txt"));
        String line;
        int cantidad = 0;
        while ((line = read.readLine() ) != null) {
            System.out.println(line);
            cantidad ++;
        }
        System.out.println("cantidad de lineas: " + cantidad);
        
        Long fecha = file.lastModified();
        Date date = new Date(fecha);
        System.out.println(date);

        File file2 = new File("192413/log.txt");
        
            file2.createNewFile();
            BufferedWriter writer2 = new BufferedWriter(
        new FileWriter("192413/log.txt",true)
        );
        writer2.write("La cantidad de lineas: " + cantidad);
        writer2.write("La ultima modificacion: " + date);
        writer2.newLine();
        writer2.close();

    } catch (IOException e) {
        System.out.println("ERROR");
    }

    
            
    

  


    

   
}
}
