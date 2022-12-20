package BaseDeDatos;

import Utilidades.Item;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Escritura {

    FileOutputStream fileOut;
    ObjectOutputStream salida;

    //guardar los datos
    public void guardarDatos(ArrayList<Item> lista) throws FileNotFoundException, IOException {
        try {
            fileOut = new FileOutputStream("Precios.obj");
            salida = new ObjectOutputStream(fileOut);
            salida.writeObject(lista);
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        } finally {
            salida.close();
        }

    }
}
