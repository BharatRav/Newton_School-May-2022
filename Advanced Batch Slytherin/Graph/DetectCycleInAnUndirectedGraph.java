import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    Map<Object, HashSet<Object>> graph;
    Main(int n) {
        graph = new HashMap<>();
    }

    private void addEdge(int u, int v) {
        if(!graph.containsKey(u)) {
            graph.put(u, new HashSet<>());
        }

        if(!graph.containsKey(v)) {
            graph.put(v,new HashSet<>());
        }

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    private boolean isCyclicHelper(Object currentNode, Object parentNode, Set<Object> visitedSet) {
        visitedSet.add(currentNode);

        HashSet<Object> neighbours =graph.get(currentNode);

        for(Object eachNeighbour : neighbours) {
            if(!visitedSet.contains(eachNeighbour)) {
                if(isCyclicHelper(eachNeighbour,currentNode,visitedSet)) {
                    return true;
                }
            }
            /*
            else if(eachNeighbour!=parentNode){
                return true;
            }
            In this code  few test cases failing on Newton School
            playground because of this statement:
            else if(eachNeighbour != parentNode) {
            The problem with the above statement is that both 'eachNeighbour' and 'parentNode'
            are of 'Object' type. Comparing two objects with an '==' (equality) operator
            checks whether both the references refer to the same object or not.
            Hence, the above comparison resulted in a 'true' when the values of both the
            objects were same.
            To correct the mistake, each object can be type casted to 'Integer' and their
            corresponding 'int' values can be taken for comparison.
             */
            else if(((Integer)eachNeighbour).intValue()!=((Integer)parentNode).intValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean isCyclic() {
        Set<Object> visitedSet = new HashSet<>();

        for(Object eachKey : graph.keySet()) {
            if(!visitedSet.contains(eachKey)) {
                 
                if(isCyclicHelper(eachKey, null,visitedSet)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Main myclass = new Main(n);

        for(int i=0;i<m;i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            myclass.addEdge(u,v);
        }
        System.out.println(myclass.isCyclic()?"Yes":"No");
        // 1 if false there is no cycle
        //0 if true there is a cycle
    }
}
