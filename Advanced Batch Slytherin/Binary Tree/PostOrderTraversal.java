import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        node currentRoot,leftChild,RightChild;
        Map<Integer,node> hm= new HashMap<>();
        for(int i=1;i<=n;i++){
            if(hm.containsKey(i)){
                currentRoot=hm.get(i);
            }else{
                currentRoot=new node(i);    //same data i for ith node
                hm.put(i,currentRoot);
            }

            //taking ith line's data
            int l=sc.nextInt();
            int r=sc.nextInt();

            if(l!=-1){
                if(hm.containsKey(l)){
                    currentRoot.left=hm.get(l);
                }else{
                    currentRoot.left=new node(l);
                    hm.put(l,currentRoot.left);
                }
            }
            if(r!=-1){
                if(hm.containsKey(r)){
                    currentRoot.right=hm.get(r);
                }else{
                    currentRoot.right=new node(r);
                    hm.put(r,currentRoot.right);
                }
            }
        }

        //now call postOrderTraversal
        postOrderTraversal(hm.get(1));
    }
    private static void postOrderTraversal(node RootNode){
        if(RootNode==null){
            return;
        }
        postOrderTraversal(RootNode.left);
        postOrderTraversal(RootNode.right);
        System.out.print(RootNode.data+" ");
    }
}
