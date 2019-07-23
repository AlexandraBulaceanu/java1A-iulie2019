public class Exemplu9{
    public static void main(String [] args){
        int []x={10,5,7,6,9,8};
        int [][]y={{1,8,3},{7,5,9},{2}};
        
        //int []z=new int[4]{6,4,7,8};
        int []z=new int[]{6,4,7,8};
        int [][][]w = new int[4][][];
        x=z;
        y[0]=z;
    }

}