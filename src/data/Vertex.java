package data;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Vertex {
	private Point2D.Double p;
	private ArrayList<Edge> edges;
	boolean visited;

	public Vertex(double x, double y){
		p=new Point2D.Double(x,y);
		this.setEdges(new ArrayList<Edge>());
		this.visited = false; 
	}

/*	public data.Vertex(double x, double y,ArrayList<data.Edge> edges){
		p=new Point2D.Double(x,y);
		this.edges = new ArrayList<data.Edge>(edges);
		this.visited = false; 		
	}*/
	
	public Point2D.Double getP() {
		return p;
	}

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
/*	public ArrayList<data.Edge> getEdges() {
		return edges;
	}*/
}