import data.Edge;
import data.Graph;
import data.Vertex;
import gui.GUI;

import java.util.List;


public class Main {
    public static final int ITERATIONS = 100;
    public static final int ANT_SIZE = 10;

    //test BFS
    /*	public static void main(String[] args)
    {
		engine.AcoAlg alg = new engine.AcoAlg(ITERATIONS, ANT_SIZE);
		alg.solve();
		String fileName="res/a1.txt";
		data.Graph graph=new data.Graph(fileName);
		List<data.Vertex> vertexs=graph.getVertexs();
		List<data.Vertex> bfs=graph.BFS(vertexs.get(0));
		for(data.Vertex n:bfs){
			System.out.println("("+n.getP().x+", "+n.getP().y+")");		
		}
	}*/
    //test undirected graph
    public static void main(String[] args) {
        String fileName = "res/a1.txt";
        Graph graph = new Graph(fileName);
        List<Vertex> vertexs = graph.getVertexs();
        for (Vertex n : vertexs) {
            System.out.println("(" + n.getP().x + ", " + n.getP().y + ")");
            for (Edge edge : n.getEdges()) {
                System.out.println("    (" + edge.getv2().getP().x + ", " + edge.getv2().getP().y + ")");
            }
        }
        GUI gui = new GUI();
    }
}
