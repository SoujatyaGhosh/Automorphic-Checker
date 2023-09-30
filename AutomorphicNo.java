import java.util.*;
class AutomorphicNo {
    public static void main(String[]args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");   
        int n = sc.nextInt();
        while(n != 0) 
        {
            int r = n %10;
            number++;
            n=n/10;
        }
        int sq = n*n;
        int m = (int)Math.pow(10, num);
        if (sq % m == n) 
        {
            System.out.println(" The number is automorphic.");
        }
        else
        {
            System.out.println("The number is not automorphic");
        }
    }
}
