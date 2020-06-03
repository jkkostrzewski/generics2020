package pl.p.lodz.zzpj2020.generics.exercises.three;

import java.util.List;

public class CarRental extends Rental<Car> {
    public CarRental(int maxNum, List<Car> rentalPool) {
        super(maxNum, rentalPool);
    }

    public Car getRental() {
        return super.getRental();
    }

    public void returnRental(Car o) {
        super.returnRental(o);
    }
}
