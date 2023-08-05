package _17_Graph_Traversal.BFS.Adjacency_Matrix;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<graphNode> nodeList = new ArrayList<graphNode>();
        nodeList.add(new graphNode("A", 0));
        nodeList.add(new graphNode("B", 1));
        nodeList.add(new graphNode("C", 2));
        nodeList.add(new graphNode("D", 3));
        nodeList.add(new graphNode("E", 4));

        graph g = new graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        System.out.println(g.toString());

        g.bfs();
    }
}
