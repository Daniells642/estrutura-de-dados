package one.digitalinovation.model;

public abstract class ObjArvore<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashcode();
    public abstract int CompareTo(T outro);
    public abstract String toString();
}
