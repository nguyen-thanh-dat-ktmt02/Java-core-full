import java.time.LocalDate;

public class Account {

        int id;
        String email, User_name, Full_name;
        LocalDate Create_date;
        Department department;
        Position position;

        @Override
        public String toString() {
                return "Account{" +
                        "id=" + id +
                        ", email='" + email + '\'' +
                        ", User_name='" + User_name + '\'' +
                        ", Full_name='" + Full_name + '\'' +
                        ", Create_date=" + Create_date +
                        ", department=" + department +
                        ", position=" + position +
                        '}';
        }
}
