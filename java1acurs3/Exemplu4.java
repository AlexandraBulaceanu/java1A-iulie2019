public class Exemplu4{
    public static void main(String [] args){
        Punct p1 = new Punct(2,3);
        Punct p2 = new Punct(4,5);
        
        p1.z = 10;
        p2.z = 40;
        Punct.z = 70;
        System.out.println(p1.z);
        System.out.println(p2.z);
        System.out.println(Punct.z);
        
        
    }
}