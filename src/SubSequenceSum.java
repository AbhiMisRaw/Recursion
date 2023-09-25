import java.util.ArrayList;
import java.util.List;

public class SubSequenceSum {
    public static void main(String[] args) {
        int[] arr = {1,3,1,1,2};
        int res = findSubsequence(arr , 3);
        System.out.println(res);
    }

    private static int findSubsequence(int[] arr , int target) {
        List<List<Integer>> Flist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        allSubSequence( 0 , arr, list, Flist, target , 0);
        System.out.println(Flist);
        return Flist.size() ;
    }

    private static void allSubSequence(int ind, int[] arr, List<Integer> list, List<List<Integer>>  Flist  , int target , int summ) {
        if(ind == arr.length){
            if(summ == target) {
                List<Integer> nlist = new ArrayList(list);
                Flist.add(nlist);
            }
            return ;
        }
        list.add(arr[ind]);
        allSubSequence(ind+1 , arr , list , Flist , target , summ +arr[ind] );
        list.remove(list.size() -1);
        allSubSequence(ind+1 , arr , list , Flist , target , summ  );
    }
}
