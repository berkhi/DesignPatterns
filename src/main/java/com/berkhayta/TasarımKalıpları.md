# DESIGN PATTERN
Design Pattern: Tasarım Kalıpları, Tasarım Desenleri, Tasarım Örüntüleri
Gang Of Four (GOF Patterns) _ 1994
23 tane tasarım kalıbı var.
En çok kullanılan 2-3 tanesini mutlaka bilmek lazım.

# Neden Design Patternler var?
Birbirine benzeyen sorunları çözmek için geliştirilmiş ve işlerliği de kanıtlanmış çözüm önerileridir.
Bu öneriler sayesinde geliştirme süreniz hızlanır.

# Dikkat
Tasarım Desenleri Dile Bağlı değildir!!!
Javada geçerli, C# gibi dillere bağlı değildir.
Algoritma da değildir.
Bu bir kod da değil.

# Soru 1: 
Bir tane robot sınıfımız olsun. Bu robot sınıfı içinde bir tane calis() metodu olsun. 
Bu metod bize hashdeğeri+ " numaralı robot çalıştı."
Evhalki sınıfı oluşturun.
Bunun içinde robotCagir() metodu olsun.
Bu metod çağrıldığında bize robot sınıfındaki calis() metodu çağrılsın.
(evhalkı sınıfı her seferinde aynı robotu çağırmalı)
Runnerda 3 tane evhalkı nesnesi oluşturup bunu deneyelim.

# Thread ile Singleton
Lazy Singleton kullanılarak oluşturulan sınıfta Thread ile erişim sağlanırsa 
farklı nesneler üretilme ihtimali doğuyor.
Bu durumda yapılabilecekler:
1. Thread.start() işleminden sonra join kullanmak.
2. getInstance metodunu synchronized yaparak aynı anda tek bir threadin erişmesini sağlamak.
3. Lazy Singleton yerine Eager Singleton kullanmak
4. Enum kullanmak.


# Soru 2:
Bir akıllı ev içinde ışıklandırma sistemini kontrol edeceğimiz IsikSistemi adlı sınıfı oluşturalım.

IsikSistemi sınıfında ışıkların durumunu ( Açık veya Kapalı ) saklayabilmeli.
Ve bu durumu değiştirmek için metodlar olmalı.
Ayrıca o anki durumu gösteren metod olmalı.


Kullanici sinifimiz olmalı.
Kullanıcı sınıf içinde ışık sistemini kontrol etmesini sağlayacak isiklarinDurumunuDegistir() metodu olmalı.
Bu metod ile ışıklar açıksa kapatsın, kapalıysa açsın.

Runner sınıfınızda kullanıcı nesnesi ile ışıksistemini kontrol ettirin.


# Soru 3 Enum-based Singleton
Bir ev eğlence sistemimiz olsun. 
Burada SesSistemi adlı bir sınıfımız olsun. 
Bu sınıf ses seviyesini kontrol etmek için kullanılacak.
Ses seviyesini ayarlayacak bir metodumuz olmalı. Dışarıdan aldığımız değeri atayalım. 
Ses seviyesi 0-100 arasında olabilir ve başlangıç değeri 50 olmalıdır.
Ayrıca içinde ses seviyesini gösteren bir metodumuz da olmalı.


Kullanici sinifimiz olmalı.
Kullanıcı sınıfı içinde ses seviyesini ayarlayacak bir metod olmalı.
Test sınıfımızda kullanıcı nesneleri ile ses sistemini kontrol edebilmeliyiz.


# SINGLETON KARŞILAŞTIRMA
|       ÖZELLİK       |               LAZY               |            EAGER             |              ENUM              |
|:-------------------:|:--------------------------------:|:----------------------------:|:------------------------------:|
|  Yüklenme Zamanı    |       İlk kullanıldığında        |    Sınıf yüklendiğinde       |      Sınıf yüklendiğinde       |
|     Performans      | Yavaş yüklenir, ama hızlı erişim | Hızlı yüklenir, yavaş erişim | hızlı yüklenir ve hızlı erişim |
|    Thread-Safety    |            Güvensiz              |           Güvenli            |            Güvenli             |
| Reflection Koruması |               Yok                |             Yok              |              Var               |


