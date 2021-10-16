public class Bai4 {
    public static void main(String[] args) {
        int i =0;
        System.out.println("các số <100 và chia hết cho 3,7: ");
        for (i = 1; i<=100 ; i++)
        {
            if (i%3==0 && i%7==0)
            {
                System.out.print(i+ " ");
            
            }
        }
    }
}

