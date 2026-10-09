import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;

public class PdfGenerator {

    public void generateResume(Resume resume) throws IOException {

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();

        document.addPage(page);

        PDImageXObject image =
                PDImageXObject.createFromFile(
                        "C:\\Users\\MERYEM\\Desktop\\OzgecmisPDF\\profile.jpg",
                        document);

        PDPageContentStream content =
                new PDPageContentStream(document, page);

        content.drawImage(image, 400, 620, 120, 120);

        content.beginText();

        content.setFont(PDType1Font.HELVETICA_BOLD, 22);
        content.newLineAtOffset(50, 750);
        content.showText("MERYEM KOSEOGLU");

        content.setFont(PDType1Font.HELVETICA, 14);
        content.newLineAtOffset(0, -25);
        content.showText("Yazilim Muhendisligi Ogrencisi");

        content.setFont(PDType1Font.HELVETICA, 12);

        content.newLineAtOffset(0, -60);
        content.showText("Email: " + resume.getEmail());

        content.newLineAtOffset(0, -20);
        content.showText("Telefon: " + resume.getPhone());

        content.newLineAtOffset(0, -20);
        content.showText("Egitim: " + resume.getEducation());

        content.newLineAtOffset(0, -40);
        content.showText("HAKKIMDA");

        content.newLineAtOffset(0, -20);
        content.showText("Yazilim Muhendisligi ogrencisiyim.");

        content.newLineAtOffset(0, -20);
        content.showText("Java, SQL ve OOP alanlarinda");

        content.newLineAtOffset(0, -20);
        content.showText("kendimi gelistirmekteyim.");

        content.newLineAtOffset(0, -40);
        content.showText("IS DENEYIMLERI");

        for (Experience exp : resume.getExperiences()) {

            content.newLineAtOffset(0, -20);

            content.showText(
                    exp.getCompany()
                            + " - "
                            + exp.getPosition()
                            + " - "
                            + exp.getYear());
        }

        content.newLineAtOffset(0, -40);
        content.showText("TEKNIK YETENEKLER");

        content.newLineAtOffset(0, -20);
        content.showText("- Java");

        content.newLineAtOffset(0, -20);
        content.showText("- SQL");

        content.newLineAtOffset(0, -20);
        content.showText("- HTML");

        content.newLineAtOffset(0, -20);
        content.showText("- CSS");

        content.newLineAtOffset(0, -20);
        content.showText("- Git ve GitHub");

        content.endText();
        content.close();

        document.save("Ozgecmis.pdf");
        document.close();
    }
}