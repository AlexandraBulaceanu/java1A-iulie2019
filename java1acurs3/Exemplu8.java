public class Exemplu8{
    public static void main(String [] args){
        int m[][];
        m=new int[4][];
        
        m[0]=new int[7];
        m[1]=new int[9];
        m[2]=new int[3];
        m[3]=new int[5];
        
        int c=1;
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                
                m[i][j]=c;
                c++;
            }
        }
        for(int []x:m){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}