package sii.maroc.wagon;

class Head extends Wagon {
    enum HeadType {
	HEAD, END
    }

    private HeadType headType;

    public Head(String headType) {
	if (headType.equals("HEAD")) {
	    this.wagonPaint = "<HHHH";
	    this.headType = HeadType.HEAD;
	} else {
	    this.wagonPaint = "HHHH>";
	    this.headType = HeadType.END;
	}
    }

    @Override
    public void fill() {
    }

    @Override
    public boolean isEmpty() {
	return false;
    }

}
