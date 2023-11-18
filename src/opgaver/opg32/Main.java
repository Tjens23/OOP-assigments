package opgaver.opg32;
public class Main {
    public static void main(String[] args) {
        /*
        HashMap<String, Person> person = new HashMap<>();

        person.put("123456-7890",new Person("Jonas", "123456-7890", 23));
        person.put("403392-0404",new Person("Mads", "403392-0404", 24));
        person.put("010101-0101",new Person("Tobias", "010101-0101", 24));
        person.put("432206-0204",new Person("Peter", "432206-0204", 24));
        person.put("211202-3057", new Person("Aslak", "211202-3057", 24));

        for(Person p : person.values()) {
            if(p.getCpr().equals("010101-0101")) {
                System.out.println("FOUND IT " + p);
            }
        }

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Jonas", "123456-7890", 23));
        persons.add(new Person("Mads", "403392-0404", 24));
        persons.add(new Person("Tobias", "010101-0101", 24));
        persons.add(new Person("Peter", "432206-0204", 24));
        persons.add(new Person("Aslak", "211202-3057", 24));


        for(Person p : persons) {
            if(p.getCpr().equals("010101-0101")) {
                System.out.println("FOUND IT " + p);
            }
        }

        */

        Integer[] as = {1,2,3,4,5,6,7,8,9,10};
        Integer[] bs = {4,5,6,7,8,9,10,11,12,13};
        NondestructiveSet<Integer> a = new NondestructiveHashSet<Integer>(as);
        NondestructiveSet<Integer> b = new NondestructiveHashSet<Integer>(bs);
        NondestructiveSet<Integer> a_intersection_b = a.intersection(b);
        NondestructiveSet<Integer> b_intersection_a = b.intersection(a);
        NondestructiveSet<Integer> a_union_b = a.union(b);
        NondestructiveSet<Integer> b_union_a = b.union(a);
        NondestructiveSet<Integer> a_difference_b = a.difference(b);
        NondestructiveSet<Integer> b_difference_a = b.difference(a);
        System.out.println("Intersections:");
        System.out.println("•A∩B: "+a_intersection_b);
        System.out.println("•B∩A: "+b_intersection_a);
        System.out.println("");
        System.out.println("Unions:");
        System.out.println("•A∪B: "+a_union_b);
        System.out.println("•B∪A: "+b_union_a);
        System.out.println("");
        System.out.println("Differences:");
        System.out.println("•A - B: "+a_difference_b);
        System.out.println("•B - A: "+b_difference_a);
    }
}
