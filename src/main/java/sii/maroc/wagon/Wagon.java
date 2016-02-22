package sii.maroc.wagon;

public abstract class Wagon {
    protected String wagonPaint;

    public String paint() {
        return wagonPaint;
    }

    public abstract void fill();

    public abstract boolean isEmpty();

}
