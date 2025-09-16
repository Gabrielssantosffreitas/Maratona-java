package main.java.maratonaJava.javaCore.Threds;

/*

 */
public class ThreadSicronisadas02 implements  Runnable{
   static class Banco {
        private long valor;


        public Banco(long valor){
            this.valor = valor;
        }

       public long getValor() {
           return valor;
       }

       public void sacar (int saque){
            valor = valor - saque;
            System.out.println("saque de "+ saque +" efetuado" );
        }
    }

    private Banco banco = new Banco(1000L);

    public static void main(String[] args) {
        ThreadSicronisadas02 threadSicronisadas =  new ThreadSicronisadas02();
        new Thread(threadSicronisadas,"daniel").start();
        new Thread(threadSicronisadas,"gabriel").start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

        }
    }
    private synchronized void sacar(int sacar){ // add synchronized para que quando uma tread acessar ela vai terque fazer ate o final

        if (this.banco.getValor() < sacar){
            System.out.println(Thread.currentThread().getName() + "nao pode sacar");
        }else {
            System.out.println(Thread.currentThread().getName() + "sacou");
            this.banco.sacar(sacar);
            System.out.println("-----");
            System.out.println(this.banco.getValor());
        }
    }
}
