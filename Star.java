import java.util.*;

 class Star
 {
    public static void main(String args [])
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int a = sc.nextInt();

        for (int i = a; i > 0; i--)
 {
            for (int j = 0; j < i; j++) 
 {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}