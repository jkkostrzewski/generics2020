package pl.p.lodz.zzpj2020.generics.exercises.one.step;

public class SimpleStep extends Step {
    public SimpleStep(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "SimpleStep{" +
                "description='" + super.getDescription() + '\'' +
                '}';
    }
}
