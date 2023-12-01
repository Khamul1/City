package ru.javabegin.objects;

import ru.javabegin.inerface.IFlat;
import ru.javabegin.inerface.IHouse;

import java.util.ArrayList;
import java.util.List;

public class House implements IHouse {

    private String address; // адрес дома

    private List<IFlat> flatList = new ArrayList<>(); // список квартир в доме

    public House(String address) {this.address = address;}

    @Override
    // добавляем квартиру
    public void addFlat(IFlat flat) {flatList.add(flat); //добавляем квартиру в дом
    }
    @Override
    public String getAddress() {return address;}

    public void  setAddress(String address){this.address = address;}

    @Override
    public List<IFlat> getFlatList() {return flatList;}

    public void setFlatList(List<IFlat> flatList) {
        this.flatList = flatList;
    }

    @Override
    public void addFlat() {

    }


}



