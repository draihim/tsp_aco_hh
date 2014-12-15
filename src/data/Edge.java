package data;

public class Edge {
	private Vertex v1;
	private Vertex v2;
	private double cost;
	private double pheromoneLevel;
	public Vertex getv1() {
		return v1;
	}
	public Vertex getv2() {
		return v2;
	}
	public double getcost() {
		return cost;
	}

	public double getPheromoneLevel() {
		return pheromoneLevel;
	}
	public void setPheromoneLevel(double pheromoneLevel) {
		this.pheromoneLevel = pheromoneLevel;
	}
	public Edge(Vertex v1, Vertex v2, double cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
		this.pheromoneLevel = 0.0;
	}

}