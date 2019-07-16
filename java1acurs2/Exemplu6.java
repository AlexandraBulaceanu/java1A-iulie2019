public class Exemplu6{
    public static void main(String [] args){
        Pisica p1;
        Pisica p2;
        
        p1 = new Pisica("Lea",12,"gri");
        p2=p1;
        /*p1.nume="Vasile";
        p1.varsta=40;
        p1.culoare="portocaliu";
        */
        
        System.out.println(p1.nume);
        System.out.println(p1.varsta);
        System.out.println(p1.culoare);
        System.out.println(p1.greutate);
        System.out.println(p2.nume);
        System.out.println(p2.varsta);
        System.out.println(p2.culoare);
    } 
}