import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EffReachableCities {
    static int citiesCount;
    static int D;
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        D=sc.nextInt();
        Node[] nodes = new Node[N+1];
        for(int i=1; i<=N; i++){
            nodes[i] = new Node(i);
        }
        for(int i=1; i<=M; i++){
            System.out.println("itteration:"+i);
            int u = sc.nextInt();
            int v = sc.nextInt();
            nodes[u].neighbours.add(nodes[v]);
            nodes[v].neighbours.add(nodes[u]);
        }
        bfs(nodes[1]);
        System.out.println(citiesCount);

    }
    static void bfs(Node start){
        Queue<Node> queue = new LinkedList<>();
        start.dist=0;
        queue.add(start);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.dist<=D)citiesCount++;
            if(curr.dist>D)continue;
            for(Node next: curr.neighbours){
                if(next.dist==-1){
                    next.dist = curr.dist+1;
                    queue.add(next);
                }
            }
        }
    }
}
