/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Praktikan
 */
public class Elips {
    private double rx, ry;

    public Elips(double rx, double ry) {
        this.rx = rx;
        this.ry = ry;
    }

    public double getRx() {
        return rx;
    }

    public void setRx(double rx) {
        this.rx = rx;
    }

    public double getRy() {
        return ry;
    }

    public void setRy(double ry) {
        this.ry = ry;
    }
    
    public double getLuas(){
        return Math.PI*rx*ry;
    }
}
