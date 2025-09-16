package main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio;

public class Curso implements main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio.interfaces.Curso {
    private  String mensagem;
    private String faculdade;
    private int quantidadeSemestres;

    private Curso(String mensagem, String faculdade, int quantidadeSemestres) {
        this.mensagem = mensagem;
        this.faculdade = faculdade;
        this.quantidadeSemestres = quantidadeSemestres;
    }
     public static class Builder{
         private  String mensagem;
         private String faculdade;
         private int quantidadeSemestres;

         public Builder setMensagem (String m){
             this.mensagem = m;
             return this;

         };
         public Builder setFaculdade (String f){
             this.faculdade = f;
             return this;

         };
         public Builder setQuantidadeSemestres (int q){
             this.quantidadeSemestres = q;
             return this;

         };
         public Curso build(){
             return new Curso(mensagem,faculdade,quantidadeSemestres);
         }
     }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public int getQuantidadeSemestres() {
        return quantidadeSemestres;
    }

    public void setQuantidadeSemestres(int quantidadeSemestres) {
        this.quantidadeSemestres = quantidadeSemestres;
    }

    @Override
    public String getMensagemCurso() {
        return this.mensagem;
    }
}
