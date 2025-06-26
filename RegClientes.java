/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1moisesc;

/**
 *
 * @author moisescascante
 */
// Registro de Clientes, Codigo de Factura y Monto de la venta.
public class RegClientes {

    private String nombreCliente;
    private int cedula;
    public double codFactura;
    String MontoFactura;

    public double getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(double codFactura) {
        this.codFactura = codFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
    public double montoFactura;

    public String getnombreCliente() {
        return nombreCliente;
    }

    public void setnombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getcedula() {
        return cedula;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }

    public double getcodFactura() {
        return codFactura;
    }

    public void setcodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public String toString() {

        return "nombreCliente" + nombreCliente + ", cedula=" + cedula + ", codFactura=" + codFactura + ", codFactura" + codFactura + "MontoFactura" + MontoFactura;
    }
}
