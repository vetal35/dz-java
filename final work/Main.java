


/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.Map;
// import java.util.Objects;
// import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("8", "256", "Windows", "Red");
        laptop1.setModel("Lenovo");
        Laptop laptop2 = new Laptop("16", "512", "Linux", "Blue");
        laptop2.setModel("AppleAir");
        Laptop laptop3 = new Laptop("32", "1024", "Dos", "Black");
        laptop3.setModel("Honor");
        Laptop laptop4 = new Laptop("16", "1024", "linux", "Black");
        laptop4.setModel("Huawei");
        Laptop laptop5 = new Laptop("32", "1024", "Apple", "Red");
        laptop5.setModel("AppleAir");


        HashSet<Laptop> laptopsSet = new HashSet<>();
        laptopsSet.add(laptop1);
        laptopsSet.add(laptop2);
        laptopsSet.add(laptop3);
        laptopsSet.add(laptop4);
        laptopsSet.add(laptop5);

        Search search = new Search();
        HashMap<String, String> laptopFind = search.Look(); // Запрос параметров для поиска

        Iterator<Laptop> i = laptopsSet.iterator(); // Вывод всех ноутбуков в наличии
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("\n");


        String k;
        String v;
        for (HashMap.Entry<String, String> item: laptopFind.entrySet()) {
            k = item.getKey(); v = item.getValue();

        System.out.println("По указанному критерию найдены следующие ноутбуки:");
        ShowFond fond = new ShowFond();
        fond.FondLaptops(k, v, laptopsSet);
        }
    }
}