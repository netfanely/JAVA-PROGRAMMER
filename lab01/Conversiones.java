
package cjava.lab01;


public class Conversiones {
    public Conversiones(){
        
    }
    public String aCadena(int i){
        return String.valueOf(i);
    }  
    public String aCadena(double d){
        return String.valueOf(d);
    }
    public double aReal(String s){
        return Double.parseDouble(s);
    }  
}
