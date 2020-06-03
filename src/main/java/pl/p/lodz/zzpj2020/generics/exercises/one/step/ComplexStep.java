package pl.p.lodz.zzpj2020.generics.exercises.one.step;

public class ComplexStep extends Step {
    public ComplexStep(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "ComplexStep{" +
                "description='" + super.getDescription() + '\'' +
                '}';
    }
}
