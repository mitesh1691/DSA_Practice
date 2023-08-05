package _16_Graphs.Adjacency_Matrix;

import java.util.ArrayList;

public class graph {
    // creating an array list which will user provide as a list of
    // -- nodes that are to be placed in the graph
    ArrayList<graphNode> nodeList = new ArrayList<graphNode>();
    // creating the adjacency matrix as a 2D array
    int[][] adjacencyMatrix;

    // constructor - initializing the adjacency matrix with the size of --
    // -- nodelist provided by user
    public graph(ArrayList<graphNode> nodeList){
        // initializing the nodelist
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    // creating an edge between two nodes
    public void addUndirectedEdge(int i, int j){
        // as this is an undirected graph so the edge will be from--
        // i to j and also j to i
        // here 0 means no edge and 1 means edge
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    // print graph method
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}
