import java.util.ArrayList;

public class Specimen
{
    private double fitness;
    private ArrayList<Vertex> path;

    public Specimen(ArrayList<Vertex> path) {
        this.path = path;
        this.fitness = 0.0;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public ArrayList<Vertex> getPath() {
        return path;
    }

    public void setPath(ArrayList<Vertex> path) {
        this.path = path;
    }

}
