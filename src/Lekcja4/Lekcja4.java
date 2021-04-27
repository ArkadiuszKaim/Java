package Lekcja4;

import java.util.*;

import static java.lang.System.*;

public class Lekcja4 {

    public static void main(String[] args) {

        List();
        Maps();

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('a');

        int countA = 0;
        int countB = 0;
        int countC = 0;

        Map<Character, Integer> map = new HashMap<>();

        out.println(list);

        for (Character character : list) {
            if (character.equals('a')) {
                countA++;
                map.put(character, countA);
            } else if (character.equals('b')) {
                countB++;
                map.put(character, countB);
            } else if (character.equals('c')) {
                countC++;
                map.put(character, countC);
            }
        }
        Set<Character> keySet = map.keySet();
        Collection<Integer> values = map.values();

        out.println(keySet);
        out.println(values);
        out.println(map);

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void Maps() {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("Tim", 5);
        m.put("Matt", 2);
        m.put("Ex", 112);

        out.println(m);
        boolean k = m.containsKey("Tim");
        out.println(k);

        out.println(m.get(5));

        out.println(m.values());
    }

    private static void List() {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.set(1, 5);
        t.subList(0, 2);


        out.println(t.subList(0, 3));
    }
}
