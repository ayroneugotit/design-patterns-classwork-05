package problem02;

public class Main {
    public static void main(String[] args) {
        TextReportBuilder textReportBuilder = new TextReportBuilder();
        HTMLReportBuilder htmlReportBuilder = new HTMLReportBuilder();
        PDFReportBuilder pdfReportBuilder = new PDFReportBuilder();

        ReportStyle reportStyle1 = new ReportStyle(14, "Black", "White");
        ReportStyle reportStyle2 = new ReportStyle(10, "Blue", "White");
        ReportStyle reportStyle3 = new ReportStyle(14, "Green", "Black");

        ReportDirector reportDirector = new ReportDirector();

        reportDirector.constructReport(textReportBuilder, reportStyle1).export();
        reportDirector.constructReport(htmlReportBuilder, reportStyle2).export();
        reportDirector.constructReport(pdfReportBuilder, reportStyle3).export();
    }
}
