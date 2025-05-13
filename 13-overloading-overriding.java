// 13) Show overloading and overwriting



class Example {
    void show() {
        System.out.println("No arg");
    }

    void show(int x) { // Overloading
        System.out.println("With arg: " + x);
    }
}

class SubExample extends Example {
    @Override
    void show() {
        System.out.println("Overridden method");
    }
}
