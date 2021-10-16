import java.util.Random;

public class Bai11 {
    static void ShuffleArray (int []arr, int n){
        Random rand = new Random();
        for(int i=0; i<n; i++){
            int position1 = rand.nextInt(n);
            if(position1!=i){
                System.out.println("Truoc khi Swap: "+arr[i]+"  "+arr[position1]);
                int temp=arr[i];
                arr[i]=arr[position1];
                arr[position1]=temp;
                System.out.println("Sau khi Swap: "+arr[i]+"  "+arr[position1]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = 5;
        ShuffleArray(arr, size);

        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
