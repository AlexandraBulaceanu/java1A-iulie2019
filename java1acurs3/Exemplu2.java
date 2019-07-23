public class Exemplu2{
    public static void main(String [] args){
        Punct p1 = new Punct(0,1);
        Punct p2 = new Punct(1,0);
        
        double r = p1.getDistance(p2);
        System.out.println(r);
    }
}