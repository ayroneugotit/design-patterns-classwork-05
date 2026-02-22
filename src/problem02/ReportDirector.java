package problem02;

public class ReportDirector {
    public Report constructReport(IReportBuilder reportBuilder, ReportStyle style) {
        reportBuilder.setHeader("Header");
        reportBuilder.setContent("Content");
        reportBuilder.addSection("Section 1", "Content");
        reportBuilder.addSection("Section 2", "Content");
        reportBuilder.addSection("Section 3", "Content");
        reportBuilder.setFooter("Footer");
        reportBuilder.setStyle(style);
        return reportBuilder.getReport();
    }
}
