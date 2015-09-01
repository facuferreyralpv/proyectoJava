/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dante
 */
public abstract class Globales {
    private static float precioTotal=0.0f;
    private static String ticket;

    public static String getTicket() {
        return ticket;
    }

    public static void setTicket(String ticket) {
        Globales.ticket = ticket;
    }
    

    public static float getPrecioTotal() {
        return precioTotal;
    }

    public static void setPrecioTotal(float precioTotal) {
        Globales.precioTotal = precioTotal;
    }

   
  

    
    
    
    
    public static float incrementarTotal(float precioPrenda) {
        Globales.precioTotal = Globales.precioTotal + precioPrenda;
        return Globales.precioTotal;
    }
    
}
