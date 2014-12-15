package engine;

import data.Vertex;

import java.util.ArrayList;

public class Specimen implements Comparable
{
    private double fitness;
    private ArrayList<Vertex> path;

    public Specimen(ArrayList<Vertex> path) {
        this.path = path;
        this.fitness = 0.0;
    }

    public Specimen() {
        this.fitness = 0.0;
        this.path = null;
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

    public double compareTo(Specimen s) {
        return this.getFitness() == s.getFitness() ? 0 : this.getFitness() > s.getFitness() ? 1 : -1;
    }

    @Override
    public int compareTo(Object o) {
        Specimen s = (Specimen) o;
        return this.getFitness() == s.getFitness() ? 0 : this.getFitness() > s.getFitness() ? 1 : -1;
    }
}
