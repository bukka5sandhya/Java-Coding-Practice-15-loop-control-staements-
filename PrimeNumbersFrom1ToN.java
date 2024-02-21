import java.util.Scanner;
public class PrimeNumbersFrom1ToN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //25(input)
        int count = 0;
        for(int i=1;i<=N;i++){
            count = 0;
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    count = count +1;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}