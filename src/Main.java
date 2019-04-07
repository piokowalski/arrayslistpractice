import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                new String("hello"),
                new String("academy"),
                new String("java"),
                new String("junior")
        );

       words.stream()
               .collect(Collectors.toSet())
              // .size()
               .forEach(System.out::println);




    }
}
