package exercism.hamming;

public class Hamming {
    private int result =0;
    public  Hamming(String leftStrand, String rightStrand)  {
            getError(leftStrand, rightStrand);
            setHammingDistance(leftStrand, rightStrand);

    }

    public int getHammingDistance() {
        return result;
    }
    private void setHammingDistance(String leftStrand, String rightStrand){
        int count = -1;
        while (++count < leftStrand.length()){
            if (leftStrand.charAt(count) != rightStrand.charAt(count)){
                result++;
            }
        }
    }

    private void getError(String leftStrand, String rightStrand){
        isStrandValid(leftStrand,"left");
        isStrandValid(rightStrand,"right");
        isStrandEqualLength(leftStrand.length(), rightStrand.length());
    }

    private void isStrandValid(String strand, String side) {
        if(strand == null || strand.isBlank()){
            throw new RuntimeException(side+" strand must not be empty.");
        }

    }

    private void isStrandEqualLength(int length, int length2) {
        if(length != length2){
            throw new ArithmeticException("leftStrand and rightStrand must be of equal length.");
        }

    }
}
