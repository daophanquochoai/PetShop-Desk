/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt.petshopproject.model;

/**
 *
 * @author Admin
 */
public class DoanhThu {
    private int first;
    private double second;

    public DoanhThu() {
    }
    
    public DoanhThu(int first, double second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }
}
