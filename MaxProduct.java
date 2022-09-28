public class MaxProduct {
  // find max product of 3 elements in Array
	public int maxp3(ArrayList<Integer> A) {
        int len = A.size();
        int prod = 1;
        int maxProd = 1;
        for(int i=0;i<len;i++) {
            if(A.get(i)>0) {
             prod = prod * A.get(i);   
            } else
                continue;
            int j = i+1;
            int prodPair = 1;
            while(j<len) {
                prodPair = prodPair*A.get(j)*A.get(j+1);
                if(maxProd<(prod*prodPair)) {
                    maxProd = prod*prodPair;
                }
                j++;
                prodPair = 1;
            }
        }
        return maxProd;
    }
}
