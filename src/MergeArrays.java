import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args){
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        }



    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m+n;
        //nums1[m] = 5;
        //System.out.println(nums1[m]);
        //System.out.println(n);
        for(int i = 0; i< n; i++){
            nums1[m] = nums2[i];
            m+=1;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}

