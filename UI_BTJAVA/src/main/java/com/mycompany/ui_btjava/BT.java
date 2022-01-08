/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ui_btjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PQMIT
 */
public class BT {

    private String str3;

    /**
     * Get the value of str3
     *
     * @return the value of str3
     */
    public String getStr3() {
        return str3;
    }

    /**
     * Set the value of str3
     *
     * @param str3 new value of str3
     */
    public void setStr3(String str3) {
        this.str3 = str3;
    }

    private int n2;

    /**
     * Get the value of n2
     *
     * @return the value of n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * Set the value of n2
     *
     * @param n2 new value of n2
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }


    private String str2;

    /**
     * Get the value of str2
     *
     * @return the value of str2
     */
    public String getStr2() {
        return str2;
    }

    /**
     * Set the value of str2
     *
     * @param str2 new value of str2
     */
    public void setStr2(String str2) {
        this.str2 = str2;
    }

    private String str;

    /**
     * Get the value of str
     *
     * @return the value of str
     */
    public String getStr() {
        return str;
    }

    /**
     * Set the value of str
     *
     * @param str new value of str
     */
    public void setStr(String str) {
        this.str = str;
    }

   //tuan1-bai1
   public String t1b1(){
       String s=new String();
       for(int i=0; i<100; i++){
            s+=(i+" ");
        }
   return("Pham Quang Minh 20183800"+s);
   }
   public String dbt1b1(){
       return ("Bài 01: In ra màn hình tất cả các hợp số <100\n" +
            "MSSV Họ ten-lop");
   }
   //tuan1-bai2
   public String t1b2(){
       int i =0;
        int num =0;
        int dem=1;
        String s= new String();
        s+=(" Pham Quang Minh 20183800 \n 20 so nguyen to dau tien la: \n");
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
                s+=(" "+i+"");
                dem++;
                
            }
            if(dem>20)break;
        }
        return s;
   }
   public String dbt1b2(){
       return ("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
   }
   //tuan1-bai3
   public String t1b3(){
       int i =0;
        int num =0;
        int dem=1;
        String s = new String();
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
                s+=(i+ " ");
                dem++;
            }
        }
        return ("Pham Quang Min 20183800 \n So nguyen to tu 1000 den 2000 là: \n" +s);
   }
   public String dbt1b3(){
       return ("Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
   }
   //tuan1-bai4
   public String t1b4(){
       int i =0;
       String s=new String();
        
        for (i = 1; i<=100 ; i++)
        {
            if (i%3==0 && i%7==0)
            {
                s+=(i+ " ");
            
            }
        }
        return ("Pham Quang Minh 20183800 \n" +
                " các số <100 và chia hết cho 3,7: \n "
                +s);
        
   }
   public String dbt1b4(){
       return ("Bài 04: In ra màn hình các số <100 và chia hết cho 3,7");
   }
   //tuan1-bai5
   public String dbt1b5(){
       return ("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
   }
   public String t1b5(){
        int i =0;
        String s= new String();
        for (i = 1000; i<=2000 ; i++)
        {
            if (i%3==0 && i%7==0 && i%5==0)
            {
                s+=(i+ " ");
            
            }
        }
        return ("Pham Quang Minh 20183800 \n" +
                " các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7:\n   "
                +s);
   }
   //tuan1-bai6
   public String dbt1b6(){
       return ("Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số \ncủa mình kể cả 1");
   }
   public String t1b6(){
       String s= new String();
        for (int number = 1; ;number++){
        int sum =0;
        for (int i = 1 ; i <= number;i++)
            if (number%i ==0) 
                sum+=i;
        if (sum/2.0 == number) s+= " "+number;
    }
   }
   //tuan1-bai7
   public String dbt1b7a(){
       return ("""
               B\u00e0i 07: Trong c\u00e1c s\u1ed1 t\u1ef1 nhi\u00ean <=100 h\u00e3y \u0111\u1ebfm xem c\u00f3 bao nhi\u00eau s\u1ed1
               a.Chia h\u1ebft cho 5""");
   }
   public String t1b7a(){
       int i =0;
       String s= new String();
        s="Pham Quang Minh 20183800 \n các số <100 và chia hết cho 5: \n";
        for (i = 1; i<=100 ; i++)
        {
            if (i%5==0)
            {
                s+= i+ " ";
            
            }
        }
        return s;
   }
   
   public String dbt1b7b(){
       return ("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\n" +
                "b.Chia 5 dư 1");
   }
   public String t1b7b(){
       int i =0;
       String s= new String();
        s="Pham Quang Minh 20183800 \n các số <100 và chia cho 5 du 1: \n";
        for (i = 1; i<=100 ; i++)
        {
            if (i%5==1)
            {
                s+=(i+ " ");
            
            }
        }
        return s;
   }
   
   public String dbt1b7c(){
       return ("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\n" +
                "c.Chia 5 dư 2");
   }
   public String t1b7c(){
       int i =0;
        String s= " Pham Quang Minh 20183800 \n các số <100 và chia cho 5 dư 2: \n ";
        for (i = 1; i<=100 ; i++)
        {
            if (i%5==2)
            {
                s+=(i+ " ");
            
            }
        }
        return s;
   }
   
   public String dbt1b7d(){
       return ("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\n" +
                "d, Chia 5 dư 3");
   }
   public String t1b7d(){
       int i =0;
       String s= new String();
        s="các số <100 và chia cho 5 du 3: \n";
        for (i = 1; i<=100 ; i++)
        {
            if (i%5==3)
            {
                s+= i+ " ";
            
            }
        }
        return s;
   }
   
   //tuan1-bai8
   public String dbt1b8(){
       return ("Bài 08: Cho số tự nhiên N bất kỳ (đã gán trước đó), tìm và in ra ước số nguyên tố nhỏ nhất của N. \n(Nhap N de Run)");
   }
   public String t1b8(){
       int i =0;
        int num =0;
        int N = this.getN();
        String s= "Pham Quang Minh 20183800 \n";

        //Scanner Nhap = new Scanner(System.in);
        //N = Nhap.nextInt();
        //Nhap.close();
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
            if (counter ==2 && N%i==0)
            {
                s+=" "+i;
                break;
            }
        }
        return s;
   }

    public BT() {
    }

    public BT(int n) {
        this.n = n;
    }
    private int n;

    /**
     * Get the value of n
     *
     * @return the value of n
     */
    public int getN() {
        return n;
    }

    /**
     * Set the value of n
     *
     * @param n new value of n
     */
    public void setN(int n) {
        this.n = n;
    }

   //tuan1-bai9
   public String dbt1b9(){
       return ("Bài 09: Cho số tự nhiên N>1 bất kỳ (đã gán trước đó). \nIn ra khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn \nVD: 9🡪3.3; 12🡪2.2.3.");
   }
   public String t1b9(){
        String s= "Pham Quang Minh 20183800 ";
        int n = this.getN();
        int dem;
        for(int i=2; i<=n; i++){
            dem=0;
            while( n % i == 0){
                ++dem;
                n/=i;
            }
            if(dem!=0){
                s+=(i);
                if(dem>1) s+=("^"+ dem);
                if(n>i){
                    s+="*";
                }
            }
        }
        
        return s;
   }
   //tuan1-bai10
   public String dbt1b10(){
       return ("Bài 10: Cho trước số tự nhiên N bất kỳ (đã gán trước đó). \nIn ra màn hình tất cả các ước số nguyên tố khác nhau của N.");
   }
   public String t1b10(){
       int i =0;
        int num =0;
        int N = this.getN();
        String s= "Pham Quang Minh 20183800 ";

        //System.out.println("Nhap so N bat ki: ");
        // Nhap = new Scanner(System.in);
        //N = Nhap.nextInt();
        //Nhap.close();
        s+=(" Cac uoc so nguyen to khac nhau cua N la: ");
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
                s+=i+" ";
            }
        }
        return s;
   }
   //tuan1-bai11
   public String dbt1b11(){
       return ("Bài 11: Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước. \nĐể lấy một số int ngẫu nhiên từ 0 đến n-1 ta dùng lệnh \nint i = Random.nextInt(n); ");
   }
   public String t1b11(){
       int[] arr = { 1, 2, 3, 4, 5 };
        int size = 5;
        String s= "Pham Quang Minh 20183800  ";
        ShuffleArray(arr, size);

        for (int i = 0; i < size; i++)
        {
            s+=(arr[i]+" ");
        }
       return s;
   }
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
   //tuan1-bai12
   public String dbt1b12(){
       return ("Bài 12. Viết chương trình nhập chiều cao h từ bàn phím, \nsau đó hiển thị các tam giác hình sao có chiều cao h như dưới đây. \nChú ý có kiểm tra điều kiện của h: 2<=h<=10. \nNếu h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại. \n(cho lựa chọn in tam giác xuôi hoặc ngược)");
   }
   public String t1b12(){
       int h=0;
       String s= "Pham Quang Minh 20183800 \n ";
       h=this.getN();
        //System.out.println("Nhap chieu cao h bat ki: ");
        ///Scanner Nhap = new Scanner(System.in);
        //h = Nhap.nextInt();
        //.close();
        for(;;){
            if(h>=2 && h<=10) break;
            //System.out.println("Nhap lai chieu cao h bat ki: ");
            //h = Nhap.nextInt();
        }
        
        for(int i = 1; i <= h; i++){
            for(int k = 1; k <= i; k++){
                s+=("* ");            
            }
            s+=("\n");
        }    
       return s;
   }
   
   //------------------------------------------------------------
   //------------------------------------------------------------
   //------------------------------------------------------------
   
   //tuan2-bai1
   public String dbt2b1(){
       return "Bài 01: Cho số tự nhiên N bất kỳ\n" +
                "Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)";
   }
   public String t2b1(){
       String s="Pham Quang Minh 20183800 \n";
       int N= this.getN();
        Double T= (double) 0;
        Double S=(double) 0;
        
        s+=("\n Nhap so tu nhien N: \n");
        //Scanner Nhap = new Scanner(System.in);
        //N = Nhap.nextInt();
        //Nhap.close();

        // Tinh tong 
        for(int i=1; i<=N; i++ ){
            T = T + i;
            S = S + 1/T;
        }
        s+= (S);
       return s;
   }
   //tuan2-bai2
   public String dbt2b2(){
       return "Bài 02: Cho số tự nhiên N bất kỳ, tính tổng\n" +
                "S= 1+ 1/2! + 1/3! + … + 1/N!";
   }
   public String t2b2(){
       String s="Pham Quang Minh 20183800 \n";
       int N= this.getN();
        Double T=(double) 1;
        Double S=(double) 0;
        
        s+=("\nNhap so tu nhien N: \n");
        //Scanner Nhap = new Scanner(System.in);
       // N = Nhap.nextInt();
        //Nhap.close();

        // Tinh tong 
        for(int i=1; i<=N; i++ ){
            T = T*i;
            S = S + 1/T;
        }
        s+=(S);
       return s;
   }
   //tuan2-bai3
   public String dbt2b3(){
       return "Bài 03: Cho số tự nhiên N bất kỳ,\n" +
                " tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)";
   }
   public String t2b3(){
       String s="Pham Quang Minh 20183800 \n";
        int N= this.getN();
        Double T=(double) 1;
        Double M =(double) 0;
        Double S=(double) 0;
        
        s+=("Nhap so tu nhien N: \n");
        //Scanner Nhap = new Scanner(System.in);
        //N = Nhap.nextInt();
        //Nhap.close();

        // Tinh tong 
        for(int i=1; i<=N; i++ ){
            T = T*i;
            M = M + T;
            S = S + 1/M;
        }
        s+=(S);
       return s;
   }
   //tuan2-bai4
   public String dbt2b4(){
       return "Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). \nTính số Fibonaxi thứ N.";
   }
   public String t2b4(){
       String S="Pham Quang Minh 20183800 \n";
       int f0 = 1;
        int f1 = 2;
        int fn = 3;
        int s=0;
        int n = this.getN();
        S+=("Nhap so N: \n");
        //Scanner Nhap = new Scanner(System.in);
        //n = Nhap.nextInt();
        //Nhap.close();
        if (n == 0 || n == 1) {
            s+=(n);
        } else {
            for (int i = 2; i < n; i++) {
                fn = f0 + f1;
                s=fn;
                f0 = f1;
                f1 = fn;
            }
        }
        S+=(s);
       return S;
   }
   
   //------------------------------------------------------------------------
      //------------------------------------------------------------------------
      //------------------------------------------------------------------------
      //------------------------------------------------------------------------
   
   //tuan3-bai1
   public String dbt3b1(){
       return "Bài  01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo \n thứ tự giảm dần. ";
   }
   public String t3b1(){
       String s= "Pham Quang Minh 20183800 \n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);        
        
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        s+=("Dãy số được sắp xếp giảm dần: \n");
        //show(arr,s);
        for (int i = 0; i < arr.length; i++) {
            s+=(arr[i] + " ");
        }
       return s;
   }
   /**
     * sắp xếp mảng số nguyên theo thứ tự giảm dần
     * 
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
    public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }      
    /**
     * in các phần tử của mảng ra màn hình
     * 
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
    public static void show(int [] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            s+=(arr[i] + " ");
        }
    }
   public static int[] ChuyenChuoiThanhMang(String chuoi, int n) {
        System.out.println("20183800 Pham Quang Minh");
        System.out.println(chuoi);
        int[] s = new int[n];
        int t =0;
        //System.out.print("Nhap ho va ten: ");
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ' ') {
                int start = i;
                for(int j=i+1; j<chuoi.length(); j++){
                    if(chuoi.charAt(j) == ' '){
                        s[t]=(Integer.parseInt(chuoi.substring(start+1,j)));
                        t++;
                    break;
                    }
                    if(j == chuoi.length()-1){
                        s[t]=(Integer.parseInt(chuoi.substring(start+1,chuoi.length())));
                        t++;
                    }
                }
                
            }
            if (i == 0) {
                s[t]=(Integer.parseInt(chuoi.substring(0, 1)));
                t++;
            }
            
        }
        //for(int k=0; k<n;k++){
         //   System.out.print(s[k]+" ");
        //}
        return s;
    }
   public static String[] ChuyenChuoiThanhMangChuoi(String chuoi, int n) {
        System.out.println("20183800 Pham Quang Minh\n");
        System.out.println(chuoi+"\n");
        String[] s = new String[n];
        int t =0;
        s=chuoi.split("-");
        //for(int k=0; k<n;k++){
         //   System.out.print(s[k]+" ");
        //}
        return s;
    }
   
   
   //tuan3-bai2
   public String dbt3b2(){
       return "Bài 02: Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này. \n ";
   }
   public String t3b2(){
       String s= "Pham Quang Minh 20183800 \n";
        //int [] arr = {10,22,80,30,5,6,32,10,25,12,3,7,6,1,36,48};
        String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
        
       return findSNT(arr, s);
    };
   public static String findSNT(int [] arr, String m){
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
                m+=("so nguyen to : "+ arr[i]+"\n");
            }
        }   
return m;        
    };
   //tuan3-bai3
   public String dbt3b3(){
       return "Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này \nvà tất cả các chỉ số  ứng với giá trị min này. ";
   }
   public String t3b3(){
        String s= "Pham Quang Minh 20183800 \n";
        String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
        
       return findMin(arr, s);
   }
   public static String findMin(int [] arr, String s){
        int min = arr[0];
        // Tim gia tri min
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]) 
                min=arr[i];
        }
        s+="Gia tri min cua day la:"+min+"\n";
        //in ra chi so min tuong ung voi gia tri nay
        for(int i=0; i<arr.length; i++ ){
            if(min==arr[i])
                s+=("chi so tuong ung gia tri min:"+i+"\n");
        }
        return s;
    };
    
   //tuan3-bai4
   public String dbt3b4(){
       return "Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này\n và tất cả các chỉ số ứng  với giá trị max này.";
   }
   public String t3b4(){
       String s= "Pham Quang Minh 20183800";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       return findMax(arr, s);
   }
   public static String findMax(int [] arr, String s){
        int max = arr[0];
        // Tim gia tri max
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) 
                max=arr[i];
        }
        s+=("Gia tri max cua day la:"+max+"\n");
        //in ra chi so max tuong ung voi gia tri nay
        for(int i=0; i<arr.length; i++ ){
            if(max==arr[i])
                s+=("chi so tuong ung gia tri max:"+i+"\n");
        }
        return s;
    };

   
   //tuan3-bai5
   public String dbt3b5(){
       return "Bài 05: Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu \nsố nguyên \ntố, có bao nhiêu hợp số. ";
   }
   public String t3b5(){
       String s="Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       return findSNTvHS(arr, s);
   }
   public static String findSNTvHS(int [] arr, String s){
        int num=0;
        int hopSo =0;
        int nguyenTo=0;
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
                nguyenTo++;
            }
            if(counter >=3)
            {
                hopSo++;
            }
        }         
        s+=("So so nguyen to: "+ nguyenTo+"\n");
        return s+=("So hop so: "+ hopSo+"\n");  
    };
   //tuan3-bai6
   
   public String dbt3b6(){
       return "Bài 06: Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên\n thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.\n ";
   }
   
   public String t3b6(){
       String s="Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       // sắp xếp dãy số theo thứ tự giảm dần
        sortDESC(arr);
       // Tìm số thỏa mãn: là ước của một số trong dãy
        return findSTM(arr,s);
   }   
    public static String findSTM(int [] arr, String s){
        for(int i=0; i<arr.length ; i++){
            for(int j=i; j>=0; j--){
                if(arr[i]!=arr[j]&& arr[j]%arr[i]==0){
                    s+=("Số thỏa man "+arr[i]+"\n");
                    break;
                }
            }
        }      
        return s;
    };
    
   //tuan3-bai7
   public String dbt3b7(){
       return "Bài 07: Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng\n bất cứ số nào trong dãy trên.";
   }
   public String t3b7(){
       String s="Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []a =ChuyenChuoiThanhMang(str, n);
       int []d = new int [n];
        for(int i=0; i<n;i++){
            d[i]=0;
       } 
       
       for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if ( a[i] == a[j] ) {
                    d[i]=1;
                    d[j]=1;
                }
        }
        int min_val=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if ( min_val > a[i] && d[i] == 0 ) min_val=a[i];
        }
        
       return  s+=("Gia tri nho nhat khong bi trung: "+min_val);
   }
   //tuan3-bai8
   public String dbt3b8(){
       return "Bài 08: Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra \n màn hình các số còn lại. {10,22,80,30,5,6,32,10,25,12,3,7,6,1,36,48,0,5,0}";
   }
   public String t3b8(){
       String s= "Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       for(int i=0;i<n;i++){
            if ( arr[i] != 0  ) s+= (" "+arr[i]+" ");
        }
       return s;
   }
   //tuan3-bai9
   public String dbt3b9(){
       return "Bài 09: Cho một dãy số nguyên bất kỳ, cho trước 1 số c. Hãy đếm có bao nhiêu số của dãy \n trên =c; >c; <c.";
   }
   public String t3b9(){
       String s= "Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       int c = this.getN2();
       System.out.print( c+"\n");
        int p=0,q=0, m =0;
        for(int i=0;i<n;i++){
            if ( arr[i] < c )  p++;
            if ( arr[i] == c ) q++;
            if ( arr[i] > c)  m++;
        }
        s+=("So cac so nho hon "+c+": "+p+"\n");
         s+=("So cac so bang "+c+": "+q+"\n");
         s+=("So cac so lon hon "+c+": "+m+"\n");
       return s;
   }
   //tuan3-bai10
   public String dbt3b10(){
       return "Bài 10: Cho một dãy số nguyên bất kỳ, hãy tìm ra 1 một dãy số liền nhau dài nhất bao gồm \ncác số bằng nhau. Hãy in ra số lượng và các chỉ số đầu tiên của dãy con này.\n ";
   }
   public String t3b10(){
       String s= "Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       int d=1,x=0,max_long=0;
        for(int i=1;i<n;i++){
            if ( arr[i] == arr[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        s+=("Day bang nhau dai nhat co do dai la: "+max_long+"\n");
        s+=("Day bang nhau dai nhat bat dau tu: "+x+"\n");
       return s;
   }
   //tuan3-bai11
   public String dbt3b11(){
       return "Bài 11: Cho một dãy số nguyên bất kỳ. Hãy tìm 1 một dãy con liên tục đơn điệu tăng dài nhất \ncủa dãy trên.{10,22,80,30,5,6,32,10,25,12,3,7,6,1,36,48}";
   }
   public String t3b11(){
       String s= "Pham Quang Minh 20183800\n";
       String str = this.getStr();
        int n = this.getN();
        int []arr =ChuyenChuoiThanhMang(str, n);
       int d=1,x=0,max_long=0;
        for(int i=1;i<n;i++){
            if ( arr[i] > arr[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        s+=("Day con tang lien tuc dai nhat la: \n");
        for(int i=x;i<n;i++){
            s+=(" "+arr[i]+" ");
        }
       return s;
   }
   //tuan3-bai12
   public String dbt3b12(){
       return "Bài 12: Dãy số a[ ] được gọi là dãy con của b[ ] nếu từ b [ ] xóa đi 1 vài số sẽ thu được \n a[ ]. Cho trước 2 dãy số nguyên a[ ]; b[ ]. Hãy kiểm tra xem a[ ] có là dãy con \n của b[ ] hay không?.";
   }
   public String t3b12(){
       String s= "Pham Quang Minh 20183800\n";
       String str = this.getStr();
       String str2 = this.getStr2();
        int n = this.getN();
        int m = this.getN2();
        int []a =ChuyenChuoiThanhMang(str, n);
       int []b=ChuyenChuoiThanhMang(str2, m);
       
       int j=0;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( b[i] == a[j] ) j++;
            }
        }
        if ( j == n ){
            s+=("A la day con cua B ");
        }
        else{
            s+=("A khong la day con cua B ");
        }
       return s;
   }
   //tuan3-bai13
   public String dbt3b13(){
       return "Bài 13: Nhập vào kích thước ô vuông n*n, kiểm tra 3<=n<= 8. Hiển thị ra màn hình kết quả như màn hình";
   }
   public String t3b13(){
       String s= "Pham Quang Minh 20183800";
       int [] arr = {10,22,80,30,5,6,32,10,25,12,3,7,6,1,36,48};
       return findMax(arr, s);
   }
   
   //--------------------------------------------------------------------------------------------
   //--------------------------------------------------------------------------------------------
   //--------------------------------------------------------------------------------------------
   //Tuan 4
   //Tuan4-bai1
   public String dbt4b1(){
       return "Bài 01: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. \nHãy xóa đi các dấu cách thừa và in ra họ tên chính xác.";
   }
   public String t4b1(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.print("Nhap ho va ten: \n");
            //StringBuilder ten = new StringBuilder(scanner.nextLine());
            String ten = this.getStr();
            for(int i=0;i<ten.length()-1;i++){
                if ( ten.charAt(i) == ' ' && ten.charAt(i+1) == ' ' ) {
                    //ten.deleteCharAt(i);
                    ten = ten.substring(0, i) + ten.substring(i + 1);
                    i--;
                }
            }
            
            if ( ten.charAt(0) == ' ' ) 
                //ten.deleteCharAt(0);
                ten = ten.substring(1) ;
            if ( ten.charAt(ten.length()-1) == ' ' ) 
                //ten.deleteCharAt(ten.length()-1);
                ten = ten.substring(0,ten.length()-1);
            s+=("Ho va ten sau khi chinh sua:\n "+ten.toString());
       return s;
   }
   //Tuan4-bai2
   public String dbt4b2(){
       return "Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”";
   }
   public String t4b2(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.print("Nhap xau bat ki: ");
       String Xau = this.getStr();
            //String Xau = scanner.nextLine();
            int count= 0;
            for(int i=0; i<Xau.length()-2; i++){
                if ( Xau.charAt(i) == 'a' && Xau.charAt(i+1) == 'b' &&
                Xau.charAt(i+2) == 'c') count++;
            }
            s+=("So lan xuat hien abc: "+count+"\n");
       return s;
   }
   //Tuan4-bai3
   public String dbt4b3(){
       return "Bài 03: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này";
   }
   public String t4b3(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.println("Nhap xau bat ki: ");
            String Xau = this.getStr();
            String phanTen="";
            for(int i=Xau.length()-1; i>0; i--){
                if ( Xau.charAt(i) == ' '){
                    phanTen = Xau.substring(i+1, Xau.length());
                    break;
                }
            }
            s+=("Phan ten: "+ phanTen+"\n");
       return s;
   }
   //Tuan4-bai4
   public String dbt4b4(){
       return "Bài 04: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này";
   }
   public String t4b4(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.println("Nhap xau bat ki: ");
            String Xau = this.getStr();
            String phanHo="";
            for(int i=0; i<Xau.length()-1; i++){
                if ( Xau.charAt(i) == ' '){
                    phanHo = Xau.substring(0, i);
                    break;
                }
            }
            s+=("Phan ten: "+ phanHo);
       return s;
   }
   //Tuan4-bai5
   public String dbt4b5(){
       return "Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. \nHãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.";
   }
   public String t4b5(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.println("Nhap xau 01: ");
            String Xau = this.getStr();
            StringBuilder Xau2 = new StringBuilder("");
            for(int i=0; i<Xau.length(); i++){
                if ( Xau.charAt(i) == '0'){
                    Xau2.append('1');
                };
                if ( Xau.charAt(i) == '1'){
                    Xau2.append('0');
                };
            };
            s+=("Xau sau khi doi: "+ Xau2);
       return s;
   }
   //Tuan4-bai6
   public String dbt4b6(){
       return "Bài 06: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.";
   }
   public String t4b6(){
       String m = "Pham Quang Minh 20783800\n";
       System.out.println("Nhap xau: ");
            String s = this.getStr();
            StringBuilder s1 = new StringBuilder("");
            for(int i=s.length()-1; i>=0; i--){
                s1.append(s.charAt(i));
            }
            m+=("Xau sau khi doi: "+ s1);
       return m;
   }
   //Tuan4-bai7
   public String dbt4b7(){
       return "Bài 07: Cho trước xâu ký tự S. Hãy biến đổi S theo quy tắc sau: \nChữ số thì biến thành “$”, ký tự thì giữ nguyên.";
   }
   public String t4b7(){
       String m = "Pham Quang Minh 20183800\n";
        System.out.println("Nhap xau: ");
            String s = this.getStr();
            StringBuilder s1 = new StringBuilder("");
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0' ||s.charAt(i) == '1' ||
                s.charAt(i) == '2' || s.charAt(i) == '3' ||
                s.charAt(i) == '4' ||s.charAt(i) == '5' ||
                s.charAt(i) == '6' ||s.charAt(i) == '7' ||
                s.charAt(i) == '8'|| s.charAt(i) =='9')
                {s1.append('$');}
                else s1.append(s.charAt(i));
            }
            m+=("\ns sau khi doi: "+ s1);
       return m;
   }
   //Tuan4-bai8
   public String dbt4b8(){
       return "Bài 08: Cho trước 2 xâu ký tự S1, S2. \nHãy đếm xem xâu S1 xuất hiện trong S2 tại bao nhiêu vị trí.";
   }
   public String t4b8(){
       String s = "Pham Quang Minh 20183800\n";
        System.out.print("Xau s1: ");
        String s1 = this.getStr();
        System.out.print("Xau s2: ");
        String s2 = this.getStr2();
        int count = 0;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int check=1;
            for(int j=0;j<s1.length();j++){
                if ( s1.charAt(j) != s2.charAt(i+j) ){
                    check=0;
                    break;
                }
            }
            count+=check;
        }
        s+=("So lan s1 xuat hien trong s2: "+count);
       return s;
   }
   //Tuan4-bai9
   public String dbt4b9(){
       return "Bài 09: Cho xâu S và 2 chỉ số i, j. Hãy đổi chỗ 2 vị trí i, j trong S.";
       
   }
   public String t4b9(){
       String m = "Pham Quang Minh 20183800\n";
       System.out.print("Xau s: ");
        String s = this.getStr();
        System.out.print("nhap 2 vi tri can doi ");
        int vt1 = this.getN();
        int vt2 = this.getN2();
        StringBuilder s1 = new StringBuilder("");
        for(int i=0; i<s.length();i++){
            if(i == vt1) {
                s1.append(s.substring(0, vt1-1));
                s1.append(s.charAt(vt2-1));
                s1.append(s.substring(vt1, vt2-1));
            }
            if(i == vt2) {
                s1.append(s.charAt(vt1-1));
                s1.append(s.substring(vt2, s.length()));
            }
        }
        m+=("Xau sau khi doi vi tri: "+s1);
       return m;
   }
   //Tuan4-bai10
   public String dbt4b10(){
       return "Bài 10: Cho mảng xâu ký tự S1, S2, ..Sn. Hãy tìm và in ra phần tử xâu có độ dài lớn nhất.";
       
   }
   public String t4b10(){
       String m = "Pham Quang Minh 20183800\n";
        //System.out.print("Nhap so luong xau n= ");
        String str = this.getStr();
        int n = this.getN();
        String []s =ChuyenChuoiThanhMangChuoi(str, n);
        int XauMax = 0, XauCT = 0;
        //String s[] = new String[n];
        //s[0] = scanner.nextLine();
        //System.out.print("Nhap mang cac xau: ");
        for(int i=0; i<n; i++){
            if ( s[i].length() > XauMax ) {
                XauMax=s[i].length();
                XauCT=i;
            }
        }
        m+=("Xau co do dai lon nhat: "+s[XauCT]);
       return m;
   }
   
   //Tuan4-bai11
   
   public String dbt4b11(){
       return "Bài 11: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.";
       
   }
   public String t4b11(){
       String m = "Pham Quang Minh 20183800\n";
        //System.out.print("Nhap so luong xau n= ");
        String str = this.getStr();
        int n = this.getN();
        String []s =ChuyenChuoiThanhMangChuoi(str, n);
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap so luong hoc sinh n= ");
        //int n = scanner.nextInt();
        int count=0;
        //String s[] = new String[n];
        
        for(int i=0; i<n; i++){
            String Ten="";
            for(int j=s[i].length()-1; j>0 ; j--){
                if(s[i].charAt(j)==' ') 
                    Ten = s[i].substring(j+1, s[i].length());
                if(Ten.equals("An")) {count++;break;};
            }
        }
        m+=("So hoc sinh ten An la: "+ count);
       return m;
   }
   //Tuan4-bai12
   
   public String dbt4b12(){
       return "Bài 12: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là  “Thị”.";
       
   }
   public String t4b12(){
       String m = "Pham Quang Minh 20183800\n";
        //System.out.print("Nhap so luong xau n= ");
        String str = this.getStr();
        int n = this.getN();
        String []s =ChuyenChuoiThanhMangChuoi(str, n);
        
        int x=0;
        for(int j=0;j<n;j++){
            String ho="",dem="",ten="";
            for(int i=0;i<s[j].length();i++){
                if ( s[j].charAt(i) == ' ' ) {
                    ho = s[j].substring(0,i);
                    break;
                }
            }
            for(int i=s[j].length()-1;i>0;i--){
                if ( s[j].charAt(i) == ' ' ) {
                    ten = s[j].substring(i+1,s[j].length());
                    break;
                }
            }
            dem = s[j].substring(ho.length()+1,s[j].length()-ten.length()-1);
            if ( dem.equals("Thi") ) x++;
        }
        m+=("So hoc sinh ten dem Thi la: "+x);
       return m;
   }
   //Tuan4-bai13
   
   public String dbt4b13(){
       return "Bài 13: Cho danh sách họ tên đầy đủ học sinh. \nHãy đếm xem có bao nhiêu bạn  có tên bắt đầu bằng chữ “H”.";
       
   }
   public String t4b13(){
       String m = "Pham Quang Minh 20183800\n";
        //System.out.print("Nhap so luong xau n= ");
        String str = this.getStr();
        int n = this.getN();
        String []s =ChuyenChuoiThanhMangChuoi(str, n);
        int count=0;
        
        for(int i=0; i<n; i++){
            for(int j=s[i].length()-1; j>0 ; j--){
                if(s[i].charAt(j)==' ' && s[i].charAt(j+1)=='H') 
                    {count++;break;}
            }
        }
        m+=("So hoc sinh ten bat dau chu H la: "+ count);
       return m;
   }
   //Tuan4-bai14
   public String dbt4b14(){
       return "Bài 14: Dãy xâu ký tự S1, S2,… được cho theo quy tắc sau: S1= “1111100000”, \nSk thu được từ Sk-1 bằng cách thay đổi cho lần lượt các vị trí  1-2;  2-3;  3-4; 4-5; \n5-6;  6-7; 7-8;  8-9; 9-10. Cho trước số tự nhiên N, Hãy in ra xâu Sn.";
       
   }
   public String t4b14(){
       String m = "Pham Quang Minh 20183800\n";
        //System.out.print("Nhap so luong xau n= ");
        int n = this.getN();
        StringBuilder s = new StringBuilder("1111100000");
        for (int i = 1; i < n; i++) {
            s.insert(0, s.charAt(9));
            s.deleteCharAt(9);
        }
        m+=("Xau thu n la: " + s.toString());       
        return m;
   }
   
   //Tuan4-bai15
   public String dbt4b15(){
       return "Bài 15: Cho trước 2 xâu ký tự S, S2. Hãy chèn xâu S1 vào giữa xâu S2 và in kết quả.";
   }
   public String t4b15(){
       String m = "Pham Quang Minh 20183800\n";
       String s,s1,s2;
        System.out.print("Nhap xau s: ");
        s = this.getStr();
        System.out.print("Nhap xau s2: ");
        s2 = this.getStr2();
        System.out.print("Nhap xau s1: ");
        s1 = this.getStr3();
        String s3 = s + s1 + s2;
        
        m+=("Ket qua abc: "+s3);
       return m;
   }
   //Tuan4-bai16
   public String dbt4b16(){
       return "Bài 16: Cho trước 2 xâu S1, S2. Hãy xét xem xâu S1 có phải là xâu con của S2 \nnếu xóa bỏ vài kí tự của xâu S2 ta được xâu S1.";
   }
   public String t4b16(){
       String s = "Pham Quang Minh 20183800\n";
       System.out.print("Nhap xau s1: ");
        String s1 = this.getStr();
        System.out.print("Nhap xau s2: ");
        String s2 = this.getStr2();
        int n = s1.length(),m = s2.length();
        int j=0;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( s2.charAt(i) == s1.charAt(j) ) j++;
            }
        }
        if ( j == n ){
           s+=("s1 la xau con cua s2 ");
        }
        else{
            s+=("s1 khong la xau con cua s2 ");
        }
       return s;
   }
}
