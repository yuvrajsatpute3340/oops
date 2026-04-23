package Synchronized;

	public class Nine {
	    private int availableSeats = 5;

	    public synchronized void bookTicket(String name, int seats) {

	        if (availableSeats >= seats) {
	            System.out.println(name + " booked " + seats + " seat(s)");
	            availableSeats -= seats;
	        } else {
	            System.out.println(name + " failed to book (Not enough seats)");
	        }

	        System.out.println("Remaining seats: " + availableSeats);
	    }
	}

	class BookingThread extends Thread {
	    Nine counter;
	    String name;
	    int seats;

	    BookingThread(Nine counter, String name, int seats) {
	        this.counter = counter;
	        this.name = name;
	        this.seats = seats;
	    }

	    public void run() {
	        counter.bookTicket(name, seats);
	    }
	}

	 class Main1 {
	    public static void main(String[] args) throws Exception {

	        Nine counter = new Nine();

	        Thread t1 = new BookingThread(counter, "Amit", 2);
	        Thread t2 = new BookingThread(counter, "Rahul", 3);
	        Thread t3 = new BookingThread(counter, "Neha", 2);

	        t1.start();
	        t2.start();
	        t3.start();

	        t1.join();
	        t2.join();
	        t3.join();

	        System.out.println("Booking finished");
	    }
	}
