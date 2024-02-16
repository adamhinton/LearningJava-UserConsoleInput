//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole (int currentYear){

        String name = System.console().readLine("Hi, what's your name? ");

        System.out.println("Hi, " + name + " thanks for taking the course");

        return "";
    }

    public static String getInputFromScanner (int currentYear){
        return "";
    }
}