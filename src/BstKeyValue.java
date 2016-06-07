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

    public static void main(String args[]){

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
            return "Key "+key+" has value "+value;
        }
    }
}
