public class Cilindru extends Cerc{
    double h;
    @Override
    public double getArie(){
       
        //2*A+L*h
        return 2*super.getArie()+super.getLungime()*this.h;
    }
}