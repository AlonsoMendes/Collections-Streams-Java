package optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que estão presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não estão presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não estão¡ presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não estão presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não  estão presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty =não estão presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não estão presente"));

    }
}
