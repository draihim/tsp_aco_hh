public class Edge
{
    private Vertex v1;
    private Vertex v2;
    private double pheromoneLevel;
    private double cost;

    public Edge(Vertex v1, Vertex v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.pheromoneLevel = 0.0;
        this.cost = cost;
    }

    public Edge(Vertex v1, Vertex v2, double pheromoneLevel, double cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.pheromoneLevel = pheromoneLevel;
        this.cost = cost;
    }

    public double getPheromoneLevel() {
        return pheromoneLevel;
    }

    public void setPheromoneLevel(double pheromoneLevel) {
        this.pheromoneLevel = pheromoneLevel;
    }
}
