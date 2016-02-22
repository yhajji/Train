package sii.maroc.wagon;

class Restaurant extends Wagon {

    public Restaurant() {
        this.wagonPaint = "|hThT|";
    }

    @Override
    public void fill() {
    }

    @Override
    public boolean isEmptyCargo() {
        return false;
    }

}
