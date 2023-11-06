package br.com.pyetro;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Anderson","Pyetro","Test").stream();

        Stream<String> set = Set.of("Anderson","Pyetro","Test").stream();

        Map<String,String> map = Map.of("Anderson", "Pyetro");
        Stream<String> keys = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "Test1");
    }
}
