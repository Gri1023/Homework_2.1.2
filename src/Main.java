public class Main {
    public static void main(String[] args) {
        int nums[] = {3,7,4};
        int k = 0;
        while(k<3){
            int l=0;
            while (l<3) {
                if (k != l) {
                    System.out.println(10 * nums[k] + nums[l]);
                    l = l + 1;
                    System.out.println ("l= " + l);
                }
                else {
                    l = l + 1;
                    System.out.println ("l= " + l);
                }
            }
            k=k+1;
            System.out.println ("k=" + k);
        }
    }
}