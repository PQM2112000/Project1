public class Bai6 {
    public static void main(String[] args) {
        System.out.println("5 số hoàn hảo đầu tiên là : ");
        for (int number = 1; ;number++){
        int sum =0;
        for (int i = 1 ; i <= number;i++)
            if (number%i==0) 
                sum+=i;
            if (sum/2.0 == number)
                 System.out.println(number);
    }
    }
}
