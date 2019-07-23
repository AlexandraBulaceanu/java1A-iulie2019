public class Punct{
    int x;
    int y;
    static int z;
   
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    double getDistance(Punct p){
         //this,p
         double rez = Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
         return rez;
    }
    
    static void afisareZ(){
        //System.out.println(this.x);
        System.out.println(z);
    }
}