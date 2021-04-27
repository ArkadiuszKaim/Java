package Lekcja5;

import java.util.*;

import static java.lang.System.*;

public class Zadanie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        out.print("Podaj swój wyraz: ");
        String str = scan.nextLine().toLowerCase();

        Map<Character, Integer> mapa = new LinkedHashMap<>(); // Nowa mapa Hash

        char[] tablica = str.toCharArray(); // String zamieniony w tablice

        for (char c : tablica)      // petla dla tablicy
        {
            if (mapa.containsKey(c)) {   // jesli mapa zawiera dany char
                mapa.put(c, mapa.get(c) + 1); // na danym char dodajemy do value danego chara +1;
            } else {
                mapa.put(c, 1);          // w innym wypadku dodajemy do mapy dany char z warotscia 1
            }
        }

        //out.println(mapa);

        mapa.forEach((key, value) ->
            out.println(key + "=" + value));

       // out.println(mapa.entrySet());
    }
}