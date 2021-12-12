import java.util.Scanner;

public class bai11 {
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
            if ( arr[i] > arr[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        System.out.println("Day con tang lien tuc dai nhat la: ");
        for(int i=x;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Pham Quang Minh 20183800");
    }
}
