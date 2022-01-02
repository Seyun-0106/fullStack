package homework;

import java.security.Key;

//컴퓨터 부품을 class로 작성하고 컴퓨터 부품을 조합하여 컴퓨터 class를 완성하시오.
public class Computer {
    public static void main(String[] args) {
        CPU cpu = new CPU("i7-10700K", "인텔", 411960);
        RAM ram = new RAM("PC4-21300", "삼성", 43750);
        SSD ssd = new SSD("860 EVO", "삼성", 69790);
        Monitor monitor = new Monitor("24MK430H", "LG전자", 182900);
        Keyboard keyboard = new Keyboard("GK868B", "한성컴퓨터", 148000);
        Mouse mouse = new Mouse("G102 Prodigy", "로지텍", 24340);

        System.out.println("CPU: " + cpu.name + " " + cpu.model + " 가격: " + cpu.price);
        System.out.println("RAM: " + ram.name + " " + ram.model + " 가격: " + ram.price);
        System.out.println("SSD: " + ssd.name + " " + ssd.model + " 가격: " + ssd.price);
        System.out.println("Monitor: " + monitor.name +" " + monitor.model + " 가격: " + monitor.price);
        System.out.println("Keyboard: " + keyboard.name + " " + keyboard.model + " 가격: " + keyboard.price);
        System.out.println("Mouse: " + mouse.name + " " + mouse.model + " 가격: " + mouse.price);

    }
}

// CPU, RAM, SSD, Power, case monitor, keyboard mouse speaker
class Part {
    String name;
    String model;
    int price;
}

class CPU extends Part {
    public CPU(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}

class RAM extends Part {
    public RAM(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}

class SSD extends Part {
    public SSD(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}

class Monitor extends Part {
    public Monitor(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}

class Keyboard extends Part {
   public Keyboard(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}

class Mouse extends Part {
    public Mouse(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}
