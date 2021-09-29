package practice.collection;

import java.util.*;

public class CollectionPractic_2 {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,6,4,7,4,8,5,657,789,2));

        collection.forEach(System.out::println);

        Set<Integer> resultSet= new TreeSet<>(collection);
        resultSet.forEach(System.out::println);

    }

}
