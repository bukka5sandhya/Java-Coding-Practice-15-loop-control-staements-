import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5(input)
        int sum = 1;
        for(int i=0;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(j+" ");
                sum++;
            }
            System.out.println();
        }
    }
    
}
//output
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1