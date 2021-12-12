import java.util.Scanner;

public class bai2 {
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
        findSNT(arr);
        
        System.out.println("Phạm Quang Minh 20183800");
    }
    public static void findSNT(int [] arr){
        int num=0;
        for(int i=0; i<arr.length ; i++){
            int counter=0;
            for(num=arr[i]; num>=1 ; num--)
            {
                if(arr[i]%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.println("so nguyen to : "+ arr[i]);
            }
        }           
    };
}
