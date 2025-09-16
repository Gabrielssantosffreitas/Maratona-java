package maratonaJava.javaCore.Junit.dominio;

public class PessoaJunit {
    private int age;


    public PessoaJunit(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class PessoaJunitBuilder {
        private int age;

        private PessoaJunitBuilder() {
        }

        public static PessoaJunitBuilder aPessoaJunit() {
            return new PessoaJunitBuilder();
        }

        public PessoaJunitBuilder withAge(int age) {
            this.age = age;
            return this;
        }


        public PessoaJunit build() {
            return new PessoaJunit(age);
        }
    }
}
