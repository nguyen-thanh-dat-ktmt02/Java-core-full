public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Dog dog = new Dog(); // Khởi tạo 1 đối tượng t 1 class hay 1 bản vẽ
        System.out.println("dog.max(4, 6) = " + dog.max(4, 6));

        dog.name = "Shiba";
        dog.age = 3;

        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        dog.bark();

    }
}
