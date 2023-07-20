import java.util.Scanner;

public class assignment{
    
    public static void main(String args[]){
        int number = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Enter the number ");
            int x = sc.nextInt();
            number = number + x;
        }
        System.out.println("Total sum:" + number);
        sc.close();
    }
}
