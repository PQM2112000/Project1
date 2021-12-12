import java.util.Scanner;

public class bai6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.println("Nhap xau: ");
            String s = scanner.nextLine();
            StringBuilder s1 = new StringBuilder("");
            for(int i=s.length()-1; i>=0; i--){
                s1.append(s.charAt(i));
            }
            System.out.println("Xau sau khi doi: "+ s1);
    }
}
