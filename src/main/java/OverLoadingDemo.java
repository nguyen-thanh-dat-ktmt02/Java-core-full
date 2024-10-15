public class OverLoadingDemo {
    public static void main(String[] args) {

    }

    public int sum(int a, int b){
        return a + b;
    }

    public  int sum(int a, byte c){
        return a + c;
    }
}
