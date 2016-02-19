package sii.maroc.train;

import java.util.LinkedList;
import java.util.ListIterator;

import sii.maroc.wagon.Cargo;
import sii.maroc.wagon.Wagon;

public class CargoFiller {
    private static CargoFiller instance;

    private CargoFiller() {
    }

    public static CargoFiller getInstance() {
        if (instance == null) {
            instance = new CargoFiller();
        }
        return instance;
    }

    public boolean fillCargo(LinkedList<Wagon> wagons) {
        if (remainingCargo(wagons) == 0)
            return false;
        else {
            final ListIterator<Wagon> wagonIterator = wagons.listIterator();
            while (wagonIterator.hasNext()) {
                Wagon wagon = wagonIterator.next();
                if (checkIfEmptyCargo(wagon)) {
                    Cargo cargo = (Cargo) wagon;
                    if (cargo.isEmpty()) {
                        cargo.fill();
                        break;
                    }
                }
            }
            return true;
        }
    }

    private int remainingCargo(LinkedList<Wagon> wagons) {
        int remainingCargo = 0;
        final ListIterator<Wagon> wagonIterator = wagons.listIterator();
        while (wagonIterator.hasNext()) {
            Wagon wagon = wagonIterator.next();
            if (checkIfEmptyCargo(wagon)) {
                Cargo cargo = (Cargo) wagon;
                if (cargo.isEmpty())
                    remainingCargo++;
            }
        }
        return remainingCargo;
    }

    private boolean checkIfEmptyCargo(Wagon wagon) {
        if (wagon instanceof Cargo) {
            Cargo cargo = (Cargo) wagon;
            if (cargo.isEmpty())
                return true;
        }
        return false;
    }

}
