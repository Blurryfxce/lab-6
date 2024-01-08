package org.xander;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema(5, 10, 20);

        int[] seatsToBook = {2, 3, 4};
        cinema.bookSeats(1, 3, seatsToBook);

        cinema.printSeatingArrangement(1);

        cinema.cancelBooking(1, 3, seatsToBook);

        cinema.printSeatingArrangement(1);

        boolean availability = cinema.checkAvailability(1, 3);
        System.out.println("Доступність місць у залі: " + availability);
    }
}