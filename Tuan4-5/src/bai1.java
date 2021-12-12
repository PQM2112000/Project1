import java.util.Scanner;

public class bai1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("20183800 Pham Quang Minh");
            System.out.print("Nhap ho va ten: ");
            StringBuilder ten = new StringBuilder(scanner.nextLine());
            
            for(int i=0;i<ten.length()-1;i++){
                if ( ten.charAt(i) == ' ' && ten.charAt(i+1) == ' ' ) {
                    ten.deleteCharAt(i);
                    i--;
                }
            }
            
            if ( ten.charAt(0) == ' ' ) 
                ten.deleteCharAt(0);
            if ( ten.charAt(ten.length()-1) == ' ' ) 
                ten.deleteCharAt(ten.length()-1);
            System.out.print("Ho va ten sau khi chinh sua: "+ten.toString());
    }
}
