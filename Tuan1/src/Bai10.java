import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        int N = 0;
        System.out.println("Nhap so N bat ki: ");
        Scanner Nhap = new Scanner(System.in);
        N = Nhap.nextInt();
        System.out.println("Cac uoc so nguyen to khac nhau cua N la: ");
        for (i = 1; i<=N; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2 && N%i==0)
            {
                System.out.print(i+" ");
            }
        }
        Nhap.close();
    }
}
