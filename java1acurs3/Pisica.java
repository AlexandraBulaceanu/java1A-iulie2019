public class Pisica{
    String nume;
    String culoare;
    int varsta;
    
    Pisica(){
        //System.out.pritnln("bad");
        this("Lea");
    }
    
    Pisica(String nume){}
    Pisica(String nume,String culoare){}
    Pisica(String nume, String culoare, int varsta){
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    Pisica(int varsta){}
   // Pisica(String culoare){}
    
    void spuneMiau(){
        System.out.println("Miau! Numele meu este "+this.nume);
    }
   /* double spuneMiau(){
        return 0.9;
    }
    nu il intereseaza tipul returnat
    */
    
}