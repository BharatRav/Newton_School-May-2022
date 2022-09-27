import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed


// sagar sir ka code
class Main {

    static class Node {
        Node leftChild;
        int data;
        Node rightChild;

        Node(int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }

    private void preorderTraversal(Node rootNode) {
        if(rootNode != null) {
            System.out.print(rootNode.data + " ");
            preorderTraversal(rootNode.leftChild);
            preorderTraversal(rootNode.rightChild);
        }
    }

    private int searchInInorder(int inorder[], int inorderStart, int inorderEnd, int key) {
        int position = -1;

        for(int i = inorderStart; i <= inorderEnd; i++) {
            if(inorder[i] == key) {
                position = i;
                break;
            }
        }

        return position;
    }

    private Node buildTreeUsingInorderAndPostorder(int inorder[],
                                                   int postorder[],
                                                   int inorderStart,
                                                   int inorderEnd,
                                                   int postorderStart,
                                                   int postorderEnd) {
        if(inorderStart > inorderEnd) {
            return null;
        }

        int currentRootNodeData = postorder[postorderEnd];
        Node currentRootNode = new Node(currentRootNodeData);

        if(inorderStart == inorderEnd) {
            return currentRootNode;
        }

        int inorderIndex = searchInInorder(inorder, inorderStart, inorderEnd, currentRootNodeData);

        currentRootNode.rightChild = buildTreeUsingInorderAndPostorder(inorder, postorder,
                inorderIndex + 1, inorderEnd, postorderEnd - inorderEnd + inorderIndex, postorderEnd - 1);

        currentRootNode.leftChild = buildTreeUsingInorderAndPostorder(inorder, postorder,
                inorderStart, inorderIndex - 1, postorderStart, postorderStart - inorderStart + inorderIndex - 1);

        return currentRootNode;
    }

    public static void main (String[] args) throws IOException {
                      // Your code here
                      BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        String inorderString[] = bufferedReader.readLine().split(" ");
        String postorderString[] = bufferedReader.readLine().split(" ");

        int inorder[] = new int[N];
        int postorder[] = new int[N];

        for(int i = 0; i < N; i++) {
            inorder[i] = Integer.parseInt(inorderString[i]);
        }

        for(int i = 0; i < N; i++) {
            postorder[i] = Integer.parseInt(postorderString[i]);
        }

        Main main = new Main();

        Node root = main.buildTreeUsingInorderAndPostorder(inorder, postorder,
                0, N - 1, 0, N - 1);

        main.preorderTraversal(root);
    }
}
