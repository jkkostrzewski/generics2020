package pl.p.lodz.zzpj2020.generics.exercises.two.dictionary;

public class Definition implements Comparable<Definition> {

    private String definition;

    public Definition(String definition) {
        this.definition = definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int compareTo(Definition o) {
        return this.definition.compareTo(o.toString());
    }

    @Override
    public String toString() {
        return definition;
    }
}
