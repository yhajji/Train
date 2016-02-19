package sii.maroc.wagon;

public class WagonFactory {
    private static WagonFactory instance;

    private WagonFactory() {
    }

    public static WagonFactory getInstance() {
        if (instance == null) {
            instance = new WagonFactory();
        }
        return instance;
    }

    public Wagon createWagon(char WagonString) {
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