# FACTORY PATTERN
Fabrika.
Nesne üretimini devralacak yapılar kurgulamak için kullanılır.

# Neden ihtiyacımız var?
Bazen nesneleri üretmek için bağımlılıklardan kaçınmak isteyebiliriz.
Genişletilebilirlik kazandırmak için.

# Asıl Amacı:
Nesnenin nasıl oluştuğunu soyutlarız. Yani gizleriz. Hangi nesne üretildi onu bile bilmeyeceksiniz.

# Factory Pattern Yazım Sırası:
1. Enum yazın.
2. Abstract class veya interface yazılmalı.
3. Alt sınıflarınızı abstract classtan extend etmelisiniz.
4. Factory classınızı yazın. Switch-case gibi bir yapı kurgulayın.
5. Runnerda factory class üzerinden nesne yaratın.

# Avantajları
1. Factory Pattern ile Nesne yaratma süreci alt sınıflara devredilir. Bu sayede sistem genişletilmek istenirse,
mevcut kodu değiştirmeden yalnızca sınıf ekleyerek bu işlemi gerçekleştirebilirsiniz. (OCP)
2. Nesnelerin doğrudan oluşturulmasından kaçındığımız için sınıflar arası bağımlılık azalır. 
Sınıf abstract sınıflara veya interface'lere bağlıdır. Tight coupling sorununu çözer. (DIP)
3. Nesne yaratma mantığını tekrar kurgulamaya gerek kalmaz. Kod tekrarını azaltır.
4. Çalışma zamanında nesne üretimini sağlayabilirsiniz.

# Soru 3
MongoDb ve PostgreSQL database sınıflarımız var.
loglama işlemini bu 2 sınıf ile yapabiliyoruz.
Yani her 2 sınıftada log metodu olacak.

Bu 2 sınıf ILogger interface'inden implemente alabilirler.

Nesne üretimlerini Factory Pattern ile yapacak kodları yazınız.

Runnerda kullanıcıdan hangi türde database kullanmak istediği bilgisini alarak
sadece istediği türde bir nesne üretiniz.


# Soru 4
PizzaFactory
Enum:
Hamur Tipi -> İnce , Orta, Kalın
Boyut -> Küçük, Büyük , Orta
Tür -> Akdeniz, Karışık, TonBalıklı
Pizza Sınıfı olmalı. Bu 3 tipi barındırmalı.

Klasik Pizza ve Vejeteryan Pizza olmak üzere 2 alt sınıfımız olsun. (Pizza)

Vejeteryan-> Akdeniz
Klasik ->Karışık,TonBalıklı

Kullanıcıdan alınan bilgilere göre pizza üreten FactorySınıfını yazınız.

Şimdi yeni bir Pizza alt sınıfımız geldi: TavukluPizza
Yeni 2 tür geldi: Tavuklu, BerbeküTavuklu


##  FACTORY KARŞILAŞTIRMA 
|        Özellik        | 	Simple Factory	                                                         |                                                  Factory Method                                                   |                                        Abstract Factory                                        |
|:---------------------:|--------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------:|
|        Tanım	         | Tek bir sınıfın farklı türlerdeki nesneleri oluşturmasını sağlar.        |              	Alt sınıfların hangi nesnenin örneğinin oluşturulacağını belirlemesine olanak tanır.	               |           Birbirleriyle ilişkili nesne ailelerini oluşturmak için bir arayüz sağlar.           |
| Uygulama Karmaşıklığı | 	Düşük                                                                   |                                                       	Orta                                                       |                                            	Yüksek                                             |
|       Esneklik	       | Düşük. Yeni sınıflar eklendiğinde factory sınıfını değiştirmek gerekir.	 | Yüksek. Yeni sınıflar eklendiğinde mevcut kodu değiştirmeye gerek yoktur, sadece yeni bir factory sınıfı eklenir. |            	Yüksek. Farklı nesne ailelerini oluşturmak için esnek bir yapı sağlar.             |
| Kullanım Senaryoları	 | Basit nesne oluşturma ihtiyaçları için uygun.                            |                  	Nesne oluşturmanın alt sınıflar tarafından yapılması gerektiğinde kullanılır.                   | 	Birbirleriyle ilişkili veya bağımlı nesnelerin gruplarını oluşturmak gerektiğinde kullanılır. |












