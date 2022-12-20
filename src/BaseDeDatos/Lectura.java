package BaseDeDatos;

import Utilidades.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {

    FileInputStream fileIn;
    ObjectInputStream entrada;
//Leer la lista de objetos    

    public ArrayList leerLista() throws IOException {
        ArrayList<Item> lista = new ArrayList();
        try {
            fileIn = new FileInputStream("Precios.obj");
            entrada = new ObjectInputStream(fileIn);
            lista = (ArrayList<Item>) entrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } finally {
            entrada.close();
        }
        return lista;
    }
}
