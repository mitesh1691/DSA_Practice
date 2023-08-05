package _17_Graph_Traversal.BFS.Adjacency_Matrix;

public class graphNode {
    public String name;
    public int index;
    public boolean isVisited = false; // added later for BFS

    public graphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
