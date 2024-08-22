import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Nguyen Dat";
        System.out.println("department.id = " + department.id);
        System.out.println("department.name = " + department.name);

        Position position = new Position();
        position.Position_id = 2;
        position.name = PositionName.DEV;
        System.out.println("position.Position_id = " + position.Position_id);
        System.out.println("position.name = " + position.name);

        Account account = new Account();
        account.id = 1;
        account.User_name = "tui0123";
        account.email = "thanhdat@gmail.com";
        account.department = department;
        account.position = position;
        account.Create_date = LocalDate.now();
        System.out.println("account.department = " + account.department);
        System.out.println("account.position = " + account.position);
        System.out.println("account.Create_date = " + account.Create_date);


    }
}
