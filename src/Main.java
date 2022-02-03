import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<String>();

        trees.add(0, "pine");
        trees.add(1, "maple");
        trees.add(2, "frasier fir");

        System.out.println(trees);
        System.out.println(trees.size());

        System.out.println(trees.get(1));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + names.get(0).length() + moreNames[0].length();
        System.out.println(lengths);

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Tails"));
        catList.add(new Cat("Nago"));
        catList.add(new Cat("Shinji"));
        catList.add(new Cat("Onion"));

        Cat newCat = new Cat("Rune");

        catList.set(2, newCat);
        System.out.println(catList);

        catList.set(1, new Cat("Archie"));
        System.out.println(catList);

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}

