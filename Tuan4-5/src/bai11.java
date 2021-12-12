import java.util.Scanner;
public class bai11 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap so luong hoc sinh n= ");
        int n = scanner.nextInt();
        int count=0;
        String s[] = new String[n];
        s[0] = scanner.nextLine();
        System.out.print("Nhap mang cac xau: ");
        for(int i=0; i<n; i++){
            s[i] = scanner.nextLine();
        }
        for(int i=0; i<n; i++){
            String Ten="";
            for(int j=s[i].length()-1; j>0 ; j--){
                if(s[i].charAt(j)==' ') 
                    Ten = s[i].substring(j+1, s[i].length());
                if(Ten.equals("An")) {count++;break;};
            }
        }
        System.out.println("So hoc sinh ten An la: "+ count);
    }
}
