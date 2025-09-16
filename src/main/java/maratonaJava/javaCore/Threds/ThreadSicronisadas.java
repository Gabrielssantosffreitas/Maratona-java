package main.java.maratonaJava.javaCore.Threds;

/*
 ⚠️ ATENÇÃO:
 Esse código não é thread-safe. Pode ocorrer uma condição de corrida (race condition).
 O Java pode pausar uma thread logo após verificar o if (saldo suficiente), antes de efetuar o saque.
 Nesse tempo, outra thread também pode passar no mesmo if e efetuar o saque.
 Resultado: as duas retiram o valor e o saldo pode ficar negativo.
 Para evitar isso, é necessário sincronizar o acesso ao método sacar (ex.: usar 'synchronized').ThreadSicronisadas
 */
public class ThreadSicronisadas  implements  Runnable{
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
        ThreadSicronisadas threadSicronisadas =  new ThreadSicronisadas();
        new Thread(threadSicronisadas,"daniel").start();
        new Thread(threadSicronisadas,"gabriel").start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            this.sacar(10);
        }
    }
    private void sacar(int sacar){
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
