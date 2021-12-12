import java.util.Scanner;

public class bai3 {
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
        // Tìm số nguyên tố
        findMin(arr);
        
        System.out.println("Phạm Quang Minh 20183800");
    }
    public static void findMin(int [] arr){
        int min = arr[0];
        // Tim gia tri min
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]) 
                min=arr[i];
        }
        System.out.println("Gia tri min cua day la:"+min);
        //in ra chi so min tuong ung voi gia tri nay
        for(int i=0; i<arr.length; i++ ){
            if(min==arr[i])
                System.out.println("chi so tuong ung gia tri min:"+i);
        }
    };
}
