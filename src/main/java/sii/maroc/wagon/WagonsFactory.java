package sii.maroc.wagon;

import java.util.LinkedList;

public class WagonsFactory {
    private static WagonsFactory instance;

    private WagonsFactory() {
    }

    public static WagonsFactory getInstance() {
        if (instance == null) {
            instance = new WagonsFactory();
        }
        return instance;
    }

    public LinkedList<Wagon> buildWagons(String wagonLettres) {
        wagonLettres = wagonLettres.replaceAll("H$", "E");
        final LinkedList<Wagon> wagons = new LinkedList<>();
        for (int i = 0, n = wagonLettres.length(); i < n; i++) {
            final char c = wagonLettres.charAt(i);
            wagons.add(createWagon(c));
        }
        return wagons;
    }

    private Wagon createWagon(final char WagonString) {
        final Wagon wagon;
        switch (WagonString) {
        case 'H':
            wagon = new Head("HEAD");
            break;
        case 'E':
            wagon = new Head("END");
            break;
        case 'P':
            wagon = new Passenger();
            break;
        case 'R':
            wagon = new Restaurant();
            break;
        case 'C':
            wagon = new Cargo();
            break;
        default:
            throw new IllegalArgumentException();
        }
        return wagon;
    }

}
