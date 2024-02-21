import java.util.Scanner;
public class PrimeNumbersFromMToN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //18(input) 
        int N = input.nextInt(); //40(input)
        int count = 0;

        for(int i=M;i<=N;i++){
            count = 0;
            for(int j =1;j<=i;j++){
                
                if(i % j  == 0){
                    count = count+1;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
    
}
