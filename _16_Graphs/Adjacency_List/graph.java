package _16_Graphs.Adjacency_List;

import java.util.ArrayList;

public class graph {
    // user provided array list of nodes
    ArrayList<graphNode> nodeList = new ArrayList<graphNode>();

    // initializing the nodelist every time the class is called using this constructor
    public graph(ArrayList<graphNode> nodeList){
        this.nodeList = nodeList;
    }

    // creating an edge between two nodes
    // as this is an undirected graph so the edge will be from--
    // i to j and also j to i
    // here 0 means no edge and 1 means edge
    public void addUndirectedEdge(int i, int j){
        graphNode first = nodeList.get(i); // storing the Ith element in variable first
        graphNode second = nodeList.get(j); // storing the Jth element in variable second

        first.neighbors.add(second); // adding second to the neighbor arraylist of first
        second.neighbors.add(first); // adding first to the neighbor arraylist of second
    }

    // method to print adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size()-1 ) {
                    s.append((nodeList.get(i).neighbors.get(j).name) );
                } else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
