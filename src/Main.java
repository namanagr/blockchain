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
        Block genesisBlock = new Block(0, genesisTransactions);
        String[] block2Transactions = {"naman sent 1 bitcoin to shubhi", "naman sent 1 bitcoin to vandi"};
        System.out.println(genesisBlock.getBlockHash());

    }

}

