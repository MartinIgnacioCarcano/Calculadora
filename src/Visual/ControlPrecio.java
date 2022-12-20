package Visual;

import BaseDeDatos.Escritura;
import BaseDeDatos.Lectura;
import Utilidades.Item;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPrecio {

    Lectura leer = new Lectura();
    Escritura escribir = new Escritura();

    public String calcularPrecio(ArrayList<String> cantidad, int pasta) throws IOException {
        ArrayList<Item> precios = leer.leerLista();
        //aux es donde guarda la sumatoria
        float aux = 0;
        //en lista guarda las cantidades
        float[] lista = new float[11];
        try {
            for (int i = 0; i < 11; i++) {
                if (cantidad.get(i).equals("")) {   //en caso de que no haya nada significa que no se usa ese elemento
                    lista[i] = 0;                   //por eso lo deja en 0
                } else {
                    lista[i] = Integer.parseInt(cantidad.get(i));   //Guarda
                    lista[i] = lista[i] / 1000;
                }
                System.out.println(precios.get(i).nombre);
                System.out.println(lista[i]*precios.get(i).precio);
            }     
        } catch (NumberFormatException nfe) {
            throw nfe;
        }
        System.out.println("-------------------");
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                aux = aux + (lista[i] * precios.get(10 + pasta).precio);
            } else {
                aux = aux + (lista[i] * precios.get(i).precio);
            }
        }
        System.out.println(aux);
        String retorno = Integer.toString((int) aux);
        return retorno; 
    }

    public String buscarPrecios(int x) {
        try {
            ArrayList<Item> precios = leer.leerLista();
            String aux = Integer.toString((int) precios.get(x).precio);
            return aux;
        } catch (IOException ex) {
            Logger.getLogger(ControlPrecio.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    public void guardarCambio(String precio, int posicion) {
        try {
            ArrayList<Item> precios = leer.leerLista();
            float x = Float.parseFloat(precio);
            System.out.println(posicion);
            precios.get(posicion).precio = x;
            escribir.guardarDatos(precios);
        } catch (IOException ex) {
            Logger.getLogger(ControlPrecio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarPantalla() {

    }
}
