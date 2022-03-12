//Undirected Graph
public class AdjacencyMatrix {
    int vertices;
    int edges;
    int[][] adjMatrix;
    public AdjacencyMatrix(int nodes){
        this.vertices=nodes;
        this.edges=0;
        this.adjMatrix=new int[nodes][nodes];
    }
    public static void main(String[] args){
        AdjacencyMatrix graph=new AdjacencyMatrix(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        System.out.println(graph);
    }
    void addEdge(int u, int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        this.edges++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(this.vertices+" Vertices, "+this.edges+" Edges\n");
        for(int i=0;i<this.vertices;i++){
            sb.append(i+": ");
            for(int j:this.adjMatrix[i]){
                sb.append(j+" ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
