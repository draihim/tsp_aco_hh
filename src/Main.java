import data.Edge;
import data.Graph;
import data.Vertex;
import gui.GUI;

import java.util.List;


public class Main {
    public static final int ITERATIONS = 100;
    public static final int ANT_SIZE = 10;

    public static void main(String[] args) {
        String fileName = "res/d4.txt";
        Graph graph = new Graph(fileName);
        List<Vertex> vertexs = graph.getVertexs();
        for (Vertex n : vertexs) {
            System.out.println("(" + n.getP().x + ", " + n.getP().y + ")");
            for (Edge edge : n.getEdges()) {
                System.out.println("    (" + edge.getv2().getP().x + ", " + edge.getv2().getP().y + ")");
            }
        }
        GUI gui = new GUI(graph);
    }
}
