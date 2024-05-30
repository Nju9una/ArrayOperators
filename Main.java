public class Main {
    public static void main(String[] args) {
        String[] copyFrom = {"Americano","Freddo","Lungo","Doppio","Frappucino","Espresso","Machalto","Afogato","Corretto","Coratto"};
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo){
            System.out.print(coffee + " ");
        }
    }
}