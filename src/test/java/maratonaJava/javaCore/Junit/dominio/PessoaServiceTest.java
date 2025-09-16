package maratonaJava.javaCore.Junit.dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {
   private PessoaJunit pessoaJunitMaior;
    private PessoaJunit pessoaJunitMenor;
   private PessoaJunit pessoaJunitIgual;
    @BeforeEach
    void setUp() {
         pessoaJunitMaior = new PessoaJunit(19);
         pessoaJunitMenor = new PessoaJunit(17);
         pessoaJunitIgual = new PessoaJunit(18);
    }

    @DisplayName(value = "verifica se e maior que 18 anos ")
    @Test
    void isAldult_CasoPessoaSejaMaiorQue18_MaiorDe18True() {
        PessoaService pessoaService = new PessoaService();
        pessoaService.isAldult(pessoaJunitMaior);
    }
    @DisplayName(value = "verifica se e maior que 18 anos ")
    @Test
    void isAldult_CasoPessoaSejaMenorQue18_igual18True() {
        PessoaService pessoaService = new PessoaService();
        pessoaService.isAldult(pessoaJunitMenor);
    }
    @DisplayName(value = "verifica se e maior que 18 anos ")
    @Test
    void isAldult_CasoPessoaSejaIgual_MenorDe18True() {
        PessoaService pessoaService = new PessoaService();
        pessoaService.isAldult(pessoaJunitIgual);
    }
}