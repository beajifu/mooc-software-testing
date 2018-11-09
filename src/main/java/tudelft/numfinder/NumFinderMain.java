package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // nf.find(new int[] {4, 25, 7, 9});

        nf.find(new int[] {4, 10, 100, Integer.MAX_VALUE, Integer.MIN_VALUE});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
