import java.util.Scanner;

public class bai8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Xau s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Xau s2: ");
        String s2 = scanner.nextLine();
        int count = 0;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int check=1;
            for(int j=0;j<s1.length();j++){
                if ( s1.charAt(j) != s2.charAt(i+j) ){
                    check=0;
                    break;
                }
            }
            count+=check;
        }
        System.out.println("So lan s1 xuat hien trong s2: "+count);

    }
}
