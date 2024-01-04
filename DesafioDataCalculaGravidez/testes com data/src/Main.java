import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat formatDefault = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String data = formatDefault.format(date);
        System.out.println(data);
    }
}
