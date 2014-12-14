package src;



import java.util.List;


public class Main {
	public static final int ITERATIONS = 100;
	public static final int ANT_SIZE = 10;

	/*	public static void main(String[] args)
	{
		AcoAlg alg = new AcoAlg(ITERATIONS, ANT_SIZE);
		alg.solve();
		String fileName="res/a1.txt";
		Graph graph=new Graph(fileName);
		List<Vertex> vertexs=graph.getVertexs();
		List<Vertex> bfs=graph.BFS(vertexs.get(1));
		for(Vertex n:bfs){
			System.out.println("("+n.getP().x+", "+n.getP().y+")");
		}
	}*/
	public static void main(String[] args)
	{
		String fileName="res/a1.txt";
		Graph graph=new Graph(fileName);
		List<Vertex> vertexs=graph.getVertexs();
		for(Vertex n:vertexs){
			System.out.println("("+n.getP().x+", "+n.getP().y+")");
			for(Edge edge: n.edges){
				System.out.println("    ("+edge.getv2().getP().x+", "+edge.getv2().getP().y+")");
			}
		}
	}
}
