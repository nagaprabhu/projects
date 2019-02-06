import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph_adjacency_list {
    int vertex_count;
    LinkedList<Integer>[] array_ofvertices;

    Graph_adjacency_list(int ver_cnt){
        vertex_count = ver_cnt;
        array_ofvertices = new LinkedList[vertex_count];
        for (int i = 0;i<ver_cnt;i++ ){
            array_ofvertices[i] = new LinkedList<Integer>();
        }
    }

    void pringGraph(){

        for (int  i=0;i<vertex_count;i++){
            System.out.println(" ");
            System.out.print(i+"==>");

            for(int j:array_ofvertices[i]){
                System.out.print(j+"->");
            }
        }

    }
    void addEdge(int s, int d){
        array_ofvertices[s].add(d);
        array_ofvertices[d].add(s);
    }


    void printDFS(int start){
        Boolean[] visited = new Boolean[vertex_count];
        Stack<Integer> S = new Stack<Integer>();
        for (int i =0;i<vertex_count;i++){visited[i]=false;}

        S.push(start);
        visited[start]=true;
        System.out.println("\n=======");
        System.out.print("DFS => "+start+"->");

        while(false==S.isEmpty()){
            Integer cur = S.pop();
            for (int j : array_ofvertices[cur]){
                if (visited[j]==false){
                    S.push(j);
                    visited[j]=true;
                    System.out.print(j+"->");
                }else{
                    System.out.print("..cycle..["+j+"]");
                }
            }
        }
    }

    void printBFS(int start){
        Boolean[] visited = new Boolean[vertex_count];
        //Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> Q = new PriorityQueue<>();

        for (int i=0;i<vertex_count;i++){visited[i]=false;}

        Q.add(start);
        visited[start]=true;
        System.out.println("\n=======");
        System.out.print("BFS => "+start+"->");

        while(Q.isEmpty()==false){
            //Integer cur = ((LinkedList<Integer>) Q).removeFirst();
            Integer cur = Q.remove();
            for (int j : array_ofvertices[cur]){
                if (visited[j]==false) { // if it is not yet visited
                    Q.add(j);
                    visited[j] = true;
                    System.out.print(j+"->");
                }
            }
        }
    }


    public static void main(String[] args){
        Graph_adjacency_list g = new Graph_adjacency_list(5);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(2,4);
        g.addEdge(4,1);
        //g.addEdge(4,0);
        g.pringGraph();
        g.printBFS(0);
        g.printBFS(1);
        g.printBFS(2);
        g.printDFS(2);


    }
}
