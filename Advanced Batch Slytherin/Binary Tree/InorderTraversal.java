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
        int n= sc.nextInt();
        node RootNode;
        Map<Integer,node> hm= new HashMap<>();
        for(int i=1;i<=n;i++){
            if(hm.containsKey(i)){
                RootNode=hm.get(i);
            }else{
                RootNode=new node(i);
                hm.put(i,RootNode);
            }

            int l=sc.nextInt();
            int r=sc.nextInt();

            if(l!=-1){
                if(hm.containsKey(l)){
                    RootNode.left=hm.get(l);
                }else{
                    RootNode.left=new node(l);
                    hm.put(l,RootNode.left);
                }
            }
            if(r!=-1){
                if(hm.containsKey(r)){
                    RootNode.right=hm.get(r);
                }else{
                    RootNode.right=new node(r);
                    hm.put(r,RootNode.right);
                }
            }
        }

        //calling InOrderTraversal;
        InOrderTraversal(hm.get(1));
    }
    private static void InOrderTraversal(node currentRoot){
        if(currentRoot==null){
            return;
        }
        InOrderTraversal(currentRoot.left);
        System.out.print(currentRoot.data+" ");
        InOrderTraversal(currentRoot.right);
    }
}
