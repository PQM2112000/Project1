import java.util.Scanner;

public class bai4 {
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
        // Tìm gia tri max
        findMax(arr);
        
        System.out.println("Phạm Quang Minh 20183800");
    }
    public static void findMax(int [] arr){
        int max = arr[0];
        // Tim gia tri max
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) 
                max=arr[i];
        }
        System.out.println("Gia tri max cua day la:"+max);
        //in ra chi so max tuong ung voi gia tri nay
        for(int i=0; i<arr.length; i++ ){
            if(max==arr[i])
                System.out.println("chi so tuong ung gia tri max:"+i);
        }
    };
}
