package Utilidades;

public class Item implements java.io.Serializable {

    public String nombre;
    public float precio;

    public Item(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
