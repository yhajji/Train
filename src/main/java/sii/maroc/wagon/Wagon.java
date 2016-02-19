package sii.maroc.wagon;

public abstract class Wagon {
    protected String wagonPaint;

    public String paint() {
        return wagonPaint;
    }

    abstract void fill();

}
