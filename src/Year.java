import java.util.Arrays;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        String seasonName = getMonthName();
        try {
            Season season = Season.convertSeason(seasonName);
            System.out.println("Ta pora roku ma następujące miesiące:");
            System.out.println(Arrays.toString(season.getMonths()));
        } catch (IllegalArgumentException e) {
            System.err.println("Ta pora roku nie istnieje w kalendarzu!");
        }
    }

    private static String getMonthName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku z podanego kalędarza:");
        printSeasons();
        return scanner.nextLine();
    }
    private static void printSeasons() {
        Season[] values = Season.values();
        for (Season season : values) {
            System.out.println(season.getName());
        }
    }
}
