package problem02;

public class ReportStyle {
    private int fontSize;
    private String fontColor;

    private String backgroundColor;

    public ReportStyle(int fontSize, String fontColor, String backgroundColor) {
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.backgroundColor = backgroundColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontColor() {
        return fontColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }
}
