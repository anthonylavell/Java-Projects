package exercism.hamming.main;

import exercism.hamming.Hamming;

public class HammingMain {
    public static void main(String[] args) {
        String leftStrand = "GAGCCTACTAACGGGAT";
        //String leftStrand = "AG";
        String rightStrand = "CATCGTAATGACGGCCT";
        //String rightStrand = "       ";
        if(rightStrand.isBlank()){
            System.out.println("Hello");
        }
        Hamming hamming = new Hamming(leftStrand,rightStrand);
        System.out.println(hamming.getHammingDistance());
    }
}
