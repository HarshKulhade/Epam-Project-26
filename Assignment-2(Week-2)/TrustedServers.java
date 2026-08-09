import java.util.Scanner;


public class TrustedServers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();

        int[] key = new int[n+1];
        for(int i=1; i<=n; i++){
            System.out.print("Enter Key "+i+" :");
            key[i] = sc.nextInt();
        }
        Node[] nodes =new Node[n+1];
        for(int i=1; i<=n; i++){
            nodes[i] = new Node(i, key[i]);
        }
        //System.out.println(java.util.Arrays.toString(nodes));
        for(int i=1; i<=n-1; i++){
            System.out.println("itteration "+i);
            int u = sc.nextInt();
            int v = sc.nextInt();
            nodes[u].neighbours.add(nodes[v]);
            nodes[v].neighbours.add(nodes[u]);
        }
        dfs(nodes[1],null,k,0);
        System.out.println(trustedServers);

    }

    static int trustedServers;

    static void dfs(Node current, Node parent, int K, int currXOR){
        currXOR = currXOR^current.key;
        if(currXOR>=K)trustedServers++;

        for(Node next : current.neighbours){
            if(next==parent)continue;
            dfs(next,current,K,currXOR);
        }
    }

}
