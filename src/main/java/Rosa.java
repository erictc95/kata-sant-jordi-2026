public class Rosa implements Regal{

    private ColorRosa color;

    public Rosa(ColorRosa color) {
        this.color = color;
    }

    public ColorRosa getColor() {
        return color;
    }

    public void setColor(ColorRosa color) {
        this.color = color;
    }

    @Override
    public String getDescripcio() {
        return "Rosa de color: " + getColor();
    }
}
