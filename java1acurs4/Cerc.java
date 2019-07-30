public class Cerc extends Punct2D{
    double raza;//adaugare de atribut
    String x;//ascundere de atribut
    
    public Cerc(){
        this(0);
    }
    public Cerc(double raza){
        super(0,0);
        this.raza = raza;
        super.x = 10;
        this.x = "Buna";
        //this.x = 10;
        //super.raza = 9;
        super.y = 12;
        this.y = 12;
    }
    
    public double getArie(){
        return 3.14*this.raza*this.raza;
        //adaugare de comportament
    }
    public double getLungime(){
        return 2*3.14*this.raza;
    }
}