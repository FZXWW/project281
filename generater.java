public class generater {

    public int c = 1;

    public int generaters(int x, int n) {
        int r = (((x * x) + c) % n);  // f(x) = x^2 + c mod n
        return r;
    }

    
}
