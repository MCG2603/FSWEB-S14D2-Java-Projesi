public class Bed {


    private int pillows;
    private String style;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(int pillows, String style, int height, int sheets, int quilt) {
        this.pillows = pillows;
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make () {
        System.out.println("The bed is being made.");
    }
    public int getPillows() {
        return pillows;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

}
