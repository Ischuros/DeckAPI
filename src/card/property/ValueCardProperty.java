package card.property;

public abstract class ValueCardProperty<V extends Comparable<V>>
        extends ComparableCardProperty<V> {
    private final V value;

    protected ValueCardProperty(String name, String description, V value) {
        super(name, description);
        this.value = value;
    }

    public final V getValue() {
        return value;
    }

    @Override
    public int compareTo(V o) {
        return value.compareTo(o);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
