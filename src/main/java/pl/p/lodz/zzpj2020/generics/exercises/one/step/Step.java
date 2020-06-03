package pl.p.lodz.zzpj2020.generics.exercises.one.step;

public class Step {
    private String description;

    public Step(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Step{" +
                "description='" + description + '\'' +
                '}';
    }
}
