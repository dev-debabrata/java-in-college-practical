// 9) Show the use of this and super keywords



class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
    void show() {
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
