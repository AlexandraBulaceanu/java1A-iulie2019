public class Exemplu2{
    public static void main(String ... args){
        Cerc c1 = new Cerc();
        c1.raza = 10;
        System.out.println(c1.getArie());
        
        Cilindru cil = new Cilindru();
        cil.raza = 10;
        cil.h = 10;
        System.out.println(cil.getArie());
        
    }
}