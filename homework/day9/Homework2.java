package homework.day9;

//2. class Animal을 만들고, 멤버변수 name, location을 private로 지정하고,
//gettter,setter을 만드시오.location은 land,sea,air만 입력할 수 있도록 하시오
public class Homework2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        
        animal.setName("강아지");
        animal.setLocation("land");
        System.out.println(animal.getName());
        System.out.println(animal.getLocation());

        // land,sea,air 이외의 문자열 입력된 경우 테스트
        // animal.setLocation("땅");
    }

}

class Animal {
    private String name;
    private String location;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location =="land" | location == "sea" | location == "air"){
            this.location = location;
        } else {
            System.out.println("location은 land, sea, air만 입력하시오.");
        }
        
    }

    
}
