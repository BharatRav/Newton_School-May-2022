import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        //now creating array having nodes with value 0 
        Node[] arr=new Node[n];
        for(int i=0;i<n;i++){
            arr[i]=new Node(0);
        }

        //now taking n lines  having left and right
        for(int i=0;i<n;i++){
            int left=sc.nextInt();
            int right=sc.nextInt();
            
            if(left!=-1){
                arr[i].left=arr[left-1];
            }

            if(right!=-1){
                arr[i].right=arr[right-1];
            }
        }

        //taking q queries
        for(int i=0;i<q;i++){
            int queryType=sc.nextInt();
            perform(queryType,arr,sc);
        }
    }
    private static void perform(int queryType, Node[] arr,Scanner sc){
        switch(queryType){
            case 1:{ int NodeNumber=sc.nextInt();     //u
                    int ValueToBeAdded=sc.nextInt();//x
                    addValue(arr[NodeNumber-1],ValueToBeAdded);
                    break;
            }
            case 2: {int NodeNumber=sc.nextInt();
                    System.out.println(arr[NodeNumber-1].data);
                    break;
            }
        }
    }

    private static void addValue(Node root,int Value){
        if(root==null){
            return;
        }
        root.data=root.data+Value;
        addValue(root.left,Value);
        addValue(root.right,Value);
    }
}
