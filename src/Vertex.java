import java.util.ArrayList;

public class Vertex
{
    private int x;
    private int y;
    ArrayList<Edge> edges;

    public Vertex(int x, int y, ArrayList<Edge> edges) {
        this.x = x;
        this.y = y;
        this.edges = new ArrayList<Edge>();
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}
