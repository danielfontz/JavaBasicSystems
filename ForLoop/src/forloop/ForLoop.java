package forloop;

public class ForLoop {

    public static void main(String[] args) {
    int i, n = 0;
        for(i = 0; i <= 50; i++){
            System.out.println(n);
            n = n + 5;
        }
        System.out.println("********* End For *********");
        for(int x = i; x >= 0; x--){
            if(x % 2 == 0){
                System.out.println(x);
            }
        }
        System.out.println("********* End For *********");
    }
    
}
