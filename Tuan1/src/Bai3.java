public class Bai3 {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        int dem=1;
        System.out.println("So nguyen to tu 1000 den 2000 là: ");
        for (i = 1000; i<=2000 ; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.print(i+ " ");
                dem++;
            }
        }
    }
}

