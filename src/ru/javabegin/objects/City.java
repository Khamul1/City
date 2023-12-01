package ru.javabegin.objects;

import ru.javabegin.inerface.ICity;
import ru.javabegin.inerface.IFlat;
import ru.javabegin.inerface.IHouse;

import java.util.ArrayList;
import java.util.List;

public class City implements ICity {

    private String name; // название города

    public City(String name) {
        this.name = name;
    }

    private List<IHouse> houseList = new ArrayList<>(); // список домов для города

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHouseList() {
        return name;
    }

    public void setHouseList(List<IHouse> houseList) {
        this.houseList = houseList;

    }

    @Override
    public void addHouse(IHouse house) {
        houseList.add(house); // добавляем в общую коллекцию

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showSettledList() { // показать заселенных жителей (используем для этого вложенные циклы)
        System.out.println("Город" + name); // выводим названи города

        for (IHouse house : houseList) { // цикл по домам

            System.out.println("Дом" + house.getAddress());
            for (IFlat flat : house.getFlatList()) { // цикл по квартирам

                System.out.println("- Квартира:" + flat.getNumber()); // выводим квартиру с номера
                if (flat.getSettlerList().size() == 0) { // если в квартире нет жителей

                    System.out.println("-- Никто не живет");

                    continue;}// выходим полностью из метода (чтобы не выполнялся дальнейший код ниже)
            // если же жители есть в квартире
                for (Settler settler : flat.getSettlerList()){ // цикл по жителям

                        String result = String.format("-- Житель %s",settler.getName());
                        System.out.println(result);
                    }
                }
            }
        System.out.println(); // для отступа, чтобы не слипались записи
        }
    }
