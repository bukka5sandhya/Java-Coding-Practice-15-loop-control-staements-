import java.util.Scanner;
public class HalfPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5(input)
        int sum = 1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();

        }
    }
    
}
//output 
//1 
//2 3 
//4 5 6
//7 8 9 10
//11 12 13 14 15

