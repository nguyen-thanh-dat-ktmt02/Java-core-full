import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Nguyen Dat";
        System.out.println("department.id = " + department.id);
        System.out.println("department.name = " + department.name);

        Position position = new Position();
        position.Position_id = 1;
        position.name = PositionName.DEV;
        System.out.println("position.Position_id = " + position.Position_id);
        System.out.println("position.name = " + position.name);

        Account account = new Account();
        account.id = 1;
        account.User_name = "tui0123";
        account.Full_name = "Nguyen Thanh Dat";
        account.email = "thanhdat@gmail.com";
        account.department = department;
        account.position = position;
        account.Create_date = LocalDate.now();
        System.out.println("account.department = " + account.department);
        System.out.println("account.position = " + account.position);
        System.out.println("account.Create_date = " + account.Create_date);

        Group group = new Group();
        group.id = 1;
        group.name = "Xây dựng";
        group.creator = account;
        group.Create_date = LocalDate.now();
        System.out.println("group.creator = " + group.creator);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.group = group;
        groupAccount.account = account;
        groupAccount.Join_date = LocalDate.now();
        System.out.println("groupAccount.group = " + groupAccount.group);

    }
}
