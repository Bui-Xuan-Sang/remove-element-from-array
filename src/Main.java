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
            if (size > 100){
                System.out.println("Không được vượt quá 100.");
            }
        }while (size > 100);
        arr = new int[size];
        int i = 0;
        System.out.println("Nhập các phần tử cho mảng: ");
        while (i < arr.length){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Nhập phần tử muốn xóa: ");
        int remove = scanner.nextInt();
        // xóa phần tử remove ra khỏi mảng
        // vòng lặp for sẽ khởi tạo j = i = 0
        // và duyệt i từ 0 đến arr.length
        // sau đó tăng j lên 1
        for (j = i = 0; i < arr.length; i++){
            if (arr[i] != remove){ // nếu phần tử tại vị trí i khác với số nguyên remove
                arr[j] = arr[i]; // thì gán phần tử tại i cho phần tử tại remove
                j++; // sau đó tăng j lên 1
                // j = arr.length: lúc này số phần tử trong mảng sẽ bằng j
            }
        }
        System.out.println("Mảng còn lại sau khi xóa phần tử " + remove + " là: ");
        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
