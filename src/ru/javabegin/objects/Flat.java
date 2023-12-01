package ru.javabegin.objects;

import ru.javabegin.inerface.IFlat;

import java.util.ArrayList;
import java.util.List;

public class Flat implements IFlat {

    private int number; // номер квартиры
    private List<Settler> settlerList = new ArrayList<>(); // список жителей квартиры
    public Flat(int number) {
        this.number = number;
    }


    @Override
    public void addSettler(Settler settler) {
        if (settlerList.size() < DEFAULT_CAPACITY) { // если еще есть свободное место в квартире
            settlerList.add(settler);
        } else {
            System.out.println("Нельзя заселить более 2-х жителей в квартиру " + number);
        }
    }
    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number){this.number = number;}

    public void setSettlerList(List<Settler> settlerList){this.settlerList = settlerList;}

    @Override
    public List<Settler> getSettlerList() {
        return settlerList;
    }


}
