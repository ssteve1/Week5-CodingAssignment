public class SpacedLogger implements Logger{
    @Override
    public void log(String message) {

        for(int i = 0; i<message.length();i++){
            System.out.print(message.charAt(i) + " ");
        }

    }

    @Override
    public void error(String message) {
        System.out.print("ERROR: ");
        for(int i = 0; i<message.length();i++){
            System.out.print(message.charAt(i) + " ");
        }

    }
}
