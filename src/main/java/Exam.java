import java.time.LocalDate;
import java.time.LocalTime;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion categoryQuestion;
    LocalTime duration;
    Account account;
    LocalDate create_date;

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", categoryQuestion=" + categoryQuestion +
                ", duration=" + duration +
                ", account=" + account +
                ", create_date=" + create_date +
                '}';
    }
}
