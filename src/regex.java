import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String regexStr = ".*[0-9][A-Z]";
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher("12465184515644315462131654316645dsfasfas");
        boolean mathcfound = matcher.find();
        if (mathcfound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }
    }
}
