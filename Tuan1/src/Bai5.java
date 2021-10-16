public class Bai5 {
    public static void main(String[] args) {
        int i =0;
        System.out.println("các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
        for (i = 1000; i<=2000 ; i++)
        {
            if (i%3==0 && i%7==0 && i%5==0)
            {
                System.out.print(i+ " ");
            
            }
        }
    }
}
