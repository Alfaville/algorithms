package algorithms.other_algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Simian {

    private static final String[] SAMPLE_DATA = new String[] {
            "CTGAGA",
            "CTGAAC",
            "TAGAGT",
            "ATAGXG",
            "CXCETA",
            "XCACTG"
    };

    private static final int SEQUENCE_LENGTH = 4;

    private static final List<String> SOLUTIONS = Arrays.asList(
            "A".repeat(SEQUENCE_LENGTH),
            "T".repeat(SEQUENCE_LENGTH),
            "C".repeat(SEQUENCE_LENGTH),
            "G".repeat(SEQUENCE_LENGTH)
    );

    private final String[] dna;

    public static void main(String[] args) {
//        System.out.printf("isSimian = %b\n", new Simian(SAMPLE_DATA).isSimian());

        System.out.println(
            IntStream.range(0, SAMPLE_DATA.length)
                    .mapToObj(i -> SAMPLE_DATA[i].charAt(i))
                    .map(String::valueOf)
                    .reduce((prev, cur) -> prev + cur)
                    .get()
        );

    }

    public Simian(String[] dna) {
        this.dna = dna;
    }

    public boolean isSimian() {
        if (dna.length < SEQUENCE_LENGTH) {
            return false;
        }
        return collectSequences().anyMatch(this::matchesSolution);
    }

    public boolean matchesSolution(String sequence) {
        return SOLUTIONS.stream().anyMatch(sequence::contains);
    }

    public Stream<String> collectSequences() {
        var rowsAndColsStream = Stream.concat(
                collectRows(),
                collectCols()
        );
        var diagonalAndInverseStream = Stream.concat(
                collectDiagonals(),
                collectInverseDiagonals()
        );
        return Stream.concat(
                rowsAndColsStream,
                diagonalAndInverseStream
        );
    }

    public Stream<String> collectRows() {
        return Arrays.stream(dna);
    }

    public Stream<String> collectCols() {
        return IntStream.range(0, dna.length).mapToObj(col ->
                Arrays.stream(dna).reduce("", (acc, row) -> acc + row.charAt(col))
        );
    }

    private Stream<String> collectDiagonals() {
        return IntStream.range(0, dna.length)
                .mapToObj(i -> dna[i].charAt(i))
                .map(String::valueOf)
                .reduce((prev, cur) -> prev + cur)
                .stream();
    }

    private Stream<String> collectInverseDiagonals() {
        return IntStream.range(0, dna.length)
                .mapToObj(i -> dna[i].charAt(dna.length - 1 - i))
                .map(String::valueOf)
                .reduce((prev, cur) -> prev + cur)
                .stream();
    }
}