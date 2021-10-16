import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int h=0;
        System.out.println("Nhap chieu cao h bat ki: ");
        Scanner Nhap = new Scanner(System.in);
        h = Nhap.nextInt();
        Nhap.close();
        for(;;){
            if(h>=2 && h<=10) break;
            System.out.println("Nhap lai chieu cao h bat ki: ");
            h = Nhap.nextInt();
        }
        
        for(int i = 1; i <= h; i++){
            for(int k = 1; k <= i; k++){
                System.out.printf("* ");            
            }
            System.out.printf("\n");
        }    
    }
}
