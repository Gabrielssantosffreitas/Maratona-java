package main.java.maratonaJava.introducao;

public class Aula007Array {
    public static void main(String[] args) {
        //arrays sempre no plural

        int[] idades = new int[3];
        idades[0] = 14;
        idades[1] = 21;
        idades[2] = 90;
        System.out.println("" + idades[0] + "\n" + idades[1] + "\n" + idades[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        String[] nomes = {"gabriel", "daniel", "pedro", "jeniffer"};
        float[] salarios = new float[]{14.3F, 12.4F};

        for (String nome : nomes) {
            System.out.println(nome);
        }
        for (float salario : salarios) {
            System.out.println(salario);
        }

        int[][] dias = new int[3][3];

        dias[0][0] = 01;
        dias[0][1] = 02;
        dias[0][2] = 03;

        dias[1][0] = 11;
        dias[1][1] = 12;
        dias[1][2] = 13;

        dias[2][0] = 21;
          dias[2][1] = 22;
        dias[2][2] = 23;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrayBase : dias){
            for (int dia : arrayBase){
                System.out.println(dia);
            }
        }

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,4,5,6,7,8,9,10,11,2,12};

        for(int[] arrayBase : arrayInt){
            System.out.println("\n-----------------------");
            for (int num:arrayBase){
                System.out.println(num);
            }
        }

        int[][] arrayInt2 = {{1,1},{2,2},{3,3}};

        for(int[] arrayBase : arrayInt2){
            System.out.println("\n-----------------------");
            for (int num:arrayBase){
                System.out.println(num);
            }
        }

    }
}
