import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        String inputLine = readConsole.nextLine();
        System.out.println(LineService.lineRotationOutput(inputLine));
        LineService.lineRotationRepeat(inputLine, 1_000);
        LineService.lineRotationRepeat(inputLine, 10_000);
        LineService.lineRotationRepeat(inputLine, 100_000);
        readConsole.close();
    }
}
