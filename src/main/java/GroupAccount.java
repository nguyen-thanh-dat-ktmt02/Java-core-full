import java.time.LocalDate;

public class GroupAccount {

        Group group;
        Account account;
        LocalDate Join_date;

        @Override
        public String toString() {
                return "GroupAccount{" +
                        "group=" + group +
                        ", account=" + account +
                        ", Join_date=" + Join_date +
                        '}';
        }
}
