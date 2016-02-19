package sii.maroc.train;

import java.util.LinkedList;
import java.util.ListIterator;

import sii.maroc.wagon.Wagon;

public class Train {

    private LinkedList<Wagon> wagons;

    public Train(String wagonString) {
        wagons = WagonBuilder.getInstance().buildWagon(wagonString);
    }

    public void detachEnd() {
        wagons.removeLast();
    }

    public void detachHead() {
        wagons.removeFirst();

    }

    public boolean fill() {
        CargoFiller cargoFiller = CargoFiller.getInstance();
        return cargoFiller.fillCargo(wagons);
    }

    public String print() {
        StringBuilder paintTrain = new StringBuilder();
        paintWagons(paintTrain);
        return paintTrain.toString();
    }

    private void paintWagons(StringBuilder paintTrain) {
        final ListIterator<Wagon> wagonIterator = wagons.listIterator();
        while (wagonIterator.hasNext()) {
            paintTrain.append(wagonIterator.next().paint());
            if (wagonIterator.hasNext())
                paintTrain.append("::");
        }
    }

}
