import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                new String("hello"),
                new String("academy"),
                new String("java"),
                new String("junior")
        );
       words.stream()
               .map (m -> m.split(""))
               .flatMap(Arrays::stream)
               .distinct()
               .collect(Collectors.toList())
               .forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        long l = words.stream()
                .map(m -> m.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count();

        System.out.println("Zmarnowaliśmy " +l+ " literek.");



    }
}
