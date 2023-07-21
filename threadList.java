import java.lang.Thread;

class ascending extends Thread {
    int arr[], temp;

    ascending(int[] arr1) {
        this.arr = arr1;
    }

    void ascend(int[] arr1) {
        synchronized (this) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Ascend Element:- " + arr1[i]);
            }
            System.out.println();
        }
    }

    public void run() {
        ascend(arr);
    }

}

class descending extends Thread {
    int arr[], temp;

    descending(int[] arr2) {
        this.arr = arr2;
    }

    void descend(int[] arr2) {
        synchronized (this) {
            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] < arr2[j]) {
                        temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("Descend Element:- " + arr2[i]);
            }
        }
    }

    public void run() {
        descend(arr);
    }
}

public class threadList {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 4, 7, 1 };

        ascending a = new ascending(arr);
        descending d = new descending(arr);
        a.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        d.start();
    }
}