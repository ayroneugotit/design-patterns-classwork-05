package problem02;

public class TextReportBuilder extends AReportBuilder implements IReportBuilder {
    public TextReportBuilder() {
        super();
    }

    public void setHeader(String text) {
        report.setHeader("TEXT REPORT:\n" + text);
    }

    public void setContent(String text) {
        report.setContent(text);
    }

    public void setFooter(String text) {
        report.setFooter(text);
    }

    public void addSection(String title, String text) {
        report.addSection(new ReportSection(title, text));
    }

    public void setStyle(ReportStyle style) {
        report.setStyle(style);
    }

    public Report getReport() {
        return report;
    }
}
