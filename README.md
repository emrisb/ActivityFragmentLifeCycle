# ActivityFragmentLifeCycle

# Amaç

1. Git - GitHub becelerinin arttırılmasını sağlamak.
2. Fragment kullanımı öğrenmek.
3. Activity üzerine Fragment'ı ekleme yollarını araştırmak.
4. Activity Fragment Yaşam Döngüsünde (LifeCycle) eklenme sırasında neler değiştiğini kavramak.
5. Activity Fragment kullanım mantığının yerleşmesini sağlamak.

# Cevaplar

12. Dinamik olarak(prorammatically) Java koduyla eklemek bize esneklik sağlar. Yani istediğimizde değiştirme, ekleme ya da kaldırma işlemleri yapabiliriz runtime esnasında. XML içerisinde eklediğimizde Fragment'e müdahale şansımız olmaz.

13. Fragment: Kullanıcı arayüzünü farklı bölümlere ayırmak için, Daha düzenli ve kolay okunabilir kod için, Belli bir kullanıcı arayüzü parçası fragment olarak yapılırsa, daha sonra aynı veya farklı bir aktivitede tekrar kullanılabilir. Tablet ekranlarında ekranı verimli kullanmak için. Kullanıcı arayüzü çok değişmiyorsa Fragment kullanılabilir.  
Activity: Activity olmadan Fragment olmaz dolayısıyla her durumda kullanılabilir. Eğer uygulamada bir görevi değiştirirsek ve yeni görev bir öncekinden bağımsız ise activity kullanırız. Farklı görevler içeren ekranlar için activity kullanılır.

14. Eğer ki kullanacağımız Fragment işlem sonunda kaldırılacak ya da yer değiştirilecekse dinamik olarak(prorammatically), eğer sabit kalacak ve sürekli kullanılacaksa static olarak (XML) eklenir.

15. Inflate işlemi biraz daha hızlı olabilirdi fakat hemen hemen performansları eşittir. Şu an bizim yaptığımız çalışmalarda gözle görülür bir performans farkı yok, ancak bu büyük projelerde farklılık gösterebilir.v
