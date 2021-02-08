# Topics

## Review lab on "Getting started with inheritance"
* Write an abstract superclass named LibraryItem (a library item has a title and some kind of id-code).
* Write a subclass named Book. A Book is a kind of LibraryItem, with additional data (author, genre).
* Write a subclass named Film. A Film is a kind of LibraryItem, with additional data (director, rating, length).
* Write toString() functions in all the classes.
* Write some simple main() code to use your classes.

## Chapter 9 - Inheritance, continued
* Slides 16 - end

## Chapter 10 - Interfaces
* Have a look at the following slides in particular: 1-14, 19 

## Lab
* Define an abstract superclass named Flight. A flight has info such as a flight code (e.g. SK812), from/to, time of departure, flight duration. 
* Define two concrete subclasses - LongHaulFlight and ShortHaul.
* Implement some polymorphic behaviour in your flight hierarchy. E.g. all flights have a "check-in-before" time, but its different for long//short-haul flights. Etc....
* Define a class named FlightSchedule. It keeps all the flights (use a HashMap<String,Flight> - each key is a flight code, each value is a flight.
* In FlightSchedule, define methods to add a flight, display all flights, count how many short haul flights there are. Etc...

* Optional extra: Define an interface called Logger, which has a single method to log a string message. Then define a class named ConsoleLogger that implements the interface and displays log messages on the console. Finally enhance your FlightSchedule class so that it receives a Logger in its ctor and uses it to write log messages someehere. This is a realistic example of the use of interface.
