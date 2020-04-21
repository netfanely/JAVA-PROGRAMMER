
package cjava.lab01;


public class Operaciones extends Conversiones{
    
    public String suma(String s1, String s2){
        return aCadena(aReal(s1)+aReal(s2));
    }
    public String resta(String s1, String s2){
        return aCadena(aReal(s1)-aReal(s2));
    }
    public String multiplica(String s1, String s2){
        return aCadena(aReal(s1)*aReal(s2));
    }
    public String divide(String s1, String s2){
        return aCadena(aReal(s1)/aReal(s2));
    }

}
