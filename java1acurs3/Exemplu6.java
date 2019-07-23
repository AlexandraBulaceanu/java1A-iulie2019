public class Exemplu6{
    public static void main(String [] args){
        int []x = new int[5];
        for(int i=0;i<x.length;i++){
            
            x[i]=i+1;
        }
        int i=2;
        for(int a:x){
            System.out.println(a);
            //a=20;
        }
    }
}