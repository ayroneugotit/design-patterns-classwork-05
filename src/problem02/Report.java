package problem02;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private String header;
    private String content;
    private String footer;
    private List<ReportSection> sections;
    private ReportStyle style;

    public Report() {
        header = null;
        content = null;
        footer = null;
        sections = new ArrayList<>();
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void addSection(ReportSection section) {
        sections.add(section);
    }

    public void setStyle(ReportStyle style) {
        this.style = style;
    }

    public void export() {
        System.out.println("------------------------------------");
        System.out.println("EXPORTING REPORT...");
        System.out.println("------------------------------------");
        System.out.println("FONT SIZE: " + style.getFontSize());
        System.out.println("FONT COLOR: " + style.getFontColor());
        System.out.println("BACKGROUND COLOR: " + style.getBackgroundColor());
        System.out.println("------------------------------------");
        System.out.println(header);
        System.out.println(content);
        for (ReportSection reportSection : sections) {
            System.out.println(reportSection.getTitle());
            System.out.println(reportSection.getText());
        }
        System.out.println(footer);
        System.out.println("------------------------------------");
        System.out.println("REPORT EXPORTED SUCCESSFULLY!");
        System.out.println("------------------------------------");
    }
}
