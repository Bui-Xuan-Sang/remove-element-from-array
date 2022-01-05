import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int j;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
            if (size > 100) {
                System.out.println("Không được vượt quá 100.");
            }
        } while (size > 100);
        arr = new int[size];
        int i = 0;
        System.out.println("Nhập các phần tử cho mảng: ");
        while (i < arr.length) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int index;
        System.out.println("Nhập vị trí bạn muốn xóa:");
        index = scanner.nextInt();
        size--;
        int[] newArray = remove(arr, index, size);
        for ( i = 0; i < size; i++) {
            System.out.println(newArray[i]);
        }
    }
    public static int[] remove(int[] arr,int index,int size){
        int[] newArray = new int[size];
        for(int i = 0;i<index;i++){
            newArray[i] = arr[i];
        }
        for(int i = index;i<arr.length-2;i++){
            newArray[i] = arr[i+1];
        }
        return newArray;
    }
}
