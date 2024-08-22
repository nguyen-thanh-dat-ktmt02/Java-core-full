import java.time.LocalDate;

public class Group {

        int id;
        String name;
        Account creator;
        LocalDate Create_date;

        @Override
        public String toString() {
                return "Group{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", creator=" + creator +
                        ", Create_date=" + Create_date +
                        '}';
        }
}
