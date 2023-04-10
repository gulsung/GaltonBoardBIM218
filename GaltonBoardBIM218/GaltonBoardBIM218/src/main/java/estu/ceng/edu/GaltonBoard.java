package estu.ceng.edu;

import java.util.Random;

public class GaltonBoard implements Runnable {

    private final int[] accumulatedBallsInBinCells;
    private final int numBins;
    private final Random random = new Random();

    public GaltonBoard(int numBins) {
        this.numBins = numBins;
        this.accumulatedBallsInBinCells = new int[numBins];
    }

    @Override
    public void run() {
        int reachedBinIndex = random.nextInt(numBins);
        synchronized (accumulatedBallsInBinCells) {
            accumulatedBallsInBinCells[reachedBinIndex]++;
        }
    }

    public int[] getAccumulatedBallsInBinCells() {
        return accumulatedBallsInBinCells;
    }
}
