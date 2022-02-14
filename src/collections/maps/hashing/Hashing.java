package collections.maps.hashing;

public class Hashing {

    /*
     * if searching an array wich is not sorted
     * might need to examine all the elements
     *
     * what if we have a function that will tell
     * the index of the searched value
     *
     * this function is a hash function
     *
     * we have hashCode() that generates a hash code
     * for a given object
     *
     * equals uses hashCode() under the hood
     *
     * if two objects are equals according to this method
     * they must have the same hash code value
     *
     * each object has it's own hashcode calculated based
     * on some formula, for strings for example it is
     * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
     * when equals is comparing values it passes the value in
     * the formula and compare if the results are the same
     *
     * by default equals compare the hashcode by checking if
     * this == object
     *
     * if you provide a implementation that compares
     * the attributes only, it won't check on the hash code
     *
     * HashTable uses hashing concepts, it works as follows
     * given a hash table of size 5, once you add an object
     * objectOne has a hash code
     * (Integer objectOneHashCode = objectOne.hashCode())
     * it calculates objectOneHashCode % sizeOfHashTable = indexToBeStored
     * and it goes over all inserted objects, that's why accessing it quick
     *
     * if the same hashCode() is generated for two different objects
     * it is called a colision
     *
    */
    public static void main(String[] args) {

        // comparing objects according to equals

        String pedro = "pedro";
        String luiz = "luiz";

        Integer pedroHashCode = pedro.hashCode();
        Integer luizHashCode = luiz.hashCode();
        System.out.println(pedroHashCode);
        System.out.println(luizHashCode);

        Boolean isEqualsPedro = pedro.equals(luiz);
        Boolean isEqualsLuiz = luiz.equals(pedro);
        System.out.println(isEqualsPedro);
        System.out.println(isEqualsLuiz);

        // customizing equals

        EqualsImpl objectOne = new EqualsImpl("one");
        EqualsImpl objectTwo = new EqualsImpl("one");

        Integer objectOneHashCode = objectOne.hashCode();
        Integer objectTwoHashCode = objectTwo.hashCode();
        System.out.println(objectOneHashCode);
        System.out.println(objectTwoHashCode);

        Boolean isEquals = objectOne.equals(objectTwo);
        System.out.println(isEquals);

        // comparing objects and values, since the hash code is the same, it doesn't create two references in memory

        String stringOne = new String("something");
        String stringDois = new String("something");

        System.out.println(stringOne.hashCode());
        System.out.println(stringDois.hashCode());

        Boolean isEqualsStrings = stringOne.equals(stringDois);
        System.out.println(isEqualsStrings);

    }
}

class EqualsImpl {

    public String attributeOne;

    public EqualsImpl(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (this.attributeOne.equals( ((EqualsImpl) objectToCompare).attributeOne )) return true;
        return false;
    }
}
