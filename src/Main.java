public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int firstFriday = 2;
        for (int i = firstFriday; i <= 31; i+=7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 2");
        System.out.println("do-while");
        int dist = 0;
        int marafon = 42195;
        do {
            System.out.println ("Держитесь! Осталось " +(marafon - dist)+" метров");
            dist = dist + 500;
        }
        while (dist <= marafon);

        System.out.println("for");
        for(dist = 0; dist <= marafon; dist = dist + 500){
            System.out.println ("Держитесь! Осталось " +(marafon - dist)+" метров");
        }
        System.out.println("Задание 3");
        System.out.println("while");
        int cost = 980;
        int day = 0;
        while(cost >= 100){
            day++;
            if ((day % 5) ==0){
                continue;
            }
            cost= cost - 100;
        }
        System.out.println("Суммы хватит на " + day+ ", на счету осталось " + cost);

        System.out.println("for");
        cost = 980;
        day = 0;
        for (; cost >= 100;) {
            day++;
            if (day % 5 == 0) continue;
            cost -= 100;
        }

        System.out.println("Суммы хватит на " + day + " дней, на счету осталось " + cost);

        System.out.println("Задание 4");
        int month = 0;
        int total = 0;
        while(true){
            month++;
            total += 15000;
            if (month % 6 == 0){
                total = total + total / 100 * 7;
            }
            System.out.println("Месяц "+month+" cумма "+total);
            if (total >= 12000000){
                break;
            }
        }
        System.out.println("Задание 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while(charge<=100){
            minute++;
            if (minute % 10 == 0){
                overheats++;
                System.out.println("Перегрев!!!");
                continue;
            }
            if (overheats>=3){
                System.out.println("Перегрев был три раза. Останвока зарядки");
                break;
            }
            charge+=2;
        }
        System.out.println("Время зарядки составило "+minute+" минут");

    }
}