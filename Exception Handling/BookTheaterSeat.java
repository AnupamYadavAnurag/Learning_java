// Real-world Thread Example: Movie Ticket Booking

class BookTheaterSeat {
    int totalSeats = 10; // total available seats

    synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(Thread.currentThread().getName() + " booked " + seats + " seat(s) successfully.");
            totalSeats = totalSeats - seats;
            System.out.println("Seats left: " + totalSeats);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to book " + seats + " seat(s), but not enough seats left.");
            System.out.println("Seats left: " + totalSeats);
        }
    }
}

class MyThread extends Thread {
    BookTheaterSeat b;
    int seats;

    MyThread(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        BookTheaterSeat obj = new BookTheaterSeat();

        MyThread t1 = new MyThread(obj, 7);
        t1.setName("Anupam");

        MyThread t2 = new MyThread(obj, 5);
        t2.setName("Vineet");

        t1.start();
        t2.start();
    }
}
