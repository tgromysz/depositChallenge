public class Main {
    public static void main(String[] args) {

        float deposit = 30000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float dayInYear = 365;
        float taxRate = 0.19f;

        float income = deposit * numDays * interestRate / dayInYear;

        System.out.println("Bez podatku zarobisz: " + income );

        float tax = income * taxRate;

        System.out.println("Podatek to : " + tax);

        float profit = income - tax;

        System.out.println("Po odliczeniu podatku zarobisz: " + profit);
        System.out.println("Łączna suma to: " + (deposit + profit));
    }
}