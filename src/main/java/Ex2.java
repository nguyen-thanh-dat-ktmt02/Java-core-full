import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Ex2 {

    void eex2() {
        String[] account = new String[5];
        for (int i = 1; i < 6; i++) {
            account[i] = Arrays.toString(new String[]{"Email " + i,
                    "UserName " + i,
                    "FullName " + i,
                    String.valueOf(LocalDate.now())
            });
        }
        for (String acc : account) {
            System.out.println(acc);
        }
    }
}
