package sii.maroc.train;

import java.util.LinkedList;

import sii.maroc.wagon.Wagon;
import sii.maroc.wagon.WagonFactory;

public class WagonBuilder {
    private static WagonBuilder instance;

    private WagonBuilder() {
    }

    public static WagonBuilder getInstance() {
        if (instance == null) {
            instance = new WagonBuilder();
        }
        return instance;
    }

    public LinkedList<Wagon> buildWagon(String wagonString) {
        String wagonStr = wagonString.replaceAll("[H]$", "E");
        LinkedList<Wagon> wagons = new LinkedList<>();
        WagonFactory wagonFactory = WagonFactory.getInstance();
        for (int i = 0, n = wagonStr.length(); i < n; i++) {
            char c = wagonStr.charAt(i);
            wagons.add(wagonFactory.createWagon(c));
        }
        return wagons;
    }

}
