package _17_Graph_Traversal.DFS.Adjacency_Matrix;

import java.util.ArrayList;
import java.util.Stack;

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

//    Depth First Search
    // get neighbors method - to get the nodes which are connected to the given node,
    // this method will return an arraylist of connected nodes
    public ArrayList<graphNode> getNeighbors(graphNode node){
        ArrayList<graphNode> neighbors = new ArrayList<graphNode>();
        int nodeIndex = node.index;

        for(int i = 0; i < adjacencyMatrix.length; i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                // if the node and the nodes with index i have edge (1) then,
                neighbors.add(nodeList.get(i));
                // add that element to the neighbors arraylist
                // to add that element, get that element with its index from the
                // nodelist which was user provided
            }
        }
        return neighbors;
    }


    // internal dfs method
    public void dfsVisit(graphNode node){
        Stack<graphNode> stack = new Stack<graphNode>();
        stack.push(node);

        while (!stack.isEmpty()){
            graphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");

            ArrayList<graphNode> neighbors = getNeighbors(currentNode);
            for(graphNode neighbor : neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    // dfs method
    public void dfs(){
        for(graphNode node : nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
}
