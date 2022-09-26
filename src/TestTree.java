import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix Your Body");
        Book b3 = new Book("Finding Emo");

        Set<Book> tree = new TreeSet<>((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    /**
     * The elements in the list must be of a type that implements Comparable
     * OR
     * you must use the TreeSet's overloaded constructor that takes a Comparator
     * (or lambda in constructor)
     */

}

class Book{
        private String title;
        public Book(String t){
            title = t;
        }
        public String getTitle(){
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

