package pl.p.lodz.zzpj2020.generics.exercises.one;

import pl.p.lodz.zzpj2020.generics.exercises.one.step.ComplexStep;
import pl.p.lodz.zzpj2020.generics.exercises.one.step.SimpleStep;
import pl.p.lodz.zzpj2020.generics.exercises.one.step.Step;
import pl.p.lodz.zzpj2020.generics.exercises.one.list.unidirectional.UnidirectionalList;

public class ExerciseOne {
    public static void main (String[] args) {
        UnidirectionalList<Step> stepList = new UnidirectionalList<>();
        UnidirectionalList<ComplexStep> complexStepList = new UnidirectionalList<>();
        UnidirectionalList<SimpleStep> simpleStepList = new UnidirectionalList<>();

        stepList.add(new Step("Apollo 11"));
        stepList.add(new Step("Apollo 12"));
        stepList.add(new Step("Apollo 13"));
        stepList.add(new Step("Apollo 14"));

        System.out.println("stepList size: " + stepList.size());

        complexStepList.add(new ComplexStep("Gravity Earth"));
        complexStepList.add(new ComplexStep("Gravity Moon"));
        complexStepList.add(new ComplexStep("Gravity Mars"));

        System.out.println("complexStepList size: " + complexStepList.size());

        simpleStepList.add(new SimpleStep("SpaceX"));
        simpleStepList.add(new SimpleStep("Nasa"));

        System.out.println("simpleStepList size: " + simpleStepList.size());

        System.out.println("\nstepList elements: ");
        stepList.displayList();

        System.out.println("\ncomplexStepList elements: ");
        complexStepList.displayList();

        System.out.println("\nsimpleStepList elements: ");
        simpleStepList.displayList();

        UnidirectionalList<Step> secondStepList = new UnidirectionalList<>();
        secondStepList.add(new Step("Apollo 15"));
        stepList.mergeList(secondStepList);
        System.out.println("\nMerged list:");
        stepList.displayList();

        stepList.removeAll();
        System.out.println("\nRemoved all elements from stepList");
        System.out.println("Is stepList empty: " + stepList.isEmpty());
    }
}
