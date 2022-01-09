package homework.day9;

//3. Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오
//Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.
public class Homework3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.silent();
        human.loud();
        System.out.println();

        Tiger tiger = new Tiger();
        tiger.name = "호돌이";
        tiger.location = "산림";
        System.out.println("호랑이 이름 : " + tiger.name);
        System.out.println("호랑이 서식지 : " + tiger.location);
        System.out.println("호랑이 먹이 : " + tiger.food);

    }
}

interface Speak {
    public abstract void silent();

    public abstract void loud();
}

class Human implements Speak {

    public void silent() {
        System.out.println("조용한 사람");
    }

    public void loud() {
        System.out.println("시끄러운 사람");
    }
}

class Animal2 {
    String name;
    String location;

}

class Tiger extends Animal2 {
    String food = "육식";

}
