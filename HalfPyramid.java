import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5(input)
        int sum = 0;
        for(int i=1;i<=N;i++){
            sum =0;
            for(int j=1;j<=i;j++){
                sum = sum +1;
                System.out.print(j+" ");
            }
            System.out.println();
        } 
        
        
    }
    
}

//output 
// 1
// 1 2 
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5