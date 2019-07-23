public class Exemplu3{
    public static void main(String [] args){
        Foo f = new Foo();
        int x = 40;
        
        Punct p1 = new Punct(1,0);
        f.transferPrinValoare(x);
        System.out.println("x dupa "+x);
        f.transferPrinReferinta(p1);
        System.out.println("x-ul lui p1 dupa "+p1.x);
        
        Bar b1 = new Bar();
        int y = 10;
        b1.incrementeazaPeY(y);
        System.out.println(y);
        
    }
}