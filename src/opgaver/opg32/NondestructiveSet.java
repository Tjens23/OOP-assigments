package opgaver.opg32;

import java.util.Set;

interface NondestructiveSet<Integer> extends Set<Integer> {
    NondestructiveSet<Integer> intersection (NondestructiveSet<Integer> other);
    NondestructiveSet<Integer> union (NondestructiveSet<Integer> other);
    NondestructiveSet<Integer> difference (NondestructiveSet<Integer> other);
}
