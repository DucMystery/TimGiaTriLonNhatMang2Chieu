import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myArr[][]= {{1,2,3,4,5},{5,6,7,8,9}};
        System.out.println("Giá trị lớn nhất của mảng là :"+checkMax(myArr));

    }

    public static int checkMax(int arr[][]){
        int max = arr[0][0];
        for (int i=0;i<2;i++){
            for (int j=0;j<5;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
