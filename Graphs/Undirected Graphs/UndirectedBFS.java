import java.util.LinkedList;
import java.util.Queue;

public class UndirectedBFS {
    private LinkedList<Integer>[] adj;
    int vertices;
    int edges;
    public UndirectedBFS(int nodes){
        this.vertices=nodes;
        this.edges=0;
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        this.edges++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(this.vertices+" vertices, "+this.edges+" edges\n");
        for(int i=0;i<this.vertices;i++){
            sb.append(i+": ");
            for(int j:adj[i]){
                sb.append(j+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void bfs(int start){
        boolean[] visited=new boolean[this.vertices];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.offer(start);
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int j:adj[u]){
                if(!visited[j]){
                    visited[j]=true;
                    q.offer(j);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        UndirectedBFS g=new UndirectedBFS(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        System.out.println(g);
        g.bfs(0);
    }
}
