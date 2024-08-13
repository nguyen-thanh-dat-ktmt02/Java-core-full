import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // kiểu nguyên thủy: viết thường và được intellij in đậm màu xanh dương
        // kiểu không phải nguyên thủy: viết hoa chữ cái đầu
        // kiểu số nguyên
        // byte (1 byte = 8 bits), short(2), int(4), long(8)
        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực
        // float(4), double(8)
        float pi = 3.14159F;
        System.out.println("pi = " + pi);

        // Kiểu logic
        // boolean (1)
        boolean isLoading= true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự
        // char (2)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu xâu kí tự
        // String
        String s = "Java Core";
        String z = ""; // Chuỗi rỗng
        System.out.println("s = " + s);
        System.out.println("z = " + z);

        // Kiểu thời gian
        // LocalDate (Ngày tháng năm), LocalTime (Giờ phút giây), LocalDateTime (Ngày tháng năm Giờ phút giây)
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate date = LocalDate.of(2025,9,2);
        System.out.println("quoc khánh 80 năm = " + date);

        // Kiểu enum
        UiState state = UiState.LOADING;
        System.out.println("state = " + state);

        // Kiểu mảng hay kiểu array
        int[] numbers = {0, 1, 2, 3, 4};
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số: bắt đầu từ 0
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]);
        // Cách 2
        String[] fruits = new String[] {"Cam", "Man", "Tao"};
        char[] characters = new char[10];
        System.out.println("characters.length = " + characters.length);
        characters[0]= 'D';

    }
}
