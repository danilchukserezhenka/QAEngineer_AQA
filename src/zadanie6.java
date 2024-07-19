public class zadanie6 {
    public static void main(String[] args) {
        zadanie6 stringConstructor = new zadanie6();
        stringConstructor.constructHelloSentence("Den");
    }
    public String constructHelloSentence(String name) {
        String resultSentence = "Hello world! My name is " + name;
        System.out.println(resultSentence);
        return resultSentence;
    }
}
