import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            if(matrix.get(i).get(j)==0)
            {
                row.add(i);
                col.add(j);
            }
        }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row.contains(i) || col.contains(j))
                {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
}