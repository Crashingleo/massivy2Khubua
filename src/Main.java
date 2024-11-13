import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
    public static void task2(){
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(" Минимальная сумма трат состовляет " + min + " рублей");
        System.out.println(" Максимальная сумма трат состовляет " + max + " рублей");
    }
    public static void task3(){
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        double average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = (double)sum / array.length;
        System.out.println(average);
    }
    public static void task4(){

        char[] reverseArray = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char period;
        for (int i = 0; i < reverseArray.length/2; i++) {
            period = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - i - 1];
            reverseArray[reverseArray.length - i - 1] = period;
        }
        for (char c: reverseArray) {
            System.out.println(c);
        }

    }




}