import java.io.*;
import java.util.stream.Collectors;

public class ReadInput {

    String tempB = "";
    String tempA = "";

    public void inputReader() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;

        while ((str = br.readLine()) != null) {
            if (str.contains("a")) {
                tempA = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else if (str.contains("b")) {
                tempB = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else {
                System.out.println("Неверный формат!\n запишите в виде:\nb [число]\na [число]");
                break;
            }

        }
        br.close();

    }

    public int numA() {

        int a = Integer.parseInt(tempA);
        return a;
    }

    public int numB() {

        int b = Integer.parseInt(tempB);
        return b;
    }

}
