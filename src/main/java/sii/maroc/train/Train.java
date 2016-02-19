package sii.maroc.train;

import java.util.LinkedList;
import java.util.ListIterator;

import sii.maroc.wagon.Wagon;
import sii.maroc.wagon.WagonsFactory;

public class Train {

    private LinkedList<Wagon> wagons;

    public Train(String wagonString) {
        wagons = WagonsFactory.getInstance().buildWagons(wagonString);
    }

    public void detachEnd() {
        wagons.removeLast();
    }

    public void detachHead() {
        wagons.removeFirst();

    }

    public boolean fill() {
        for (ListIterator<Wagon> wagonIterator = wagons.listIterator(); wagonIterator.hasNext();) {
            Wagon wagon = (Wagon) wagonIterator.next();
            if (wagon.isEmpty()) {
                wagon.fill();
                return true;
            }
        }
        return false;
    }

    public String print() {
        StringBuilder paintTrain = new StringBuilder();
        for (ListIterator<Wagon> wagonIterator = wagons.listIterator(); wagonIterator.hasNext();) {
            Wagon wagon = (Wagon) wagonIterator.next();
            paintTrain.append(wagon.paint());
            if (wagonIterator.hasNext())
                paintTrain.append("::");
        }
        return paintTrain.toString();
    }

}
