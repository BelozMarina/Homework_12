package collectionsHomework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Students> linkedList = new LinkedList<>();
        List<Teachers> arrayList = new ArrayList<>();
        Map<Integer, Teachers> hashMap = new HashMap<>();
        Set<Teachers> hashSet = new HashSet<>();

        Students students = new Students("Manya", "Odona", 18, 45, 175, "male", "Programming");
        Teachers teachers = new Teachers("Anna", "Ivanivna", 26, 60, 168, "female", "Programming");
        Teachers teachers1 = new Teachers("Anna1", "Ivanivna1", 32, 60, 168, "female", "Programming");
        Teachers teachers2 = new Teachers("Anna2", "Ivanivna2", 46, 60, 168, "female", "Programming");

        System.out.println("LinkedList");
        linkedList.add(students);
        System.out.println(linkedList);

        System.out.println("\n Hash Set");
        hashSet.add(teachers);
        System.out.println(hashSet);

        System.out.println("\n Array List");
        arrayList.add(teachers);
        System.out.println(arrayList);

        System.out.println("\n HashMap ");
        hashMap.put(1, teachers);
        hashMap.put(2, teachers1);
        hashMap.put(3, teachers2);
        System.out.println(hashMap);

    }
}
