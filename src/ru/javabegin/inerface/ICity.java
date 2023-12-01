package ru.javabegin.inerface;

public interface ICity {

    String getName(); // название города
    String getHouseList(); // доступные дома в городе
    void showSettledList(); // показать заселенных жителей в домах-квартирах

    void addHouse(IHouse house);

}
