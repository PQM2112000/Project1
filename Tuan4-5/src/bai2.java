import java.util.Scanner;

public class bai2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.print("Nhap xau bat ki: ");
            String Xau = scanner.nextLine();
            int count= 0;
            for(int i=0; i<Xau.length()-2; i++){
                if ( Xau.charAt(i) == 'a' && Xau.charAt(i+1) == 'b' &&
                Xau.charAt(i+2) == 'c') count++;
            }
            System.out.print("So lan xuat hien abc: "+count);
    }
}
