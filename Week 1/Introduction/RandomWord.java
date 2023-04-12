import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String currWord = "";
        double currProb = 0;
        int i = 1;
        while(! StdIn.isEmpty()){
            String str = StdIn.readString();
            boolean p = StdRandom.bernoulli((double)1/i);
            if(p){
                currWord = str;
            }
            i++;
        }
        System.out.println(currWord);
    }
}
