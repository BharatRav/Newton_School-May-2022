import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static class Node{
        int data;
        ArrayList<Node> list;
        Node(int data){
            this.data=data;
            list=new ArrayList<>();
        }
    }
   
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Node> nodes=new ArrayList<>();
        for(int i=1;i<=n;i++){
            Node temp=new Node(i);
            nodes.add(temp);
        }
        Node root=nodes.get(0);     //root is always 1 given in question 
        for(int i=1;i<n;i++){

            int source=sc.nextInt();        //u
            int destination=sc.nextInt();   //v

            Node sourceTemp=nodes.get(source-1);
            Node destinationTemp=nodes.get(destination-1);
            
            sourceTemp.list.add(nodes.get(destination-1));       
            destinationTemp.list.add(nodes.get(source-1));

        }
        //input part has been done 
        //now finding height of the tree

        HashSet<Integer> visited=new HashSet<>();
        System.out.println((findHeight(root,visited)-1));
        /*
        int height=findHeight(root,visited);
        System.out.println(height-1);
        */
        
    }

    private static int findHeight(Node root,HashSet<Integer> visited){
        if(root==null){
            return 0;       //-1
        }
        
        visited.add(root.data);
        
        ArrayList<Node> tempList=new ArrayList<>();
        tempList=root.list;
        
        int max=0;
        for(Node itarator:tempList){
            
            if(!visited.contains(itarator.data)){
                max=Math.max(max,findHeight(itarator,visited));
            }
        }
        return max+1;
    }
}
