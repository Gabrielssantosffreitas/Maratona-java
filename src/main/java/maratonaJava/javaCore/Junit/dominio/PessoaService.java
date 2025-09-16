package maratonaJava.javaCore.Junit.dominio;

public class PessoaService {
    public boolean isAldult(PessoaJunit pessoaJunit){
        return pessoaJunit.getAge() >= 18;
    }
}
