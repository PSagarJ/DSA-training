package DSA_Projects;

class BookingApp {
    String name;
    int age;
    int phone;
    boolean isPaid;

    public void pay(){
        this.isPaid = true;
    }
    public boolean SeatCounf(){
        return isPaid;
    }
}

public class OOPs{

    public static void main(String[] args) {
        BookingApp b1 = new BookingApp();
        b1.name = "Sagar";
        b1.age = 20;
        b1.phone = 1234567890;

        b1.isPaid = true;
        b1.pay();

        System.out.println(b1.SeatCounf());


        BookingApp b2 = new BookingApp();
        b2.name = "Harsh";
        b2.age = 25;
        b2.phone = 1236489655;

        b2.isPaid = false;

        System.out.println(b2.SeatCounf());

        b2.pay();
        System.out.println(b2.SeatCounf());
    }
}
