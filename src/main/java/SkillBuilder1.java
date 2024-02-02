import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (Leen Jean)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number: ");
        double spice = input.nextDouble();

        double mexp1 = Math.pow(2,spice);
        System.out.println("Well " + name +", the spice value resulted in " + mexp1);

        double convertedValue = Math.round(mexp1*100.0)/100.0;
        System.out.println("And the converted value is "+ convertedValue);


    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        double paintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        int cansNeeded = (int) Math.ceil(gallonsPerCan*paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + "can(s)");
    }
}
