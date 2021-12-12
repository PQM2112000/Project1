import java.util.Scanner;

public class bai3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.println("Nhap xau bat ki: ");
            String Xau = scanner.nextLine();
            String phanTen="";
            for(int i=Xau.length()-1; i>0; i--){
                if ( Xau.charAt(i) == ' '){
                    phanTen = Xau.substring(i+1, Xau.length());
                    break;
                }
            }
            System.out.println("Phan ten: "+ phanTen);
    }
}
