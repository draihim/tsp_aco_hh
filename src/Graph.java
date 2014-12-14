package src;


import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Graph {
	private List<Vertex> vertexs;
	private String fileName;
	private HashMap<Point2D.Double, Vertex> map;

	public Graph(String fileName) {
		vertexs = new ArrayList<Vertex>();
		this.map = new HashMap<Point2D.Double, Vertex>();
		this.fileName = fileName;
		createGraphByFile();
	}

	public Graph(List<Vertex> nodes, List<Edge> edges) {
		this.vertexs = nodes;
	}
	public List<Vertex> getVertexs() {
		return vertexs;
	}

	public void createGraphByFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while (line != null) {
				String[] split = line.split("\\s+");
				split[0] = split[0].substring(1, split[0].length() - 1);
				split[1] = split[1].substring(1, split[1].length() - 1);
				String[] p1 = split[0].split(",\\s*");
				String[] p2 = split[1].split(",\\s*");
				double cost = Double.parseDouble(split[2]);
				addLane(Double.parseDouble(p1[0]), Double.parseDouble(p1[1]),
						Double.parseDouble(p2[0]), Double.parseDouble(p2[1]),
						cost);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(fileName + " not found!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Read Error!!!");
			e.printStackTrace();
		}

	}

	private void addLane(double v1X, double v1Y, double v2X,
			double v2Y, double cost) {
		// TODO Auto-generated method stub
		Point2D.Double p1 = new Point2D.Double(v1X, v1Y);
		Point2D.Double p2 = new Point2D.Double(v2X, v2Y);
		Vertex v1;
		Vertex v2;
		if (!map.containsKey(p1)) {
			v1 = new Vertex(v1X, v1Y);
			map.put(p1, v1);
			vertexs.add(v1);
		} else {
			v1 = map.get(p1);
		}
		if (!map.containsKey(p2)) {
			v2 = new Vertex(v2X, v2Y);
			map.put(p2, v2);
			vertexs.add(v2);
		} else {
			v2 = map.get(p2);
		}
		Edge edge1 = new Edge(v1, v2, cost);
		v1.edges.add(edge1);
		Edge edge2 = new Edge(v2, v1, cost);
		v2.edges.add(edge2);
	}
	
	public List<Vertex> BFS(Vertex root) {
		// TODO Auto-generated method stub
		List<Vertex> bfsResult = new ArrayList<Vertex>();
		Queue<Vertex> q = new ConcurrentLinkedQueue<Vertex>();
		q.add(root);
		while (q.size() > 0) {
			Vertex n = q.poll();
			if (!n.visited) {
				bfsResult.add(n);
				n.visited=true;
				List<Edge> adjEdges = n.edges;
				for (int i = 0; i < adjEdges.size(); i++) {
					q.add(adjEdges.get(i).getv2());
				}
			}
		}
		return bfsResult;
	}
	
}
