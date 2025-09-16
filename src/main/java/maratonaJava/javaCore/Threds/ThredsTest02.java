package main.java.maratonaJava.javaCore.Threds;



public class ThredsTest02 {
    static class ThreadExmplo02 extends Thread{
        private char letra;

        public ThreadExmplo02(char c){
            this.letra = c;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1_001; i++) {
                System.out.print(letra);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("");
            Thread.yield(); // da uma dica para jvm que a trend vai da uma parada porem nao e garantia
        }
    }

    static  class  ThreadTestRun02 implements  Runnable{
            private char letra;
        public ThreadTestRun02(char letra) {
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
        new ThreadExmplo02('a').start(); // tem que usar o start para o java entender que e para criar uma nova thread
        new ThreadExmplo02('b').start();
        new ThreadExmplo02('c').start();

        // posso usar com inplementado o runnable

        new Thread(new ThreadTestRun02('e')).start();
       Thread t1 =  new Thread(new ThreadTestRun02('f'));
       t1.start();
        try {
            t1.join(); // junta espera essa thread acabar antes de comecas as outras ela junta as thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(new ThreadTestRun02('g')).start();
    }

}
