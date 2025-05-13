// 12) Show interface


interface Vehicle {
    void run();
}

class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}
