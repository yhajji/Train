package sii.maroc.wagon;

public class Cargo extends Wagon {
    private boolean empty = true;

    public Cargo() {
        this.wagonPaint = "|____|";
    }

    public void fill() {
        this.empty = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    @Override
    public String paint() {
        if (!empty)
            wagonPaint = "|^^^^|";
        return wagonPaint;
    }

}
