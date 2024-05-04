# Factory Design Pattern

"Fabrika Tasarım Kalıbı" Varoluşsal tasarım kalıpları (Creational Design Pattern)  grubunda yer alır. <br>
Nesne oluşturma işlemi için bir arayüz tasarlanmasını gerektirir ve alt sınıfların bu arayüzü kullanarak nesne üretmesine olanak tanır.
Ayrıca, hangi sınıf nesnesinin oluşacağınıda alt sınıflar kendileri belirler. Böylece nesne yaratma işlemini soyutlaştırır.

Tasarlanan Factory sınıfları if/else yapıları ile yönetilir.
Ayrıca her eklenilen yeni file sınıfı için bu metotta değişikliğe gidilmeli, yeni kod satırları eklenmelidir.
Koşullara gereğinden fazla bağlı ve sürekli olarak güncellemeye muhtaç metot tasarımı clean code açısından uygun değildir. <br>
Bu problemin çözümü olarak Abstract Factory Design Pattern yapısı kullanılmaktadır.

