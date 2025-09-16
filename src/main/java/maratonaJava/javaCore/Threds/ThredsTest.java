package main.java.maratonaJava.javaCore.Threds;



public class ThredsTest {
    static class ThreadExmplo extends Thread{
        private char letra;

        public ThreadExmplo(char c){
            this.letra = c;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1_001; i++) {
                System.out.print(letra);
            }
            System.out.println("");
        }
    }

    static  class  ThreadTestRun implements  Runnable{
            private char letra;
        public ThreadTestRun(char letra) {
            this.letra = letra;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1_001; i++) {
                System.out.print(letra);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        /*
        e muito importante lembrar que o propia jvm vai executar na ordem que ela quer
         */
        new ThreadExmplo('a').start(); // tem que usar o start para o java entender que e para criar uma nova thread
        new ThreadExmplo('b').start();
        new ThreadExmplo('c').start();

        // posso usar com inplementado o runnable

        new Thread(new ThreadTestRun('e')).start();
        new Thread(new ThreadTestRun('f')).start();
        new Thread(new ThreadTestRun('g')).start();
    }

}
