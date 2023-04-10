package estu.ceng.edu;

import org.kohsuke.args4j.Option;

public class Options {

    @Option(name = "-numThread", usage = "Number of threads to be created")
    public int numThread;

    @Option(name = "-numBins", usage = "Number of bins to the bottom of the galton board")
    public int numBins;

}


