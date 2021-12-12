import java.util.Scanner;

public class bai5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.println("Nhap xau 01: ");
            String Xau = scanner.nextLine();
            StringBuilder Xau2 = new StringBuilder("");
            for(int i=0; i<Xau.length(); i++){
                if ( Xau.charAt(i) == '0'){
                    Xau2.append('1');
                };
                if ( Xau.charAt(i) == '1'){
                    Xau2.append('0');
                };
            };
            System.out.println("Xau sau khi doi: "+ Xau2);
    }
}
