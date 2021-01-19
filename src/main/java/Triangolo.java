/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.*;

/**
 *
 * @author informatica
 */
public class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }
    
    public String classificaTriangolo(){
        double rettangolo = 0;
        
        if(lato1 > lato2 && lato1 > lato3){
            rettangolo = Math.sqrt(Math.pow(lato2, 2) + Math.pow(lato3, 2));
        }else if(lato2 > lato3 && lato2 > lato1){
            rettangolo = Math.sqrt(Math.pow(lato1, 2) + Math.pow(lato3, 2));
        }else if(lato3 > lato1 && lato3 > lato2){
            rettangolo = Math.sqrt(Math.pow(lato1, 2) + Math.pow(lato2, 2));
        }
           
        if(lato1 != lato2 && lato1 != lato3 && lato2 != lato3){
            return "Scaleno";
        }else if(lato1 == lato2 && lato2 == lato3){
            return "Equilatero";
        }else if(rettangolo == lato1 || rettangolo == lato2 || rettangolo == lato3){
            return "Rettangolo";
        }else if(lato1 == lato2 && lato1 != lato3){
            return "Isoscele";
        }else if(lato2 == lato3 && lato2 != lato1){
            return "Isoscele";
        }else if(lato3 == lato1 && lato3 != lato2){
            return "Isoscele";
        }
        return null;
    }
    
    public double calcolaPerimetro(){
        return lato1 + lato2 + lato3;
    }
    
    public double calcolaArea(){
        double area, semiPerimetro;
        semiPerimetro = (lato1 + lato2 + lato3)/2;
        area = Math.sqrt(semiPerimetro*(semiPerimetro-lato1)*(semiPerimetro-lato2)*(semiPerimetro-lato3));
        return area;
    }
}
