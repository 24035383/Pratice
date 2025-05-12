import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of children's meals: ");
        int childrenMeals = input.nextInt();

        double adultTotal = adultMeals * 7.0;
        double childrenTotal = childrenMeals * 4.0;
        double total = adultTotal + childrenTotal;

        System.out.printf("Total for adult meals: $%.2f\n", adultTotal);
        System.out.printf("Total for children's meals: $%.2f\n", childrenTotal);
        System.out.printf("Total for all meals: $%.2f\n", total);
        input.close();
    }
}