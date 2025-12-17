public class BubbleSort {
            public static void main(String[] args) {

                int[] arr = {2,1,3,4,5,6,7};
                boolean swaped;
                int count = 0;
                for (int i = 0; i < arr.length-1; i++) {
                    swaped = false;
                    for (int j = 0; j<arr.length-i-1; j++){
                        count++;
                        if (arr[j] > arr[j+1]){
                            int current = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = current;
                            swaped = true;
                        }
                    }
                    if (!swaped){
                        break;
                    }
                }
                System.out.println(count);

                System.out.print("Bubble Sorted: ");

                for (int num : arr){
                    System.out.print(num + " ");
                }
            }
}
