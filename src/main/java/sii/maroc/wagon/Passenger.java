package sii.maroc.wagon;

class Passenger extends Wagon {

    public Passenger() {
        this.wagonPaint = "|OOOO|";
    }

    @Override
    public void fill() {
    }

    @Override
    public boolean isEmptyCargo() {
        return false;
    }

}
