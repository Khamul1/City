package ru.javabegin.inerface;

import ru.javabegin.objects.Settler;

import java.util.ArrayList;
import java.util.List;

public interface IFlat {

    int DEFAULT_CAPACITY = 2; // лимит жителей в квартире по условию задачи = 2
    int getNumber(); // номер квартиры
    List<Settler> getSettlerList(); // добавить нового жителя в квартиру
    void addSettler(Settler settler); // добавить квартиру

}
