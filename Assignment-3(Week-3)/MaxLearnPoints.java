import java.util.Scanner;

public class MaxLearnPoints {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] points = new int[n];

        for(int i=0; i<n; i++)points[i]=sc.nextInt();
        int[] a= new int[n+1];
        a[1]=points[0];
        for(int i=2; i<=n; i++){
            a[i]=Math.max(a[i-1],a[i-2]+points[i-1]);
         }
        System.out.println(a[n]);

    }

}
