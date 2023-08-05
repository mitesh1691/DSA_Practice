package _17_Graph_Traversal.BFS.Adjacency_Matrix;

import java.util.ArrayList;
import java.util.LinkedList;

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

    //    Breadth First Search

    // get neighbors method to get the nodes which are connected to a given node
    // this method will return the nodes in an Arraylist
    public ArrayList<graphNode> getNeighbors(graphNode node) {
        ArrayList<graphNode> neighbors = new ArrayList<graphNode>();
        int nodeIndex = node.index;
        for (int i=0; i<adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[nodeIndex][i]==1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    // bfs internal method
    public void bfsVisit(graphNode node){
        LinkedList<graphNode> queue = new LinkedList<graphNode>();
        queue.add(node);

        while(!queue.isEmpty()){
            graphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");

            ArrayList<graphNode> neighbors = getNeighbors(currentNode);
            for(graphNode neighbor : neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true; // imp line
                }
            }
        }
    }

    // bfs
    public void bfs(){
        for(graphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}
