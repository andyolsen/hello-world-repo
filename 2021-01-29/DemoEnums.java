package demo.additionallanguagefeatures;

enum UkPoliticalParty { CONSERVATIVE, LABOUR, LIBDEMS, GREEN, PLAIDCYMRU, SNP }
enum PrimaryColor { RED, GREEN, BLUE }

public class DemoEnums {

    public static void main(String[] args) {
//        demoUsingInts();
//        demoUsingArrays();
//        demoUsingEnums();
        demoUsingEmployee();
    }

    private static void demoUsingInts() {
        int currentSeason = 100;
        if (currentSeason == 1 || currentSeason == 3)
            System.out.println("Transition season");
    }

    private static void demoUsingArrays() {
        final String[] SEASON_NAMES = {"VINTER", "VAAR", "SOMMER", "HOEST"};
        String currentSeason = SEASON_NAMES[0];

        if (currentSeason.equals(SEASON_NAMES[1]) || currentSeason.equals(SEASON_NAMES[3]))
            System.out.println("Transition season");
    }

    private static void demoUsingEnums() {
        Season currentSeason = Season.VINTER;
        System.out.println("Current season as mnemonic: " + currentSeason);
        System.out.println("Current season as ordinal: " + currentSeason.ordinal());
        if (currentSeason == Season.VAAR || currentSeason == Season.HOEST) {
            System.out.println("Transition season");
        }
    }

    private static void demoUsingEmployee() {
        Employee e1 = new Employee("Boris", 0, Employee.ContractType.PART_TIME);
        System.out.println(e1);
    }
}
