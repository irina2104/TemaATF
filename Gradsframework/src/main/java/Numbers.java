public class Numbers {

    public boolean isSmallerThanOneHundred(int numberToCompare) {
        if (numberToCompare > 100) {
            return false;
        } else {
            return true;
        }
    }

    public String checkSum(int a, int b, int result) {
        if ((a + b) == result) {
            return "SUCCESS!";
        } else {
            return "FAIL!";
        }
    }

    public Integer factorial(Integer n){
        Integer f=1;
        if (n==0 || n==1) f=1;
        for(Integer i=2;i<=n;i++){
            f*=i;}
        return f;
    }
}
