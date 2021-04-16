import java.util.Scanner;
public class NUm2Word {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String[] textone={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
                    "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
                    "Ninteen"};
        String[] texttwo={"twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
        System.out.println("Enter a number between o and 999 : ");
        int num=in.nextInt();
        String words="";
        if (num>=0 & num<=19){
            words=textone[num];
            System.out.println("Given number is : "+words);
        }
        else if (num>=20 | num<=999){
            int[] numbers= Getdiv(num);
            if (numbers[0]!=0)
                words=words+textone[numbers[0]]+" hundrad";
            if (numbers[1]<=1)
                words=words+" and "+textone[numbers[1]*10+numbers[2]]+" ";
            else if (numbers[1]>1){
                words=words+" and "+texttwo[numbers[1]-2]+" ";
                if (numbers[2]>0)
                    words=words+textone[numbers[2]];
            }
            System.out.println("Number is : "+words);
        }
        else
            System.out.println("Please enter valid number");
        
    }
    public static int[] Getdiv(int num){
        int[] numbers=new int[3];
        numbers[0]=num/100;
        numbers[1]=(num/10)%10;
        numbers[2]=num%10;
        
        return numbers;
    }
}
