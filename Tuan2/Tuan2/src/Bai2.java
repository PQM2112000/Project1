import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int N= 0;
        Double T=(double) 1;
        Double S=(double) 0;
        
        System.out.println("Nhap so tu nhien N: ");
        Scanner Nhap = new Scanner(System.in);
        N = Nhap.nextInt();
        Nhap.close();

        // Tinh tong 
        for(int i=1; i<=N; i++ ){
            T = T*i;
            S = S + 1/T;
        }
        System.out.println(S);
    }
}
