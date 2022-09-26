public class Tugas3 {
    public static void main(String[] args){
        int P = 0;
        int Q = 0;
        int R = 0;
    
        if(P > Q){
            if(R > P){
                System.out.println(R);
            }else{
                System.out.println(P);
            }
        }else{
            if(Q > R){
                System.out.println(Q);
            }else{
                System.out.println(R);
            }
        }
    }
}
