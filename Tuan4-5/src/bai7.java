import java.util.Scanner;

public class bai7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.println("Nhap xau: ");
            String s = scanner.nextLine();
            StringBuilder s1 = new StringBuilder("");
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0' ||s.charAt(i) == '1' ||
                s.charAt(i) == '2' || s.charAt(i) == '3' ||
                s.charAt(i) == '4' ||s.charAt(i) == '5' ||
                s.charAt(i) == '6' ||s.charAt(i) == '7' ||
                s.charAt(i) == '8'|| s.charAt(i) =='9')
                {s1.append('$');}
                else s1.append(s.charAt(i));
            }
            System.out.println("s sau khi doi: "+ s1);
    }
}
