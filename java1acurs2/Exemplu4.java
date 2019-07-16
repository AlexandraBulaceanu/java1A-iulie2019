public class Exemplu4{
    public static void main(String [] args){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        int i=1;
        System.out.println();
        for(;;)
        {
            System.out.println(i);
            i++;
            if(i==11) break;
        }
        for(int h=2,j=6;(h<=5)&&(j>=4);h++,j--)
        {
            System.out.println("buna");
        }
        //while(true){}
    }
}