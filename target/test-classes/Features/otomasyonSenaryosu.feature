#language:tr

Özellik: Otomasyon senaryosu
  #@hepsi
  Senaryo: yeni uye olma
  Diyelim ki "chrome" tarayicisinda "http://automationpractice.com/" sayfasina giris yaptim
    Ve yeni uyelik icin "Sign in" butonuna tıklarim
    Ve mail adresi kismina tiklayip "thenthen7@gmail.com" girerim
    Ve "Create an account" butonuna tiklarim
    Ve uye cinsiyeti olarak "Erkek" secerim
    Ve "First name" alani için "Celal" girerim
    Ve "Last name" alani için "Bilici" girerim
    Ve "Password" alani için "12345sifrezayıf" girerim
    Ve sayfayı kaydırırım
    Ve dogum tarihinde gun olarak 11 secerim
    Ve dogum tarihinde ay olarak 9 secerim
    Ve dogum tarihinde yıl olarak 1985 secerim
    Ve mail yoluyla ulasılsın seceneği için "Evet" checkboxunu secerim
    Ve sayfayı kaydırırım
    Ve "company" bolumune "Z. Technology" yazarim
    Ve "address1" bolumune "Sloan's Lake Park" yazarim
    Ve "address2" bolumune "W.Lake Shore Dr." yazarim
    Ve sayfayı kaydırırım
    Ve "city" bolumune "Denver" yazarim
    Ve state icinden "Colorado" secilir
    Ve "postcode" bolumune "80227" yazarim
    Ve "phone" bolumune "+1 720-913-2000" yazarim
    Ve "phone_mobile" bolumune "+105512199188" yazarim
    #Ve "alias" bolumune " The Dream of My House" yazarim
    Ve "Register" butonuna tiklarsam
    Ve 2 saniye beklersem
    Ve uyelik bilgisini "Welcome to your account. Here you can manage all of your personal information and orders." ifadesini gorerek dogrularim

  #@hepsi
  Senaryo: urun satin alma ve kontrol islemleri
    Diyelim ki "firefox" tarayicisinda "http://automationpractice.com/index.php?controller=authentication&back=my-account" sayfasina giris yaptim
    Ve "email" bolumune "thenthen7@gmail.com" yazarim
    Ve "passwd" bolumune "12345sifrezayıf" yazarim
    Ve "Sign in" butonuna tiklarsam
    Ve 2 saniye beklersem
    Ve Dresses uzerine gelirsem
    Ve Dresses icinden Summer Dresses menusunu secersem
    Ve 2 saniye beklersem
    Ve sayfayı kaydırırım
    Ve "Printed Chiffon Dress" isimli urunu secersem
    Ve 2 saniye beklersem
    Ve sayfayı kaydırırım
    Ve rengini "Green" secersem
    Ve "Add to cart" butonuna tiklarsam
    Ve sepeti check et butonuna basarsam
    Ve sepetteki urunun "Printed Chiffon Dress" oldudunu gorurum
    Ve urun adedinin "1" renginin ise "Color : Green, Size : S" oldugunu gorurum
    Ve sayfayı kaydırırım
    Ve devam et derim
    Ve sayfayı kaydırırım
    Ve devam et derim
    Ve sayfayı kaydırırım
    Ve terms of service checkboxuna tiklarim
    Ve devam et derim
    Ve odeme yontemi olarak "Pay by bank wire" secerim
    Ve odemeyi tamamlarim
    Ve "Order history and details" ekrani acilip siparis kontrol edilir
    Ve "Printed Chiffon Dress - Color : Green, Size : S" bilgisi ve islem tarihi teyit edilir


    @hepsi
    Senaryo: servis testi
      Ve "http://generator.swagger.io/api/swagger.json" servisi GET metodu ile 200 doner





















