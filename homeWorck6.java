import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class homeWorck6 {
    public static void main(String[] args) {
        ex2();
    }
    static void ex1(){
        // Реализуйте структуру телефонной книги с помощью HashMap,
        //  учитывая, что 1 человек может иметь несколько телефонов.
        System.out.println("Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
        String findName = "Иванов";
        String poick = "";
        for(Map.Entry entry: map.entrySet()){
            if(entry.getValue().equals(findName)){
                poick += entry;
            }
        }
        poick = poick.replace("=", "");
        poick = poick.replace(findName, ", ");
        System.out.println("У пользователя " + findName + "имеются следующие номера= " + poick);
        
    }
    static void ex2(){
    //     Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
    //      Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
    //      Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
    //       Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
    //       Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
    HashMap<String, Integer> names = new HashMap<String, Integer>();
    HashMap<String, String> strokName = new HashMap<>();
    int Values;
    String Keys;
    strokName.put("Иванов", "Иван");
    strokName.put("Петрова", "Светлана");
    strokName.put("Белова", "Кристина");
    strokName.put("Мусина", "Анна");
    strokName.put("Крутова", "Анна");
    strokName.put("Юрин", "Иван");
    strokName.put("Лыков", "Петр");
    strokName.put("Чернов", "Павел");
    strokName.put("Чернышов", "Петр");
    strokName.put("Федорова", "Мария");
    strokName.put("Светлова", "Марина");
    strokName.put("Савина", "Мария");
    strokName.put("Рыкова", "Мария");
    strokName.put("Лугова", "Марина");
    strokName.put("Владимирова", "Анна");
    strokName.put("Мечников", "Иван");
    strokName.put("Петин", "Петр");
    strokName.put("Ежов", "Иван");
    for (String name : strokName.values()) {
        if (!names.containsKey(name)) {
            if (Collections.frequency(strokName.values(), name) > 1) {
                names.put(name, Collections.frequency(strokName.values(), name));
            }
        }
    }
    System.out.println(names);
    ArrayList<Integer> values = new ArrayList<Integer>(names.values());
    ArrayList<String> sortedListKeys = new ArrayList<String>(names.keySet());
    for (int i = 0; i < values.size(); i++) {
        for (int j = 1; j < values.size(); j++) {
            if (values.get(j) > values.get(j-1)) {
                Values = values.get(j-1);
                values.set((j-1),values.get(j));
                values.set((j),Values);
                Keys = sortedListKeys.get(j-1);
                sortedListKeys.set((j-1),sortedListKeys.get(j));
                sortedListKeys.set((j),Keys);
            }
        }
    }
    for (int i = 0; i < values.size(); i++) {
        System.out.println("Имя "+ sortedListKeys.get(i) + " повторяется = "+ values.get(i));
    }
   
}

    static void ex3(){
        //*Реализовать алгоритм пирамидальной сортировки (HeapSort)
    }
    static void ex4(){
        //**На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    }
}
