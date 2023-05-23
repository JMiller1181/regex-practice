import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Practice {
    public static void main(String[] args){
        //Email matching
        Pattern eMailPattern = Pattern.compile("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
        Matcher eMailMatcher = eMailPattern.matcher("This.is.an@email.com");
        boolean eMailMatches = eMailMatcher.matches();
        System.out.println("E-mail: " + eMailMatches);
        //Phone number matching
        Pattern phonePattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
        Matcher phoneMatcher = phonePattern.matcher("(123) 456-7890");
        boolean phoneMatches = phoneMatcher.matches();
        System.out.println("Phone: " + phoneMatches);
        //Date matching
        Pattern datePattern = Pattern.compile("^(0[1-9]|1[0-2])/([0-2][1-9]|3[0-1])/(19[0-9]{2}|2[0-9]{3})$");
        Matcher dateMatcher = datePattern.matcher("01/01/2023");
        boolean dateMatches = dateMatcher.matches();
        System.out.println("Date: " + dateMatches);
        //URL matching
        Pattern urlPattern = Pattern.compile("^[A-Za-z]{2,}\\.[A-za-z-/]+\\.[A-za-z]{2,}$");
        Matcher urlMatcher = urlPattern.matcher("www.a-url/home.com");
        boolean urlMatches = urlMatcher.matches();
        System.out.println("URL: " + urlMatches);
        //CC matching
        Pattern creditPattern = Pattern.compile("^[0-9]{4}[ -][0-9]{4}[ -][0-9]{4}[ -][0-9]{4}$");
        Matcher creditMatcher = creditPattern.matcher("2222-4444 6666-8888");
        boolean creditMatches = creditMatcher.matches();
        System.out.println("Credit Card: "+ creditMatches);
        //ZIP matching
        Pattern zipPattern = Pattern.compile("^[0-9]{5}-[0-9]{4}|[0-9]{5}");
        Matcher zipMatcher = zipPattern.matcher("23454-9454");
        boolean zipMatches = zipMatcher.matches();
        System.out.println("ZIP: " + zipMatches);
        //Java Identifier matching
        Pattern javaPattern = Pattern.compile("^[A-Za-z_$][A-Za-z\\d_$]*$");
        Matcher javaMatcher = javaPattern.matcher("try");
        boolean javaMatches = javaMatcher.matches();
        System.out.println("Java Identifier: " + javaMatches);
        //Hex matching
        Pattern hexPattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");
        Matcher hexMatcher = hexPattern.matcher("#FFFFFF");
        boolean hexMatches = hexMatcher.matches();
        System.out.println("Hex Code: " + hexMatches);
        //Time matching
        Pattern timePattern = Pattern.compile("^([0-1][0-9]|2[0-3]):[0-5][0-9]$");
        Matcher timeMatcher = timePattern.matcher("23:59");
        boolean timeMatches = timeMatcher.matches();
        System.out.println("Time: " + timeMatches);
    }
}
