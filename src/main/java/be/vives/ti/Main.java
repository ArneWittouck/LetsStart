package be.vives.ti;


public class Main {
    public static void main(String[] args) {
        StringProcessor s = new StringProcessor();
        System.out.println(s.appendIfMissing("Test and again", " ja?"));
    }
}