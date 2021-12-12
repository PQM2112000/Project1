import java.util.Scanner;
public class bai12 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap so hoc sinh: ");
        int n = scanner.nextInt();
        System.out.println("Nhap danh sach ten: ");
        scanner.nextLine();
        int x=0;
        for(int j=0;j<n;j++){
            String s = scanner.nextLine();
            String ho="",dem="",ten="";
            for(int i=0;i<s.length();i++){
                if ( s.charAt(i) == ' ' ) {
                    ho = s.substring(0,i);
                    break;
                }
            }
            for(int i=s.length()-1;i>0;i--){
                if ( s.charAt(i) == ' ' ) {
                    ten = s.substring(i+1,s.length());
                    break;
                }
            }
            dem = s.substring(ho.length()+1,s.length()-ten.length()-1);
            if ( dem.equals("Thi") ) x++;
        }
        System.out.println("So hoc sinh ten dem Thi la: "+x);
    }
}
