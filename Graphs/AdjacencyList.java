import java.util.LinkedList;

public class AdjacencyList {
    private LinkedList<Integer>[] adj;
    int vertices;
    int edges;
    public AdjacencyList(int nodes){
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
    public static void main(String[] args){
        AdjacencyList g=new AdjacencyList(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
