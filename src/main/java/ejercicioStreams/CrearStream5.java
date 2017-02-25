package ejercicioStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CrearStream5 {


    public static void main(String [] args) {

        System.out.println("Creacion de streams desde archivos ");

        Path path1 = Paths.get("C:/Users/rnbr/IdeaProjects/MethodReferences/src/main/java/ejercicioStreams/Parrafo.txt");

        try(Stream<String> lineas = Files.lines(path1)){
            lineas.forEach(
                    linea -> {
                        System.out.println("Linea ...");
                        System.out.println(linea);
                    }
            );
        }catch (IOException e){
            e.printStackTrace();
        }
/*

        System.out.println("");
        Path dir = Paths.get("C:/Users/rnbr/IdeaProjects/MethodReferences/src/main/java/ejercicioStreams/Parrafo.txt");
       // Path dir = Paths.get("·");
        System.out.printf("%nEl arbol de archivod " +
                "del proyecto para: "
        + "%s es %n ", dir.toAbsolutePath());

        try(Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }
*/

    }
    }
