package Arrays.Easy;

public class CountZeroes {

    public static void main(String[] args) {

    }

    int countZeroes(int[] arr, int n) {
        int count = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==1)
                break;
            count++;
        }
        return count;
    }

    }


