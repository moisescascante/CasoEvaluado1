/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1moisesc;

/**
 *
 * @author moisescascante
 */
//Calculo Comision por ventas.
public class Comisiones {

    public static void main(String[] args) {
//Total de la factura y porcentaje de comisión
        double totalFactura = 5000.00;
        double porcentajeComision = 0.05; // 5%
// Calculo de la comision de 5%
        double comision = calcularComision(totalFactura, porcentajeComision);

        System.out.println("Total de la factura: $" + totalFactura);
        System.out.println("Porcentaje de comisión: " + (porcentajeComision * 100) + "%");
        System.out.println("Comisión a pagar: $" + comision);
    }
    /**
     *
     * @param totalFactura
     * @param porcentajeComision
     * @return
     */
    public static double calcularComision(double totalFactura, double porcentajeComision) {
        return totalFactura * porcentajeComision;
    }
}
