package sii.maroc.wagon;

class Cargo extends Wagon {
    enum CargoState {
        EMPTY, FULL
    }

    private CargoState cargoState = CargoState.EMPTY;

    public Cargo() {
        this.wagonPaint = "|____|";
    }

    public void fill() {
        this.wagonPaint = "|^^^^|";
        this.cargoState = CargoState.FULL;
    }

    public boolean isEmptyCargo() {
        return (cargoState == CargoState.EMPTY);
    }
}
