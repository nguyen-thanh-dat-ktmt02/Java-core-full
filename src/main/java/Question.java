import java.time.LocalDate;

public class Question {
    int id;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    Account account;
    LocalDate Create_date;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", categoryQuestion=" + categoryQuestion +
                ", typeQuestion=" + typeQuestion +
                ", account=" + account +
                ", Create_date=" + Create_date +
                '}';
    }
}
