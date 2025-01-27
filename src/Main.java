//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("задача 1");

        int targetSum = 2_459_000;
        double sum = 0;
        int amount = 15_000;
        double precent = 1D / 100;
        int month = 0;
        while (sum < targetSum) {
            sum += amount;
            sum = (int) (sum * (1 + precent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("задача 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println("задача 3");

        int countryPopulation = 12_000_000;
        int mortalePopulation = 8;
        int natalityPopilation = 17;
        int curreitYear = 2024;
        for (int year = curreitYear; year < curreitYear + 10; year++) {
            countryPopulation += countryPopulation * natalityPopilation / 1000 - countryPopulation * mortalePopulation / 1000;

            System.out.println("Год " + year + ", численность населения составляет " + countryPopulation);

        }

        System.out.println("задача 4");

        int vasilyСontribution = 15_000;
        int target = 12_000_000;
        int month1 = 0;
        double vasilyPrecent = 7D / 100;
        while (vasilyСontribution <= target) {
            vasilyСontribution = (int) (vasilyСontribution * (1 + vasilyPrecent));
            month1++;
            System.out.println("месяц:" + month1 + " вклад:" + vasilyСontribution + " рублей");
        }

        System.out.println("задача 5");
        int vasilyСontribution1 = 15_000;
        int target1 = 12_000_000;
        int month2 = 0;
        double vasilyPrecent1 = 7D / 100;
        while (vasilyСontribution1 <= target1) {
            vasilyСontribution1 = (int) (vasilyСontribution1 * (1 + vasilyPrecent1));
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("месяц:" + month2 + " вклад:" + vasilyСontribution1 + " рублей");
            }


            System.out.println("задача 6");

            int vasilyСontribution2 = 15_000;
            int month3 = 0;
            int months = 12 * 9;
            double vasilyPrecent2 = 7D / 100;
            while (month3 <= months) {
                vasilyСontribution2 = (int) (vasilyСontribution2 * (1 + vasilyPrecent2));
                month3++;
                if (month3 % 6 == 0) {
                    System.out.println("месяц:" + month3 + " вклад:" + vasilyСontribution2 + " рублей");}

                }
            System.out.println("задача 7");


            int friday = 3;
            for (int m = friday; m <= 31 ; m += 7){
                    System.out.println("Сегодня пятница, "+ m + " число. Необходимо подготовить отчет" );
                }
            }
        System.out.println("задача 8");

        int yearComet = 0;
        int yearPeriodComet = 2024;
        int startPeriodComet = yearPeriodComet - 200;
        int endPeriodComet =  yearPeriodComet + 100;
        int yearPeriod = 79;
        for (int year = yearComet; year < endPeriodComet ; year+=yearPeriod) {
            if (year > startPeriodComet){
                System.out.println(year);
            }

            
        }



            }
        }




