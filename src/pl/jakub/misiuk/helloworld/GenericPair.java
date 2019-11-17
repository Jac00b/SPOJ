package pl.jakub.misiuk.helloworld;

public class GenericPair<T, V> {
    private T t;
    private V v;

    public GenericPair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> p1 = new GenericPair<>("Ania", 21);
        GenericPair<String, String> p2 = new GenericPair<>("Ania", "Kowalska");
        GenericPair<Double, Double> p3 = new GenericPair<>(2.45, 21.74);
        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    static <T, V> void printPair(GenericPair<T, V> pair) {
        System.out.println(pair.getT() + ", " + pair.getV());
    }
}
