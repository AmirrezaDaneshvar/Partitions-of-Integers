public class Partition {
    public static int p(int n, int k){
        if(k>n){
            return p(n,n);
        }
        if(k==1){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        return p(n,k-1)+p(n-k,k);
    }
}
