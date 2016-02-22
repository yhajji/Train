package sii.maroc.train;

import java.util.LinkedList;
import java.util.ListIterator;

import sii.maroc.wagon.Wagon;
import sii.maroc.wagon.WagonsFactory;

public class Train {

    private LinkedList<Wagon> wagons;

    public Train(final String wagonString) {
        WagonsFactory wagonFactory = WagonsFactory.getInstance();
        wagons = wagonFactory.buildWagons(wagonString);
    }

    public void detachEnd() {
        if (wagons.size() >0)
            wagons.removeLast();
    }

    public void detachHead() {
        if (wagons.size() > 0)
            wagons.removeFirst();

    }

    public boolean fill() {
        for (ListIterator<Wagon> wagonIterator = wagons.listIterator(); wagonIterator.hasNext();) {
            final Wagon wagon = (Wagon) wagonIterator.next();
            if (wagon.isEmpty()) {
                wagon.fill();
                return true;
            }
        }
        return false;
    }

    public String print() {
        final StringBuilder paintTrain = new StringBuilder();
        for (ListIterator<Wagon> wagonIterator = wagons.listIterator(); wagonIterator.hasNext();) {
            final Wagon wagon = (Wagon) wagonIterator.next();
            paintTrain.append(wagon.paint());
            if (wagonIterator.hasNext())
                paintTrain.append("::");
        }
        return paintTrain.toString();
    }

}
