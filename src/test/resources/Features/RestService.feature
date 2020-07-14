#language:tr

Özellik: Trendyol Otomasyon Muhendisi Calismasi_Bolum 2


  Senaryo: Empty first request
    Diyelim ki http://0d75z.mocklab.io/api/books servisi GET metodu ve null body degeri ile calistirilirsa donus degerinin 200 geldigi gorulur

  Senaryo: Create new data with put method
   Diyelim ki http://0d75z.mocklab.io/api/books servisi PUT metodu ve {"id":1, "Author":"JSX", "title":"deneme1"} body degeri ile calistirilirsa donus degerinin 201 geldigi gorulur

  Senaryo: After create put method, read new data
    Diyelim ki http://0d75z.mocklab.io/api/books servisi GET metodu ve null body degeri ile calistirilirsa donus degerinin 200 geldigi gorulur

  Senaryo: Get data with id
    Diyelim ki http://0d75z.mocklab.io/api/books/1 servisi GET metodu ve null body degeri ile calistirilirsa donus degerinin 200 geldigi gorulur
    Diyelim ki http://0d75z.mocklab.io/api/books/2 servisi GET metodu ve null body degeri ile calistirilirsa donus degerinin 200 geldigi gorulur

  Senaryo: Author and title can not be empty with put method
    Diyelim ki http://0d75z.mocklab.io/api/books servisi PUT metodu ve {"id":3, "Author":"", "title":""} body degeri ile calistirilirsa donus degerinin 400 geldigi gorulur

  Senaryo: Duplicate data control
    Diyelim ki http://0d75z.mocklab.io/api/books servisi POST metodu ve {"id":1, "Author":"JSX", "title":"deneme1"} body degeri ile calistirilirsa donus degerinin 400 geldigi gorulur

  Senaryo: Id read-only control
    Diyelim ki http://0d75z.mocklab.io/api/books servisi PUT metodu ve {"id":1, "Author":"Montaigne", "title":"Denemeler"} body degeri ile calistirilirsa donus degerinin 400 geldigi gorulur
    Diyelim ki http://0d75z.mocklab.io/api/books servisi PUT metodu ve {"id":4, "Author":"Montaigne", "title":"Denemeler"} body degeri ile calistirilirsa donus degerinin 201 geldigi gorulur


