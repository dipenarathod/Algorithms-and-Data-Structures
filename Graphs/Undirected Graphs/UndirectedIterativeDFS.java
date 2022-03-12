import java.util.LinkedList;
import java.util.Stack;

public class UndirectedIterativeDFS {
    private LinkedList<Integer>[] adj;
    int vertices;
    int edges;
    public UndirectedIterativeDFS(int nodes){
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
    public void dfs(int start){
        boolean[] visited=new boolean[this.vertices];
        Stack<Integer> stack=new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
                for(int j:this.adj[u]){
                    if(!visited[j]){
                        stack.push(j);
                    }
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        UndirectedIterativeDFS g=new UndirectedIterativeDFS(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        System.out.println(g);
        g.dfs(0);
    }
}
