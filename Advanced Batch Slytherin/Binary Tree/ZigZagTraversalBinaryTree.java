/*
 // Information about the class Node
    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }
*/
static ArrayList<Integer> zigZagTraversal(Node root)
{
    ArrayList<Integer> result = new ArrayList<>();
    if(root != null) {
            Queue<Node> queue = new LinkedList<>();
            boolean isZigZag = false;       //false means right to left
                                            // true mean left to right

            queue.add(root);

            while(!queue.isEmpty()) {
                List<Integer> currentLevel = new ArrayList<>();

                int queueSize = queue.size();

                for(int i = 0; i < queueSize; i++) {
                    Node temp = queue.poll();

                    if(!isZigZag) {
                        currentLevel.add(temp.data);
                    }
                    else {
                        currentLevel.add(0, temp.data);
                    }

                    if(temp.left != null) {
                        queue.add(temp.left);
                    }

                    if(temp.right != null) {
                        queue.add(temp.right);
                    }
                }

                result.addAll(currentLevel);
                isZigZag = !isZigZag;
            }
        }

    return result;

}
