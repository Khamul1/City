# City

Java-begin course. 
Create a city with houses and settle all residents in these houses.

Entities:

1) City (City) – in a single copy:
– property “name” – name of the city – String
– property “houseList” – list of houses for the city – ArrayList
– method “showSettledList” – show all inhabited inhabitants
– method “addHouse” – add a new house to the city (adds a new object to the collection houseList)

2) House – apartments will be added to it. There can be many houses in one mountain City
– property “address”: address – String
– property “FlatList”: list of apartments of the house – ArrayList
– the “addFlat” method – add a new apartment to the house (adds a new object to the FlatList collection)

3) Apartment (Flat) – we will move residents into it. There can be many apartments in one house House
– property “number”: apartment number – int
– property “settlerList”: list of apartment residents – ArrayList
– method “addSettler”: add a new resident to the apartment (adds a new object to the settlerList collection)

4) Resident (Settler) – who will live in the apartment – you can use a class (without an interface), which is conventionally called POJO (Plain Old Java Object) – it just contains properties and there is no additional. methods
– "name” property: name

An entity means an important semantic object that participates in the task (interface + implementation classes, or just a separate class without an interface).

Creating:

-1 city
-5 houses (each house has 2 apartments), the addresses of the houses can be any
-10 apartments (we assign any apartment numbers, you can manually just from -1 to 10 in ascending order), no more than 2 people can be accommodated in one apartment
-15 residents who will need to be unevenly settled in apartments (in which specific houses and apartments – at your discretion)
