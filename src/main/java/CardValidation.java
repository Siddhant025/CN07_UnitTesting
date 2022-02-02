import java.util.Scanner;

public class CardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Credit card Number");
        long num=sc.nextLong();
//
//        System.out.println(Mod10Check(4012888888881881L));

        System.out.println(Mod10Check(num));
    }

    public static Boolean Mod10Check(long num){
        if (getSize(num)<13 || getSize(num)>16){
            return false;
        }

        int digitSum=DoubleEvenSum(num)+OddSum(num);
//        System.out.println(digitSum);
        return digitSum % 10 == 0;
    }


    public static int getSize(long num){
        String n = num+"";
        return n.length();
    }

    public static int DoubleEvenSum(long num){
        int sum=0;
        int size=getSize(num);

        String n = num+"";
        for (int i=size-2;i>=0;i-=2){
            int doubling=Integer.parseInt(n.charAt(i)+"")*2;

            if (doubling<9){
                sum+=doubling;
            }
            else{
                sum+=doubling/10 + doubling%10;
            }
        }
        return sum;
    }

    public static int OddSum(long num){
        int sum=0;
        int size=getSize(num);

        String n = num+"";
        for (int i=size-1;i>=0;i-=2){
            sum+=Integer.parseInt(n.charAt(i)+"");
        }
        return sum;
    }

}
