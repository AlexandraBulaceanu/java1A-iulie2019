public class Foo{
    void transferPrinValoare(int x){
        x=10;
        System.out.println("x in metoda "+x);
    }
    
    void transferPrinReferinta(Punct p){
        p.x = 10;
        System.out.println("p.x din metoda "+p.x);
    }
}