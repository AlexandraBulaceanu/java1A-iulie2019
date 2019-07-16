public class Exemplu3{
    public static void main(String [] args){
        int i=1;
        while(i<=10){
            
            System.out.println(i);
            i++;
        }
        
        while(true){
            break;
        }
        System.out.println("never");
        //while(false){}
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
}
}