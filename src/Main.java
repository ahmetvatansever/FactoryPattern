public class Main {

    public static void main(String[] args) {
	/*
	   "Factory Pattern" Creational(Varoluşsal) Design Pattern grubunda yer alır.
        Nesne oluşturma işlemi için bir arayüz tasarlanmasını gerektirir ve
        alt sınıfların bu arayüzü kullanarak nesne üretmesine olanak tanır.
        Ayrıca, hangi sınıf nesnesinin oluşacağını
        da alt sınıflar kendileri belirler. Böylece nesne yaratma işlemini soyutlaştırır.

        Tasarlanan Factory sınıfları if/else if/else yapıları ile yönetilir.
        Ayrıca her eklenilen yeni file sınıfı için bu metotta değişikliğe gidilmeli, yeni kod satırları eklenmelidir.
        Koşullara gereğinden fazla bağlı ve sürekli olarak güncellemeye muhtaç metot tasarımı Clean Code açısından uygun değildir.
        Bu problemin çözümü olarak Abstract Factory Design Pattern yapısı kullanılmaktadır
    * */

        String fileExcel = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL)
                .export("Ahmet");
        System.out.println(fileExcel);

        String filePDF = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF)
                .export("Vatansever");
        System.out.println(filePDF);
    }
}
