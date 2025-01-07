Bu projede, Spring Boot uygulamasını Docker kullanarak çalıştırmayı amaçlıyoruz.

projeyi ayağa kaldırmak için;

1. Maven ile jar dosyası oluşturma:
   mvn clean package

2. Docker imajı oluşturma:
   docker build -t demo-app

3. Konteyner oluşturma:
   docker-compoose up --build

4. uygulama "http://lochalhost:8080" üzerinden çalışacak.

5. loglar "logs/" klasörüne yazılacak.


uygulamanın ayağa kalktığını anlayabilmek için,
uygulama başlatıldıktan sonra konsolda veya docker loglarında "tomcat started on port:8080" ifadesi görünecektir.
Bunun haricinde bir endpoint'e http isteğinde bulunarak yanıt alabiliriz.
Portun açık olma durumu kontrol edilebilir.
"docker ps" komutu ile çalışan konteyner listesi görüntülenebilir.