import java.util.Scanner;

public class bai10 {
    public static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        int d=1,x=0,max_long=0;
        for(int i=1;i<n;i++){
            if ( arr[i] == arr[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        System.out.println("Day bang nhau dai nhat co do dai la: "+max_long);
        System.out.println("Day bang nhau dai nhat bat dau tu: "+x);
    }
}
