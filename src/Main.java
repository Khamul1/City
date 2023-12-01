import ru.javabegin.objects.City;
import ru.javabegin.objects.Flat;
import ru.javabegin.objects.House;
import ru.javabegin.objects.Settler;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // город
        City city = new City("Москва");

        // дома для города
        House house1 = new House("ул. Иванова, д.5");
        House house2 = new House("ул. Королев, д.124");
        House house3 = new House("ул. Маркса, д.111");
        House house4 = new House("ул. Ленина, д.23");
        House house5 = new House("ул. Чапаева, д.40");

        // квартиры для дома

        Flat flat1 = new Flat(1);
        Flat flat2 = new Flat(2);
        Flat flat3 = new Flat(3);
        Flat flat4 = new Flat(4);
        Flat flat5 = new Flat(5);
        Flat flat6 = new Flat(6);
        Flat flat7 = new Flat(7);
        Flat flat8 = new Flat(8);
        Flat flat9 = new Flat(9);
        Flat flat10 = new Flat(10);

        // добавляем квартиры в дома
        house1.addFlat(flat1);
        house1.addFlat(flat2);

        house2.addFlat(flat3);
        house2.addFlat(flat4);

        house3.addFlat(flat5);
        house3.addFlat(flat6);

        house4.addFlat(flat7);
        house4.addFlat(flat8);

        house5.addFlat(flat9);
        house5.addFlat(flat10);

        // добавляем дома в город
        city.addHouse(house1);
        city.addHouse(house2);
        city.addHouse(house3);
        city.addHouse(house4);
        city.addHouse(house5);

        // создаем жителей
        Settler settler1 = new Settler("settler1");
        Settler settler2 = new Settler("settler2");
        Settler settler3 = new Settler("settler3");
        Settler settler4 = new Settler("settler4");
        Settler settler5 = new Settler("settler5");
        Settler settler6 = new Settler("settler6");
        Settler settler7 = new Settler("settler7");
        Settler settler8 = new Settler("settler8");
        Settler settler9 = new Settler("settler9");
        Settler settler10 = new Settler("settler10");
        Settler settler11 = new Settler("settler11");
        Settler settler12 = new Settler("settler12");
        Settler settler13 = new Settler("settler13");
        Settler settler14 = new Settler("settler14");
        Settler settler15 = new Settler("settler15");
        Settler settler16 = new Settler("settler16");
        Settler settler17 = new Settler("settler17");
        Settler settler18 = new Settler("settler18");
        Settler settler19 = new Settler("settler19");
        Settler settler20 = new Settler("settler20");

        // расселяем жителей по домам

        flat1.addSettler(settler1); // можно создавать объекты
        flat1.addSettler(settler2);

        flat2.addSettler(settler3);
        flat2.addSettler(settler4);
        flat2.addSettler(settler5); // пытаемся заселить в одну квартиру более 2-х человек

        flat3.addSettler(settler6);

        flat4.addSettler(settler7);
        flat4.addSettler(settler8);

        flat5.addSettler(settler9);
        flat5.addSettler(settler10);

        flat6.addSettler(settler11);

        flat7.addSettler(settler13);
        flat7.addSettler(settler14);

        flat8.addSettler(settler15);
        flat8.addSettler(settler16);

        flat9.addSettler(settler17);
        flat9.addSettler(settler18);

        flat10.addSettler(settler19);
        flat10.addSettler(settler20);

        city.showSettledList(); // показать заселенных жителей

    }
}