public class Exemplu7{
    public static void main(String args[]){
        Punct []p1=new Punct[5];
        int i;
        
        for(i=0;i<p1.length;i++){
            p1[i]=new Punct(i,i+1);
        }
        for(Punct a:p1){
            a.x=10;
            a.y=7;
        }
        for(i=0;i<p1.length;i++){
            System.out.println(p1[i].x+" "+p1[i].y);
        }
    }
}