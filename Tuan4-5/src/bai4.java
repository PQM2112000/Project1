import java.util.Scanner;

public class bai4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.println("Nhap xau bat ki: ");
            String Xau = scanner.nextLine();
            String phanHo="";
            for(int i=0; i<Xau.length()-1; i++){
                if ( Xau.charAt(i) == ' '){
                    phanHo = Xau.substring(0, i);
                    break;
                }
            }
            System.out.println("Phan ten: "+ phanHo);
    }
}
