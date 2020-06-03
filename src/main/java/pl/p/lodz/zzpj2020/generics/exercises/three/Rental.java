package pl.p.lodz.zzpj2020.generics.exercises.three;

import java.util.List;

public class Rental<T> {
    private final List<T> rentalPool;
    private int maxNum;

    public Rental(int maxNum, List<T> rentalPool) {
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }

    public T getRental() {
        if (maxNum > 0) {
            return rentalPool.get(0);
        }
        throw new IndexOutOfBoundsException();
    }

    public void returnRental(T o) {
        rentalPool.add(o);
        maxNum++;
    }
}
