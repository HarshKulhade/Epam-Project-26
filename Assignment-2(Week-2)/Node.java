import java.util.ArrayList;
import java.util.List;

class Node{
    int id;
    int key;
    int dist = -1;
    List<Node> neighbours = new ArrayList<>();

    Node(int id, int key){
        this.id = id;
        this.key = key;
    }
    Node(int id){
        this.id=id;
    }
}