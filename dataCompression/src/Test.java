public class Test {

    public static void main(String[] args) {

        Node root = new Node(10);

        root.l = new Node(5);
        root.r = new Node(5);

        System.out.println(root.l.weight);


    }
}
