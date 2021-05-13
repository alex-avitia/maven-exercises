import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MvnTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = scan.nextLine();

        System.out.printf("\nYou entered: \"%s\"\n", input);
        if(StringUtils.isNumeric(input)) {
            System.out.printf("\"%s\" is numeric.\n", input);
        } else {
            System.out.printf("\"%s\" is not numeric.\n", input);
        }

        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(input));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(input));


    }
}
