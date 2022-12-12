


import java.util.HashSet;

public class ShowFond {
    public void FondLaptops(String key, String value, HashSet<Laptop> laptopsSet) {
        switch(key){
            case "model":
                for (var elem: laptopsSet) {
                    if (elem.model.equals(value)) {
                        System.out.println(elem);
                    }
                }
            break;


            case "ssd":
            for (var elem: laptopsSet) {
                if (elem.ssd.equals(value)) {
                    System.out.println(elem);
                }
            }
            break;


            case "ram":
            for (var elem:laptopsSet) {
                if (elem.ram.equals(value)) {
                    System.out.println(elem);
                }
            }
            break;

            case "os":
            for (var elem: laptopsSet) {
                if (elem.os.equals(value)) {
                    System.out.println(elem);
                }
            }
            break;

            case "color":
            for (var elem: laptopsSet) {
                if (elem.color.equals(value)) {
                    System.out.println(elem);
                }
            }
            break;

            default: 
            System.out.println("Не найдены");

        }
    }
}
