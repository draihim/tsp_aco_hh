import java.util.ArrayList;

public class AcoAlg {
    private int antNumber;
    private int iterations;
    private int pheromoneDecayType; //todo: make it an enum


    public AcoAlg(int iterations, int antNumber, int pheromoneDecayType)
    {
        this.iterations = iterations;
        this.antNumber = antNumber;
        this.pheromoneDecayType = pheromoneDecayType;
    }

    public AcoAlg(int iterations, int antNumber)
    {
        this.iterations = iterations;
        this.antNumber = antNumber;
        this.pheromoneDecayType = 1;
    }

    public void solve() {

        //todo: fill
        for (int i = 0; i < ants.size(); i++) {
            Specimen spec = ants.get(i);
            //todo: evaluate the specimen here;

            spec.setFitness(evaluate(spec));
        }
    }

    private double evaluate(Specimen ants) {
        return 0.0;
    }
}
