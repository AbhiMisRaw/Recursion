import java.util.ArrayList;
import java.util.List;

public class SubSequenceCount {
        public static void main(String[] args) {
            int[] arr = {1,3,1,1,2};
            int res = findSubsequence(arr , 3);
            System.out.println(res);
        }

        private static int findSubsequence(int[] arr , int target) {
            List<List<Integer>> Flist = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            int count = allSubSequence( 0 , arr, list, Flist, target , 0);
            System.out.println(count);
            return Flist.size() ;
        }

        private static int allSubSequence(int ind, int[] arr, List<Integer> list, List<List<Integer>>  Flist  , int target , int summ) {
            if(ind == arr.length){
                if(summ == target) {
                    List<Integer> nlist = new ArrayList(list);
                    Flist.add(nlist);
                    return 1;
                }
                return 0;
            }
            list.add(arr[ind]);
            int l = allSubSequence(ind+1 , arr , list , Flist , target , summ +arr[ind] );
            list.remove(list.size() -1);
            int r = allSubSequence(ind+1 , arr , list , Flist , target , summ  );
            return l+r ;
        }
    }

