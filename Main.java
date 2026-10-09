import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {

            List<Experience> experiences = new ArrayList<>();

            experiences.add(
                    new Experience(
                            "Turkcell",
                            "Stajyer Yazilimci",
                            "2021-2022"));

            experiences.add(
                    new Experience(
                            "ASELSAN",
                            "Java Developer",
                            "2024-2025"));

            experiences.add(
                    new Experience(
                            "Microsoft",
                            "Backend Developer",
                            "2025-2026"));

            Resume resume =
                    new Resume(
                            "Meryem Koseoglu",
                            "meryemkoseoglu207@gmail.com",
                            "05370626718",
                            "Yazilim Muhendisligi",
                            experiences);

            PdfGenerator generator =
                    new PdfGenerator();

            generator.generateResume(resume);

            System.out.println("PDF basariyla olusturuldu.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}