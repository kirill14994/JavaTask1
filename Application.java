public class Application {
    public static void main(String[] args) throws Exception{
        ReadInput readF = new ReadInput();
        readF.inputReader();
        PowAndWrite ts = new PowAndWrite();

        ts.computing(readF.numA(),readF.numB());
    }
}
