// class: bản vẽ, bản thiết kế
// Bất kỳ class hay enum nào đều là 1 kiểu dữ liệu
public class Dog {
    // 1. Property (Thuộc tính)
    String name;
    int age;

    // 2. Method (Phuong thức)
    void bark(){
        System.out.println("gau gau");
    }

    int max(int a, int b){
        if (a>b){
            return a;
        }
        else
            return b;
    }
}
