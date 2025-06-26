/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1moisesc;

/**
 *
 * @author moisescascante
 */
//Registro Ventas, Precio y Cantidad.
public class Facturacion {
    public class Producto {
    private String tipo;
    private double precio;
    private int cantidad;

    public Producto(String Tipo, double precio, int cantidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
//Calculo total facturado
    public double gettotalFactura() {
        return precio * cantidad;
    }
    
}
    
}
