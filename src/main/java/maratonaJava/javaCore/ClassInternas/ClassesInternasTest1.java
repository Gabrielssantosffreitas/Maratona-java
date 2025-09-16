package main.java.maratonaJava.javaCore.ClassInternas;



public class ClassesInternasTest1 {
    private  String nome ="ola nome classesInternars";
    class Inner {
        private  String nome ="ola nome da class inner";

        public void nome () {
            System.out.println("Ola mundo class Inner");
            System.out.println(nome);
            System.out.println(this);
            System.out.println(this.nome);
        }


    }

    public static void main(String[] args) {
        ClassesInternasTest1  classesInternasTest1  =  new ClassesInternasTest1();
        Inner inner  =  classesInternasTest1.new Inner();
        inner.nome();

    }
}
