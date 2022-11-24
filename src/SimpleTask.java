public class SimpleTask {

    public String makeComplement(String dna) {

        return dna.replace("A", "Z")
                .replace("T", "A")
                .replace("Z", "T")
                .replace("G", "Z")
                .replace("C", "G")
                .replace("Z", "C");
    }
}