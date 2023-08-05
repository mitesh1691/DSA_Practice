package _17_Graph_Traversal.DFS.Adjacency_List;

import java.util.ArrayList;

public class graphNode {
    public String name;
    public int index;
    public boolean isVisited = false; // added later for dfs

    // array list to contain neighbors of a node. i.e. to store nodes that are connected to a given node
    ArrayList<graphNode> neighbors = new ArrayList<graphNode>();
    public graphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
