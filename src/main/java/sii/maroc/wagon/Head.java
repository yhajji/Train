package sii.maroc.wagon;

class Head extends Wagon {

    public Head(final String headType) {
        if (headType.equals("HEAD")) {
            this.wagonPaint = "<HHHH";
        } else {
            this.wagonPaint = "HHHH>";
        }

    }

    @Override
    public void fill() {
    }

    @Override
    public boolean isEmptyCargo() {
        return false;
    }

}
