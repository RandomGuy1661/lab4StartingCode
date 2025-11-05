package lab4;

public class Main {
    public static void main(String[] args) {
        MyAList<String> list = new MyAList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Item at index 1: " + list.get(1));

        list.set(1, "Blueberry");
        System.out.println("After set: " + list);

        list.remove(0);
        System.out.println("After remove: " + list);

        System.out.println("Is empty? " + list.isEmpty());

        list.clear();
        System.out.println("After clear: " + list);
    }
}
