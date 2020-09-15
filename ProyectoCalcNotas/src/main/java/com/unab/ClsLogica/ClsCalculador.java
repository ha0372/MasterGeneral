/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.ClsLogica;

public class ClsCalculador {

    private double Lab1;
    private double Par1;
    private double Lab2;
    private double Par2;
    private double Lab3;
    private double Par3;
    private double Nota1;
    private double Nota2;
    private double Nota3;

    public double getLab1() {
        return Lab1;
    }

    public void setLab1(double Lab1) {
        this.Lab1 = Lab1;
    }

    public double getPar1() {
        return Par1;
    }

    public void setPar1(double Par1) {
        this.Par1 = Par1;
    }

    public double getLab2() {
        return Lab2;
    }

    public void setLab2(double Lab2) {
        this.Lab2 = Lab2;
    }

    public double getPar2() {
        return Par2;
    }

    public void setPar2(double Par2) {
        this.Par2 = Par2;
    }

    public double getLab3() {
        return Lab3;
    }

    public void setLab3(double Lab3) {
        this.Lab3 = Lab3;
    }

    public double getPar3() {
        return Par3;
    }

    public void setPar3(double Par3) {
        this.Par3 = Par3;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double operacion1(double Lab1, double Par1) {
        this.Lab1 = Lab1;
        this.Par1 = Par1;

        return (Lab1 * 0.40) + (Par1 * 0.60);
    }

    public double operacion2(double Lab2, double Par2) {
        this.Lab2 = Lab2;
        this.Par2 = Par2;
        return (Lab2 * 0.40) + (Par2 * 0.60);
    }

    public double operacion3(double Lab3, double Par3) {
        this.Lab3 = Lab3;
        this.Par3 = Par3;
        return (Lab3 * 0.40) + (Par3 * 0.60);

    }

    public double operacionF(double Nota1, double Nota2, double Nota3) {
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        return (Nota1 + Nota2 + Nota3) / 3;

    }

    public boolean Aprobo() {
        double result;
        result = (Nota1 + Nota2 + Nota3) / 3;

        return result < 6.0;

    }
}
