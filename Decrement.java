interface Decrementable {
    public void decrement();
}

class NumberDecrementer implements Decrementable {
    int value;

    NumberDecrementer() {
        value = 100;
    }

    NumberDecrementer(int value) {
        this.value = value;
    }

    public void decrement() {
        value--;
    }

    public String toString() {
        return "The value is " + value;
    }

}

class RainbowColor implements Decrementable {
    private String[] rainbow = { "red", "orange", "yellow", "green", "cyan", "blue", "purple" };
    private int colorIndex;

    RainbowColor() {
        colorIndex = 6;
    }

    RainbowColor(int index) {
        if (index > 6 || index < 0) {
            colorIndex = 6;
        } else {
            colorIndex = index;
        }
    }

    public void decrement() {
        if (colorIndex <= 6 && colorIndex > 0) {
            colorIndex--;
        } else {
            colorIndex = 6;
        }

    }

    public String toString() {
        return "The color is " + rainbow[colorIndex];
    }

}

class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------");

        NumberDecrementer m1 = new NumberDecrementer();
        m1.decrement();
        System.out.println(m1);

        System.out.println("----------------------------------------------------------------------------");

        NumberDecrementer m2 = new NumberDecrementer(10);
        m2.decrement();
        System.out.println(m2);

        System.out.println("----------------------------------------------------------------------------");

        NumberDecrementer m3 = new NumberDecrementer(30);
        m3.decrement();
        m3.decrement();
        System.out.println(m3);

        System.out.println("----------------------------------------------------------------------------");

        Decrementable[] array = new Decrementable[] { new NumberDecrementer(), new NumberDecrementer(10),
                new NumberDecrementer(20) };
        for (Decrementable i : array) {
            i.decrement();
        }
        for (Decrementable i : array) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------------------------------");

        RainbowColor m4 = new RainbowColor();
        System.out.println(m4);
        m4.decrement();
        System.out.println(m4);
        m4.decrement();

        System.out.println("----------------------------------------------------------------------------");

        RainbowColor m5 = new RainbowColor(10);
        System.out.println(m5);

        RainbowColor m6 = new RainbowColor(-10);
        System.out.println(m6);

        RainbowColor m7 = new RainbowColor(5);
        System.out.println(m7);

        System.out.println("----------------------------------------------------------------------------");

        Decrementable[] array2=new Decrementable[]{new RainbowColor(),new RainbowColor(3),new RainbowColor(20)};
        for (Decrementable i:array2){i.decrement();}
        for (Decrementable i:array2){System.out.println(i);}

        System.out.println("----------------------------------------------------------------------------");

        RainbowColor rc1=new RainbowColor();
        for (int i=0;i<10;i++){
            System.out.println(rc1);
            rc1.decrement();
        }

    }
}