package engine;

import data.Edge;
import data.Graph;
import data.Vertex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AcoAlg {
	private int antNumber;
	private int iterations;
	private int pheromoneDecayType; //todo: make it an enum
	private Specimen[] population;
	private Graph g;
	double decayFactor = 0.5;

	public AcoAlg(int iterations, int antNumber, int pheromoneDecayType, Graph g, double decayFactor) {
		this.iterations = iterations;
		this.antNumber = antNumber;
		this.pheromoneDecayType = pheromoneDecayType;
		this.population = new Specimen[antNumber];
		this.g = g;
		this.decayFactor  = decayFactor;
	}

	public AcoAlg(int iterations, int antNumber, Graph g) {
		this.iterations = iterations;
		this.antNumber = antNumber;
		this.pheromoneDecayType = 1;
		this.g = g;
		this.population = new Specimen[antNumber];
	}

	public void solve() {
		for (int i = 0; i < iterations; i++) {
			population = new Specimen[antNumber];

			for (int j = 0; j < population.length; j++) {
				population[i] = new Specimen(getRandomTour(g));
				population[i].setFitness(eval(population[i]));
			}
			Arrays.sort(population);
		}
	}

	private ArrayList<Vertex> getRandomTour(Graph g) {
		return null;
	}

	private double eval(Specimen spec) {
		double cost = 0.0;
		ArrayList<Vertex> path = spec.getPath();
		for (int i = 0; i < path.size(); i++) {
			for (Edge edge : path.get(i).getEdges()) {
				if (edge.getv1() == path.get(i + 1) || edge.getv2() == path.get(i + 1)) {
					cost += edge.getcost();
					break;
				}
			}
		}
		return cost;
	}

	public void reducePheromone(){		
		List<Vertex> vertexs=g.getVertexs();
		Set<Edge> s= new HashSet<Edge>();
		for(Vertex v:vertexs){
			for(Edge e:v.getEdges()){
				if(!s.contains(e)){				
					e.setPheromoneLevel(e.getPheromoneLevel()*decayFactor);
					s.add(e);
				}
			}   
		}

	}

}
