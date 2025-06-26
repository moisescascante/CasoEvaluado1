/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1moisesc;

/**
 *
 * @author moisescascante
 */
// Registro Agente Vendedor, incluye codigo y si posee vehiculo.
public class AgentesVendedores {

    public class Vendedores {

        private String vendedor;
        private String codigoV;
        private String carro;
           

        public String getVendedor() {
            return vendedor;
            
        }

        public void setVendedor(String vendedor) {
            this.vendedor = vendedor;
        }

        public String getCodigoV() {
            return codigoV;
        }

        public void setCodigoV(String codigoV) {
            this.codigoV = codigoV;
        }

        public String getCarro() {
            return carro;
        }

        public void setCarro(String carro) {
            this.carro = carro;
        }
}