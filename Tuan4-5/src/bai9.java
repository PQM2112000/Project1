import java.util.Scanner;

public class bai9 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Xau s: ");
        String s = scanner.nextLine();
        System.out.print("nhap 2 vi tri can doi ");
        int vt1 = scanner.nextInt();
        int vt2 = scanner.nextInt();
        StringBuilder s1 = new StringBuilder("");
        for(int i=0; i<s.length();i++){
            if(i == vt1) {
                s1.append(s.substring(0, vt1-1));
                s1.append(s.charAt(vt2-1));
                s1.append(s.substring(vt1, vt2-1));
            }
            if(i == vt2) {
                s1.append(s.charAt(vt1-1));
                s1.append(s.substring(vt2, s.length()));
            }
        }
        System.out.println("Xau sau khi doi vi tri: "+s1);

    }
}
