import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;


    public Randoms(int min, int max) {
      this.min = min;
      this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Random().ints(min, max + 1).iterator();
    }


}