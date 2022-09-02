package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* storing data in level wise
 */
public class BinaryTreeImplementToStoringInArrayList {
     private Node rootNode=null;
     private static class Node{
         Node leftChild;
         int data;
         Node rightChild;

         public Node( int data) {
             this.data = data;
         }
     }
     private void insertNode(int data){
         Node newNode= new Node(data);
         if(rootNode==null){
             rootNode=newNode;
             return;
         }
         Queue<Node> qu=new LinkedList<>();
         qu.offer(rootNode);

         while(!qu.isEmpty()){
             Node temp= qu.poll();
             if(temp.leftChild==null){
                 temp.leftChild=newNode;
                 return;
             }else{
                 qu.offer(temp.leftChild);
             }
             if(temp.rightChild==null){
                 temp.rightChild=newNode;
                 return;
             }else{
                 qu.offer(temp.rightChild);
             }
         }
     }
     private  void printreeLevelwiseUsingArrayList(){
         if(rootNode==null){
             System.out.println("Tree is Empty!");
             return;
         }
         Queue<Node> qu=new LinkedList<>();
         qu.offer(rootNode);
         qu.offer(null);
         ArrayList<ArrayList<Integer>> listoflist=new ArrayList<>();
         ArrayList<Integer> list=new ArrayList<>();
         while (!qu.isEmpty()){
             Node temp=qu.poll();
             if(temp!=null){                    // 1   2 3      4 5 6 7     8 9 10
                 list.add(temp.data);             //qu. 1 null
                 if(temp.leftChild!=null){     //list
                     qu.offer(temp.leftChild);
                 }
                 if(temp.rightChild!=null){
                     qu.offer(temp.rightChild);
                 }
             }else{
                 if(!qu.isEmpty()){
                     qu.offer(null);
                 }

                 ArrayList<Integer> currentArrayList=new ArrayList<>(list);
                 listoflist.add(currentArrayList);
                 list.clear();
             }
         }
         System.out.println(listoflist);
     }
    public static void main(String[] args) {
        BinaryTreeImplementToStoringInArrayList bt=new BinaryTreeImplementToStoringInArrayList();
        for(int i=1;i<11;i++){
            bt.insertNode(i);
        }
        bt.printreeLevelwiseUsingArrayList();
    }
}
