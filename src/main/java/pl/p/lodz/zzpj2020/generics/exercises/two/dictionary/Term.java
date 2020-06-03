package pl.p.lodz.zzpj2020.generics.exercises.two.dictionary;

public class Term implements Comparable<Term> {

    private String term;

    public Term(String term) {
        this.term = term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public int compareTo(Term o) {
        return this.term.compareTo(o.toString());
    }

    @Override
    public String toString() {
        return term;
    }
}
