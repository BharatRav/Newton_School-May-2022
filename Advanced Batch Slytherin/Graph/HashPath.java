import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

/*
Question link:https://my.newtonschool.co/playground/code/9xbhbqzl3l7j/
*/

// don't change the name of this class
// you can add inner classes if needed
class Main {
    Map<Object,HashSet<Object>> graph;
    Main() {
        graph = new HashMap<>();
    }
    
    private void addEdge(Object u , Object v) {
        if(!graph.containsKey(u)) {
            graph.put(u,new HashSet<>());
        }

        if(!graph.containsKey(v)) {
            graph.put(v, new HashSet<>());
        }
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    private boolean chechIfPathExistOrNot(Object v1, Object v2) {
        HashSet<Object> visited = new HashSet<>();
        Stack<Object> stack = new Stack<>();

        stack.push(v1);

        while(!stack.isEmpty()) {
            Object CurrentNode = stack.pop();
            if(!visited.contains(CurrentNode)) {
                if(CurrentNode == v2) {
                    return true;
                }
                visited.add(CurrentNode);
            }

            HashSet<Object> neighbours =graph.get(CurrentNode);
            for(Object eachNeighbour: neighbours) {
                if(!visited.contains(eachNeighbour)) {
                    //if i use below if condition it fast my code else it also work
                    if(eachNeighbour==v2) {
                        return true;
                    }
                    stack.push(eachNeighbour);
                }
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Main hasPath = new Main();

        for(int i =0;i<E;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            hasPath.addEdge(a,b);
        }

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        boolean result = hasPath.chechIfPathExistOrNot(v1,v2);
        System.out.println(result);
        // System.out.println(hasPath.graph);
    }
}

/*
Has Path
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an undirected graph G (V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true or false.
V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
E is the number of edges present in graph G.
Input
Line 1: Two Integers V and E (separated by space)
Next E lines: Two integers a and b, denoting that there exists an edge between vertex a and vertex b (separated by space)
Line (E+2): Two integers v1 and v2 (separated by space)

Constraints :
2 <= V <= 1000
1 <= E <= 1000
0 <= v1, v2 <= V-1
Output
For each testcase in new line, you need to print true or false.
Example
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3

Sample Output 1 :
true

Explanation:
There are multiple path exists between 1 and 3. One of them is as such: 1 -> 2 -> 3.
*/
