import java.util.Scanner;
public class NumbersInSquarePattern3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //3(input)
        int sum = 1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
    
}

//outut
// 1 2 3  
// 4 5 6 
// 7 8 9