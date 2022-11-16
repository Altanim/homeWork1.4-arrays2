public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int costSumm = 0;
        int[] arr = generateRandomArray();
        for (int index = 0; index < arr.length; index++) {
            costSumm += arr[index];
        }
        System.out.println("Сумма трат за месяц: -" + costSumm + " рублей.");

        // Задача №2
        System.out.println("\nЗадача №2");
        int maxCost = -1;
        int minCost = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            } else if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила -" + minCost +
                " рублей. Максимальная сумма трат за месяц составила -" + maxCost + " рублей.");

        // Задача №3
        System.out.println("\nЗадача №3");

        float averageCost = costSumm / arr.length;
        System.out.println("Средняя сумма трат за месяц составила -" + averageCost + " рублей");

        // Задача №4
        System.out.println("\nЗадача №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            int x = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = reverseFullName[i];
            reverseFullName[i] = (char) x;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        }
    }

