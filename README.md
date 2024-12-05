# Avancerad_JAVA24_Mitar_Mitrovic_Uppgift1

# System för uthyrning av fordon

En enkel konsolbaserad applikation för att hantera en biluthyrningstjänst. Användare kan hyra och lämna tillbaka fordon och se hyreskostnader.

## Funktioner
- Flera fordonstyper: bil, SUV, lastbil, cabriolet.
- Hyra och lämna tillbaka fordon.
- Se detaljerad information om varje fordon.
- Kostnadsberäkning baserad på hyresdagar.


## Hur man startar
1. Klona repository
2. Open the project in IntelliJ IDEA.
3. Kör RentalApp-klassen från paketet com.vehiclerental.

## Projektets Struktur
VehicleRentalSystem/
- src/
- - main/
  - - java/
    - - com/
      - - vehiclerental/
        - - Vehicle.java
        - - Car.java
        - - SUV.java
        - - Truck.java
        - - Convertible.java
        - - Rentable.java
        - - RentableVehicle.java
        - - RentalApp.java

## Använda begrepp (på engelska då det är enklare att förstå)
- Inheritance: Base class Vehicle extended by specific vehicle classes (Car, SUV, Truck,     
  Convertible).
- Interfaces: Rentable interface defines methods for rental functionality.
- Encapsulation: Private fields with getter and setter methods for controlled access.
- Abstraction: Abstract class Vehicle encapsulates common attributes of all vehicles.

## Author
Mitar Mitrovic
