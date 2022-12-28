package lambda;

public class RunnableClassicVsLambda {

    public static void main(String[] args) {
        Runnable runnableClassic = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from classic runnable.");
            }
        };

        new Thread(runnableClassic).start();

        Runnable runnableLambda = () -> {System.out.println("Hello from lambda runnable");};
        new Thread(runnableLambda).start();

        new Thread(()->System.out.println("Hello from lambda runnable 2")).start();


    }

}
