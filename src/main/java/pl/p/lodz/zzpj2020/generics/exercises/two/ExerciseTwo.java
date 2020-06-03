package pl.p.lodz.zzpj2020.generics.exercises.two;

import pl.p.lodz.zzpj2020.generics.exercises.two.dictionary.Definition;
import pl.p.lodz.zzpj2020.generics.exercises.two.dictionary.Dictionary;
import pl.p.lodz.zzpj2020.generics.exercises.two.dictionary.MusicalTerm;
import pl.p.lodz.zzpj2020.generics.exercises.two.dictionary.ScientificTerm;
import pl.p.lodz.zzpj2020.generics.exercises.two.dictionary.Term;

public class ExerciseTwo {
    public static void main(String[] args) {
        Dictionary<Term, Definition> musicalDictionary = new Dictionary<>();

        MusicalTerm quarterNote = new MusicalTerm("Quarter note");
        musicalDictionary.add(quarterNote, new Definition("A quarter note (American) or crotchet " +
                                                                  "(British) is a note played for" +
                                                                  " one quarter of the duration " +
                                                                  "of a whole note (or semibreve)" +
                                                                  "."));
        MusicalTerm tempo = new MusicalTerm("Tempo");
        musicalDictionary.add(tempo, new Definition("In musical terminology, tempo (Italian " +
                                                            "for \"time\") is the speed or pace of " +
                                                            "a given piece."));

        System.out.println("Musical dictionary size: " + musicalDictionary.size());
        System.out.println("Musical dictionary elements: ");
        musicalDictionary.displayDictionary();

        Dictionary<Term, Definition> scientificDictionary = new Dictionary<>();
        ScientificTerm amplification = new ScientificTerm("Amplification");
        scientificDictionary.add(amplification, new Definition("A technique, usually using enzymes, for multiplying " +
                                                                       "nucleic acids in order to increase the " +
                                                                       "sensitivity of detection methods."));
        ScientificTerm antibiotic = new ScientificTerm("Antibiotic");
        scientificDictionary.add(antibiotic, new Definition(" a molecule produced by the immune system to detect and " +
                                                                    "neutralize pathogens, in particular viruses."));
        System.out.println("\nScientific dictionary size: " + scientificDictionary.size());
        System.out.println("Scientific dictionary elements");
        scientificDictionary.displayDictionary();

        Dictionary<Term, Definition> mergedDictionary = new Dictionary<>();
        mergedDictionary.mergeDictionary(musicalDictionary);
        mergedDictionary.mergeDictionary(scientificDictionary);
        System.out.println("\nMerged dictionary size: " + mergedDictionary.size());
        System.out.println("Merged dictionary elements");
        mergedDictionary.displayDictionary();


    }
}
