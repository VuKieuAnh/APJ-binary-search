public class DemoSrearch {

    public int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        while (high>=low){
            int mid = (low +high)/2;
            if (key <list[mid]){
                high = mid - 1;
            }
            else if (key == list[mid])
                return mid;
            else low = mid + 1;
        }

        return -1;
    }

    public int binarySearchRec(int list[], int key, int high, int low){
        if (high>= low){
            int mid = low + (high - low)/2;
            if (list[mid] == key){
                return mid;
            }
            if (list[mid] > key)
               return binarySearchRec(list, key, mid -1, low);
            return binarySearchRec(list, key, high, mid +1);
        }

        return -1;
    }
}
