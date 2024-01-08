package org.xander;

public class Cinema {
    private int[][][] seatingArrangement;

    public Cinema(int halls, int rows, int seats) {

        seatingArrangement = new int[halls][rows][seats];
    }

    public void bookSeats(int hallNumber, int row, int[] seats) {

        for (int seat : seats) {
            if (seatingArrangement[hallNumber][row][seat] == 0) {
                seatingArrangement[hallNumber][row][seat] = 1;
            } else {
                System.out.println("Місце " + seat + " в ряду " + row + " залу " + hallNumber + " вже заброньоване.");
            }
        }
    }

    public void cancelBooking(int hallNumber, int row, int[] seats) {

        for (int seat : seats) {
            seatingArrangement[hallNumber][row][seat] = 0;
        }
    }

    public boolean checkAvailability(int hallNumber, int numSeats) {

        for (int i = 0; i < seatingArrangement[hallNumber].length; i++) {
            int consecutiveSeats = 0;
            for (int j = 0; j < seatingArrangement[hallNumber][i].length; j++) {
                if (seatingArrangement[hallNumber][i][j] == 0) {
                    consecutiveSeats++;
                    if (consecutiveSeats == numSeats) {
                        return true;
                    }
                } else {
                    consecutiveSeats = 0;
                }
            }
        }
        return false;
    }

    public void printSeatingArrangement(int hallNumber) {

        System.out.println("Схема розміщення місць для залу " + hallNumber + ":");
        for (int i = 0; i < seatingArrangement[hallNumber].length; i++) {
            for (int j = 0; j < seatingArrangement[hallNumber][i].length; j++) {
                if (seatingArrangement[hallNumber][i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }


}

