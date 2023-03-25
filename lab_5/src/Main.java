import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int y = 0; y < sortArr.length - i - 1; y++) {
                if (sortArr[y] > sortArr[y + 1]) {
                    int temp = sortArr[y];
                    sortArr[y] = sortArr[y + 1];
                    sortArr[y + 1] = temp;
                    System.out.println(Arrays.toString(sortArr));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер члена: ");
        int size = in.nextInt();
        int[] sortArr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++){
            System.out.print("Введите "+(i+1)+" элемент: ");
            sortArr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(sortArr));
        bubbleSort(sortArr);
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(sortArr));
    }
}