import java.util.Arrays;
import java.util.Comparator;

public class LamdaExpression {
    public static class Node {
        // 변수 선언
        int dest, cost;

        // 생성자
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Node[] lamda = new Node[5];

        lamda[0] = new Node(1, 10);
        lamda[1] = new Node(2, 20);
        lamda[2] = new Node(3, 30);
        lamda[3] = new Node(4, 40);
        lamda[4] = new Node(5, 50);
        Arrays.sort(lamda, (o1, o2) -> Integer.compare(o1.cost, o2.cost));

        Arrays.sort(lamda, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2){
                return Integer.compare(o1.cost, o2.cost);
            }
        });
    }
}
