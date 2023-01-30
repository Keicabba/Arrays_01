package it.figuccia;

public class Start {
    public static void main(String[] args) {
        String[] carBrands = new String[]{"Toyota", "Mitsubishi", "Citroen", "Fiat", "Peugeot"};
        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        Integer[] primeNumbers = new Integer[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        for (int cont=0 ; cont < primeNumbers.length; cont++){
            System.out.println(primeNumbers[cont]);
        }
    }
}