import java.util.Scanner;
public class NumbersInRegtangularPattern3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //2(input)
        int N = input.nextInt(); //3(input)
        int sum = 1;
        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
    
}

//output
//1 2 3 
//4 5 6