public class Exemplu5{
    public static void main(String [] args){
        char anotimp = 'v';
        switch(anotimp){
            
            case 'v': System.out.println("Este soare!"); 
                      break;
            case 'i': System.out.println("Este frig!");
                      break;
            case 'p':
            case 't': System.out.println("Ploua!");
                      break;
            default: System.out.println("Anotimpul nu exista!");
        }
    }
}