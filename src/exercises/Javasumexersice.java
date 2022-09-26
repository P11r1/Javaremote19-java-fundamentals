package exercises;

public class Javasumexersice {
    public static void main(String[] args) {

        int b = 4;
        int[] array = {1, 2, 7, 3, 10, 2, 9};
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++)
                if(array[i] + array[j] == b) {
                    System.out.println(array[i] + array[j] + b);
                }
            }

        }



    }

