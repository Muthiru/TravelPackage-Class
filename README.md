Object-Oriented Programming Travel Package System

Project Overview

This project is an Object-Oriented Programming (OOP) exercise that models a travel package system using Java. It consists of multiple classes that represent different types of travel packages, including cruises and road trips, while also implementing discount features and a booking system.

Features

Implementation of an interface Discount with abstract and default methods.

A superclass TravelPackage with attributes and methods common to all travel packages.

Subclasses Cruise and RoadTrip that extend TravelPackage and provide specific implementations.

A BookingSystem to manage multiple travel bookings.

Console-based output for testing the functionalities.

Class Structure

1. Discount Interface

discountAmount(): Abstract method returning a discount percentage.

displayDiscount(): Default method that prints the discount.

2. TravelPackage (Superclass)

Fields:

name: Name of the travel package.

destination: Destination of the travel package.

Methods:

printInfo(): Displays package details.

cost(): Abstract method to return the price.

isCheaper(): Compares the cost with another package.

3. Cruise (Subclass of TravelPackage, Implements Discount)

Fields:

duration: Duration in hours.

Methods:

printInfo(): Displays cruise details.

cost(): Calculates price based on duration ($100 per 5 hours or part thereof).

discountAmount(): Returns 10% discount for durations exceeding 50 hours.

4. RoadTrip (Subclass of TravelPackage)

Fields:

distance: Distance in kilometers.

Methods:

printInfo(): Displays road trip details.

cost(): Calculates cost using formula ($50 base fee + $0.2 per km).

5. BookingSystem

Fields:

Array/List of booked TravelPackage objects.

Methods:

displayBookingDetails(): Displays all booked travel packages.

totalCost(): Computes total cost of all bookings.

6. Main (Test Class)

Creates instances of Cruise and RoadTrip.

Adds them to BookingSystem.

Tests displayBookingDetails() and totalCost() methods.

Exercise 2 (Additional Functionalities)

String Manipulation: Converting underscores (_) in a string to spaces and changing words to uppercase.

Exception Handling: Throwing a custom checked exception if a string does not contain "ERROR".

String Formatting: Joining an array of words with commas using StringBuilder.

Technologies Used

Java

Object-Oriented Programming Principles

How to Run the Project

Clone the repository.

Open the project in any Java-supported IDE (Eclipse, IntelliJ, VS Code, etc.).

Compile and run the Main class.

Future Improvements

Implement a GUI for booking.

Store booking data in a database.

Extend package types (e.g., Air Travel, Train Journeys).
