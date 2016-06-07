/**
 * Created by mohammadselimmiah on 8/06/2016.
 */
public class BstKeyValue {
    Node root;

    public void addNode(int key, String value){
        Node newNode = new Node(key,value);

        if(root == null){
            root = newNode;
        }else {
            Node focusNode = root;
            Node parent;

            while (true){
                parent = focusNode;
                if(key<focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseNode(Node focusNode){
        if(focusNode!=null){
            inOrderTraverseNode(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseNode(focusNode.rightChild);
        }
    }

    public void preOrderTraverseNode(Node focusNode){
        if(focusNode!=null) {
            System.out.println(focusNode);
            preOrderTraverseNode(focusNode.leftChild);
            preOrderTraverseNode(focusNode.rightChild);
        }
    }

    public void postOrderTraverseNode(Node focusNode){
        if(focusNode!=null){
            postOrderTraverseNode(focusNode.leftChild);
            postOrderTraverseNode(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key){
        Node focusNode =root;

        while (key!=focusNode.key){
            if(key<focusNode.key)
                focusNode = focusNode.leftChild;
            else focusNode = focusNode.rightChild;

            if(focusNode == null)
                return null;
        }
        return focusNode;
    }

    public static void main(String args[]){
        BstKeyValue bstKeyValue = new BstKeyValue();
        bstKeyValue.addNode(50,"Boss");
        bstKeyValue.addNode(25,"Vice President");
        bstKeyValue.addNode(15,"Office Manager");
        bstKeyValue.addNode(30,"Secretary");
        bstKeyValue.addNode(75,"Sales Manager");
        bstKeyValue.addNode(85,"Salesman 1");

        //bstKeyValue.inOrderTraverseNode(bstKeyValue.root);
        //bstKeyValue.preOrderTraverseNode(bstKeyValue.root);
        bstKeyValue.postOrderTraverseNode(bstKeyValue.root);

        System.out.println("\n\nSearch for Node 30: "+bstKeyValue.findNode(30));
        System.out.println("\n\nSearch for Node 99: "+bstKeyValue.findNode(99));
    }

    class Node{
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        Node(int key, String value){
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return key+" ==>> "+value;
        }
    }
}
