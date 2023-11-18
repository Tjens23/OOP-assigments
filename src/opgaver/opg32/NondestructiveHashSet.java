package opgaver.opg32;

import java.util.Arrays;
import java.util.HashSet;

public class NondestructiveHashSet<T>  extends HashSet<T> implements NondestructiveSet<T> {
    public NondestructiveHashSet () {}
    public NondestructiveHashSet (T[] elements) {
        this.addAll(Arrays.asList(elements));
    }
    public NondestructiveSet<T> intersection (NondestructiveSet<T> other) {
        NondestructiveSet<T> result = new NondestructiveHashSet();
        for(T element : this) {
            if(other.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public NondestructiveSet<T> union (NondestructiveSet<T> other) {
        NondestructiveSet<T> result = new NondestructiveHashSet();
        result.addAll(this);
        result.addAll(other);
        return result;
    }

    public NondestructiveSet<T> difference (NondestructiveSet<T> other) {
        NondestructiveSet<T> result = new NondestructiveHashSet();
        for(T element : this) {
            if(!other.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
