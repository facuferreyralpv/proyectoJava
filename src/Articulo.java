/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dante
 */
public class Articulo {
    private String tRopa;
    private String tTalle;
    private String tEstilo;
    private float tPrecio;

    
    public Articulo(String tRopa, String tTalle, String tEstilo, float tPrecio) {
        this.tRopa = tRopa;
        this.tTalle = tTalle;
        this.tEstilo = tEstilo;
        this.tPrecio = tPrecio;
    }

    
    public float gettPrecio() {
        return tPrecio;
    }

    public void settPrecio(float tPrecio) {
        this.tPrecio = tPrecio;
    }

    public String gettRopa() {
        return tRopa;
    }

    public void settRopa(String tRopa) {
        this.tRopa = tRopa;
    }

    public String gettTalle() {
        return tTalle;
    }

    public void settTalle(String tTalle) {
        this.tTalle = tTalle;
    }

    public String gettEstilo() {
        return tEstilo;
    }

    public void settEstilo(String tEstilo) {
        this.tEstilo = tEstilo;
    }
    
    
    
}
