package src;


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
    }
}
