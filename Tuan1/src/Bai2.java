public class Bai2 {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        int dem=1;
        System.out.println("20 so nguyen to dau tien la");
        for (i = 1;; i++)
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
                System.out.println("So nguyen to thu "+dem+" la: "+i);
                dem++;
            }
            if(dem>20)break;
        }
    }
}
