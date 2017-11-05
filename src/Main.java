import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList();


    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        String[] list1 = {"a", "b", "c"};
        String[] list2 = {"aa", "b", "c"};
        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
        */

        String[] genesisTransactions = {"naman sent priya 5 bitcoins", "priya sent khushboo 2 bitcoins"};
        String[] block2Transactions = {"naman sent 1 bitcoin to shubhi", "naman sent 1 bitcoin to vandi"};
        String[] block3Transactions = {"harsh sent 1 bitcoing to gautam"};


        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.println(genesisBlock.getBlockHash());
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println(block2.getBlockHash());
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        System.out.println(block3.getBlockHash());
    }

}

