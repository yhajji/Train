package sii.maroc.wagon;

class Head extends Wagon {

    enum HeadType {
        HEAD, END
    }

    private HeadType headType;

    public Head(String headType) {
        if (headType.equals("HEAD"))
            this.headType = HeadType.HEAD;
        else
            this.headType = HeadType.END;
    }

    @Override
    public String paint() {
        if (headType == HeadType.HEAD)
            return "<HHHH";
        else
            return "HHHH>";
    }

}
