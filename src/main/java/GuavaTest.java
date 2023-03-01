import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class GuavaTest {

    public static void main(String[] args) {

        String output = Strings.padEnd("cat", 10,'*');
        System.out.println(output);

//        String input = "Life, The Universe, and Everything";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scanner.nextLine();

        System.out.println("You Entered: \"" + input + "\"");

        if (StringUtils.isNumeric(input)) {
            System.out.println("\"" + input + "\" is a number");
        } else {
            System.out.println("\"" + input + "\" is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " +StringUtils.reverse(input));


        /*  Enter Something: Life, The Universe, and Everything
            You Entered: "Life, The Universe, and Everything"
            "Life, The Universe, and Everything" is not a number
            Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
            Reversed: gnihtyrevE dna ,esrevinU eht ,efiL
        */
    }
}
