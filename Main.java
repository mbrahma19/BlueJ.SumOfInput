import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args){
        System.out.println("Please input a number");
        Scanner userInput = new Scanner(System.in);
        int userNum = userInput.nextInt();
        int sum = summarizer(userNum);
        System.out.printf("The sum of %d is %d", userNum, sum);
        
    }
    
    public static int summarizer(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
