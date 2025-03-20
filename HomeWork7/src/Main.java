public class Main {
    public static void main(String[] args) {
        int totalSum = 2459000;
        int monthlyFee = 15000;
        int availableAtTheMoment = 0;
        int month = 0;
        while (availableAtTheMoment < totalSum) {
            availableAtTheMoment += monthlyFee;
            month += 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + availableAtTheMoment + " рублей");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        int population = 12000000;
        int birthrate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            int born = (population * birthrate) / 1000;
            int died = (population * deathRate) / 1000;
            population += born - died;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        int firstFriday = 5;
        int daysMonth = 31;
        for (int day = firstFriday; day <= daysMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        int dateYear = 2025;
        int startYear = dateYear - 200;
        int endYear = dateYear + 100;
        for (int year = startYear; year <= dateYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        for (int year = dateYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
                break;
            }
        }

                }
            }