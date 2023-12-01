package ru.javabegin.inerface;

import java.util.List;

public interface IHouse {

    String getAddress();
    List<IFlat> getFlatList();
    void addFlat(); //добавляет новый объект в коллекцию flatList

    void addFlat(IFlat flat);
}
