import java.util.LinkedList;

public class UndirectedRecursiveDFS {
    private LinkedList<Integer>[] adj;
    int vertices;
    int edges;
    public UndirectedRecursiveDFS(int nodes){
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
    public void dfs(){
        boolean[] visited=new boolean[this.vertices];
        for(int vertex=0;vertex<this.vertices;vertex++){
            if(!visited[vertex]){
                dfs(vertex,visited);
            }
        }
    }
    public void dfs(int vertex,boolean[] visited){
        visited[vertex]=true;
        System.out.print(vertex+" ");
        for(int w:adj[vertex]){
            if(!visited[w]){
                dfs(w,visited);
            }
            //System.out.println();
        }
    }
    public static void main(String[] args){
        UndirectedRecursiveDFS g=new UndirectedRecursiveDFS(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        System.out.println(g);
        g.dfs();
    }
}
