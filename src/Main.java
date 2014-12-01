public class Main {
    public static final int ITERATIONS = 100;
    public static final int ANT_SIZE = 10;

    public static void main(String[] args)
    {
        AcoAlg alg = new AcoAlg(ITERATIONS, ANT_SIZE);
        alg.solve();
    }
}
