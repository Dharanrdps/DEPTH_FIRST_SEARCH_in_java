class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
public class Main{
public static void main(String[]args){
    graph gp=new graph(6);
    gp.addEdge(0,1);
    gp.addEdge(0,2);
    gp.addEdge(1,2);
    gp.addEdge(2,3);
    gp.addEdge(3,4);
    gp.addEdge(4,5);
    gp.addEdge(5,3);
    gp.dfs(5);
}
}
class graph {
    int v; 
    Node[] adjList;

    public graph(int v) {
        this.v = v;
        adjList = new Node[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = null;
        }
    }
    public void addEdge(int src, int dest) {
        Node newNode = new Node(dest);
        newNode.next = adjList[src];
        adjList[src] = newNode;
        newNode = new Node(src);
        newNode.next = adjList[dest];
        adjList[dest] = newNode;
    }
    public void dfs(int s)
    {
        boolean visit[]=new boolean[v];
        dfst(s,visit);
    }
    public void dfst(int s,boolean[]visit){
        visit[s]=true;
        System.out.print(s+" ");
        Node temp=adjList[s];
        while(temp!=null){
            int neighbour=temp.data;
            if(!visit[neighbour])
            {
                dfst(neighbour,visit);
            } 
            temp=temp.next;
        }
    }
}
