# Tutorial APAP

## Authors

**Mohammed Al Kwarizmi** - **1806185405** - **APAP - B** 
---
## Tutorial 1

### What I have learned today

### Github
1. **Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?**
Seperti yang dapat diartikan dari namanya, Issue Tracker merupakan suatu fitur untuk merekam atau melacak hal-hal yang terjadi pada repository kita. Hal-hal tersebut dapat berupa penambahan dan pembaharuan fitur, bugs, dan lain-lain. Pada Issue tracker terdapat label untuk mengelompokkan serta mengetahui Issue terkait apa yang muncul pada saat itu. Issue dapat didiskusikan seperti suatu forum dengan para kolaborator repository.

2. **Apa perbedaan dari git merge dan git merge --squash?**
Git merge merupakan suatu perintah untuk menggabungkan branch dengan master. Dengan perintah umum tersebut, commit yang ada di branch juga akan digabungkan satu persatu ke dalam master (commit akan memiliki 2 parent). Berbeda dengan git merge --squash, penambahan instruksi --squash berarti mengizinkan commit-commit dalam branch untuk digabung menjadi satu commit besar lalu digabungkan kedalam master (commit akan mempunyai hanya 1 parent, yaitu master). Penambahan instruksi tersebut digunakan untuk membuat dokumentasi terlihat lebih rapih karena beberapa commit yang terlihat tidak jauh berbeda akan digabung. History pada squash merge akan lebih “bersih” dibandingkan dengan normal merge.

3. **Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu aplikasi?**
Git memiliki cukup banyak keunggulan dalam pengembangan suatu sistem atau aplikasi. Salah satunya adalah pengembangan aplikasi dapat dijalankan secara paralel tanpa harus menunggu suatu fitur diselesaikan. Salah satu contoh fitur yang sangat berguna untuk pengembangan sistem atau aplikasi dengan tim adalah adanya fitur branch dan merge, dengan fitur tersebut tim pengembang dapat mengembangkan aplikasi secara paralel tanpa harus menunggu kolabolator lain dan takut mengalami conflict antara versi satu sama lain.

### Spring
4. **Apa itu library & dependency?**
Library sendiri merupakan kumpulan suatu fungsi atau kode yang melayani suatu tujuan tertentu. Sebagai contoh, NumPy yang merupakan library dari python yang dapat menambahkan dukungan untuk array dan matriks multi-dimensi yang besar, bersama dengan banyak koleksi fungsi matematika tingkat tinggi untuk beroperasi pada array. Sedangkan dependency merupakan ketergantungan, dalam konteks pemrograman dependency merupakan keterhubungan class dengan class lainnya. Contohnya, Program X menggunakan Library Y.  X depends on Y. Y is X's dependency.

5. **Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?**
Saat berkerja dalam tim proyek pengembangan software, banyak aktivitas yang harus diseragamkan atau distandarisasi, seperti aturan penggunaan library, struktur folder, workflow, dan lain sebagainya. Keseragaman harus diberlakukan untuk seluruh proyek agar proyek berjalan dengan selaras dan tidak menyulitkan pengembang. Dengan alasan itu, penggunaan Maven yang merupakan suatu Java Build Tools yang menggunakan konsep Project Object Model (POM) dengan fungsi untuk menstandarkan dan memanage project, mempermudah proses build dalam suatu project, mendefinisikan secara jelas apa saja isi project dan mempermudah dalam membagi-bagikan (share) file .jar di semua project ini sangat dibutuhkan. Terdapat beberapa alternatif lain selain maven yaitu Ant + Ivy dan Gradle, namun sejauh ini Maven mempunyai fitur yang lebih lengkap untuk digunakan. 

6. **Selain untuk pengembangan web, apa saja yang bisa dikembangkan dengan Spring framework?**
Framework bernama Spring merupakan framework yang saat ini sedang populer yang dapat membantu membuat aplikasi yang berbasis JVM (Java Virtual Machine) yang fleksibel. Spring biasanya digunakan dengan tujuan untuk mengatasi masalah desain sistem dalam pengembangan aplikasi enterprise. Untuk salah satu contoh implementasi sederhana adalah membuat ”hello world” RESTful Web Service dengan Spring. Lalu, selain untuk pengembangan web, spring juga dapat digunakan untuk melakukan pengaturan deklarasi manajemen transaksi, remote access dengan menggunakan RMI atau layanan web lainnya, fasilitas mailing, dan beragam opsi untuk pengaturan data ke database.

7. **Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya menggunakan**
@RequestParam atau @PathVariable?
Anotasi @RequestParam dan @PathVariable di MVC Spring digunakan untuk mengambil nilai request parameter. Anotasi ini memiliki tujuan yang serupa tetapi terdapat beberapa perbedaan dalam penggunaannya. Perbedaan utama antara @RequestParam dan @PathVariable adalah @RequestParam digunakan untuk mengakses nilai parameter kueri, sedangkan @PathVariable digunakan untuk mengakses nilai dari template URI. @RequestParam lebih berguna untuk aplikasi web tradisional dimana data sebagaian besar diteruskan dalam parameter kueri sementara, sedangkan @PathVariable lebih berguna untuk layanan web dengan framework RESTful dimana URL berisi nilai-nilai.

### What I did not understand
- Cara serta alur kerja framework Spring
- Mengapa Spring? apakah ada framework yang lain yang lebih unggul dari Spring?
- Apa itu Spring initializer?

---

## Tutorial 2

1. **Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut: [Link](http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20Fasilkom&catatan=Semangat) Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi**
Yang terjadi setelah membuka link tersebut adalah muncul Whitelabel error yang menyebutkan "error resolving template `add-resep`. Template might not exist" seperti berikut [LinkError](https://drive.google.com/file/d/1vuO9UQa5FSXcLBp_xruA-NK0BAQFXJlF/view?usp=sharing). Hal tersebut disebabkan belum adanya template yang dirujuk Controller yang menghandle permintaan link diatas. Hal tersebut dapat diperbaiki dengan membuat template "add-resep.html" pada folder `resources/templates`. 

2. **Menurut kamu anotasi @Autowired pada class Controller tersebut merupakan implementasi dari konsep apa? Dan jelaskan secara singkat cara kerja @Autowired tersebut dalam konteks service dan controller yang telah kamu buat**
Anotasi @Autowired merupakan implementasi dari konsep Dependency Injection. Anotasi @Autowired bisa digunakan untuk melakukan autowire bean pada metode penyetel seperti @Required annotation, konstruktor, properti atau metode dengan nama arbitrer dan / atau beberapa argumen. Dengan @Autowired, kita tidak perlu membuat setter dan constructor injection karena semua field/property yang memiliki anotasi @Autowired akan diisikan oleh Spring dengan object bertipe data yang sesuai.

3. **Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut: [Link](http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20Fasilkom) Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.**
Yang terjadi setelah membuka link tersebut adalah muncul Whitelabel error yang menyebutkan "Required String parameter `catatan` is not present" seperti berikut [Link](https://drive.google.com/file/d/1jU7KgC2L4GN1J3vswYtWB67elpoXLbYk/view?usp=sharing). Hal tersebut berarti bahwa parameter yang dibutuhkan untuk memproses perintah tersebut kurang. Hal tersebut dapat terjadi karena pada Controller kita menggunakan `@RequestMapping` pada path `/resep/add` lalu menggunakan `@RequestParam` dengan `required` bernilai `true` pada field `catatan` . Hal yang dapat dilakukan agar sistem menerima perintah tersebut adalah menambahkan parameter pada link yaitu dengan menuliskan parameter catatan (dengan maupun tanpa value) seperti berikut `&catatan=sebuah%20catatan`.

4. **Jika Papa APAP ingin melihat resep untuk pasien yang bernama Quanta, link apa yang harus diakses?**
Asumsikan Papa hanya mengetahui nama pasien bukan atribut lain. Maka, program belum dapat memenuhi permintaan melalui nama pasien, karena sejauh ini program hanya dapat memberikan info resep melalui permintaan dengan parameter nomor resep. Oleh karena itu Papa dapat melihat resep pasien bernama Quanta melalui fitur lihat semua resep dengan path `http://localhost:8080/resep/viewall` lalu mencari pasien bernama Quanta secara manual pada list tersebut. Permasalahan ini dapat diperbaiki dengan cara membuat Controller yang dapat meng-handle permintaan view resep dengan parameter nama pasien. Namun, jika papa mengetahui nomor resep dengan pasien Quanta (no resep=1) papa dapat membuka `http://localhost:8080/resep/view/no-resep/1`

5. **Tambahkan 1 contoh resep lainnya sesukamu. Lalu cobalah untuk mengakses [Link](http://localhost:8080/resep/viewall), apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.**
Saya memasukan link seperti berikut `http://localhost:8080/resep/add?noResep=2&namaDokter=Mama%20ANAP&namaPasien=Kamu&catatan=Viva%20Fasilkom`. Lalu, program menampilkan halaman dengan keterangan bahwa resep (dengan nomor resep yang diinput) berhasil ditambahkan. Setelah itu, saya membuka view list seluruh resep dan menemukan resep baru yang telah saya tambahkan tadi disana. Setelah saya mengakses link yang diberikan pada perintah, berikut halaman yang ditampilkan [Link](https://drive.google.com/file/d/1EoeouBvH2BQT0-Mi5kSimSH67OhIE1U1/view?usp=sharing).

## Tutorial 3

1. **Pada class ResepDb, terdapat method findByNoResep, apakah kegunaan dari method tersebut?**
Method `findByNoResep` berguna untuk mencari data resep dari suatu database resep berdasarkan parameter NoResep (Nomor resep) bertipe Long. Sebenarnya method ini sudah dibuat secara otomatis oleh Springboot karena saat Spring Data membuat @Repository baru, ia akan mengalanisis semua method yang telah didefinisikan sebelumnya pada interface, kemudian mencoba untuk menghasilkan query pada method tersebut.

2. **Pada class ResepController, jelaskan perbedaan method addResepFormPage dan addResepSubmit?**
- addResepFormPage: berguna untuk memenuhi perintah saat browser melakukan request laman `/resep/add`.
- addResepSubmit: berguna untuk memenuhi perintah saat website melakukan perintah POST, yaitu saat pengguna melakukan submit pada form di laman `/resep/add`. Form sudah disesuaikan dengan model ResepModel, maka data yang disubmit browser akan digunakan untuk membuat model ResepModel pada database.

3. **Jelaskan kegunaan dari JPA Repository!**
`JPA (Java Persistent API)` Repository adalah suatu modul yang berguna untuk mengintegrasikan Object/Class pada java dengan `Database Relasional (SQL)`. Modul ini secara otomatis melakukan pemetaan Class/Object pada java kedalam bentuk Tabel Relasional . Selain itu, modul ini juga menyediakan mekanisme Query dimulai dari pengaksesan, pengubahan, pendefinisian, eksekusi dan lain-lain. Dengan kata lain, modul ini berperan untuk memudahkan pengguna dalam mempersiapkan serta mengatur data pada aplikasi kedalam sebuah relational database.

4. **Sebutkan dan jelaskan di bagian kode mana sebuah relasi antara ResepModel dan ObatModel dibuat?**
Pada kasus ini terdapat relasi dari ResepModel dengan ObatModel yang bersifat one-to-many, artinya pada satu resep dapat mempunyai beberapa obat didalamnya. Dengan kasus seperti itu, diharuskan untuk mendefinisikan suatu hubungan yang merujuk pada suatu atribut di kedua Class tersebut (dalam kasus ini adalah noResep pada ResepModel dengan resep_id pada ObatModel). Dengan bantuan JPA, kasus ini dapat diselesaikan dengan pengimplementasian kedalam bentuk relasional database menggunakan Anotasi khusus yang sudah disediakan. Anotasi tersebut akan ada dan digunakan pada setiap Class yang bersangkutan seperti berikut.
- ResepModel --> menggunakan anotasi `@OneToMany` yang mendefinisikan skema relasi dengan tabel `Obat`. Diikuti dengan penjelasan mengenai data pada Java Class tersebut yaitu List<ObatModel>

- ObatModel --> 
Menggunakan beberapa anotasi seperti: 
    - @ManyToOne yang mendefinisikan skema relasi dengan tabel `Resep`
    - @JoinColumn untuk menggabungkan primary key dari resep ke obat
    - @OnDelete untuk menandakan perilaku database saat suatu resep dihapus
    - @JsonIgnore yang menandakan atribut/properti yang akan dihiraukan saat membaca JSON menjadi java object atau saat membuat java object menjadi JSON
Diikuti dengan penjelasan mengenai data pada Java Class tersebut yaitu ResepModel resepModel.


5. **Jelaskan kegunaan FetchType.LAZY, CascadeType.ALL, dan FetchType.EAGER!**
- **FetchType.LAZY** --> memiliki kegunaan yaitu untuk memuat beberapa collecton object (child) 
yang dibutuhkan saja saat object parent di fetch. Collection object (child) hanya dimuat 
jika secara eksplisit dibutuhkan via getter method. Dalam kata lain inisialisasi ini hanya 
melakukan fetch hanya ketika suatu data dibutuhkan. Tujuan inisialisasi ini adalah untuk 
meningkatkan `performance`. Default fetching dari inialisasi ini adalah @OneToMany dan @ManyToMany.

- **CascadeType.ALL** --> memiliki kegunaan yaitu untuk memuat semua `actions` atau perintah secara 
keseluruhan. Contohnya adalah ketika kita menghapus sebuah `parent`, maka tentu 
`child`-nya akan ikut terhapus. Begitu juga dengan action lain seperti update.

- **FetchType.EAGER** --> memiliki kegunaan yaitu untuk memuat semua collection object (child) 
sesaat setelah object parent di fetch. Dalam kata lain inisialisasi ini akan melakukan 
fetch secara bersamaan. Default fetching dari inialisasi ini adalah @OneToOne dan 
@ManyToOne.

## Tutorial 4

1. **Jelaskan perbedaan th:include dan th:replace!**
th:include dan th:replace merupakan sebagian contoh dari host tag, ke dua host tag berfungsi untuk mengimplementasikan bentuk fragment yang disediakan oleh Thymeleaf pada tag di html. Fragment sendiri merupakan sebuah reuseable class yang mengimplement beberapa fitur sebuah Activity. 

**Perbedaan:**
- `th:replace` disisipkan pada tag yang kita ingin tambahkan fragment-nya, th:replace akan akan menggantikan host tag dengan fragment. Dengan begitu, posisi host tag akan digantikan sepenuhnya dengan fragment, termasuk fragment tag-nya.

- `th:include` disisipkan pada tag yang kita ingin tambahkan fragment-nya, th:include hanya akan menambahkan fragment pada body dari host tag, bukan menggantikan. Namun, fragment tag-nya tidak dimasukkan.

**Contoh:**
- `<div th:include="...">` contoh </div> --> konten akan ditempatkan di dalam <div> tag.

- `<div th:replace="...">` contoh </div> --> tag <div> akan digantikan dengan konten yang ada.

2. **Jelaskan apa fungsi dari th:object!**
`th:object` merupakan atribut yang menyimpan command object (bentuk dari bean object), yaitu bentuk representasi dari object yang berada pada backend. Dapat diartikan bahwa th:object mereferensikan Model yang akan merepresentasikan state dari form yang dibuat. Sebagai contoh:

`<form th:action="@{/resep/add}" th:object="${resep}" method="POST">`
Pada tag form tersebut kita menyisipkan th:object="${resep}" sebagai tanda bahwa form tersebut menggunakan objek resep sebagai model untuk pengumpulan data formnya.

3. **Jelaskan perbedaan dari * dan $ pada saat penggunaan th:object! Kapan harus dipakai?**
Secara umum, * dan $ sama-sama digunakan untuk melakukan variable expression. Namun terdapat perbedaan antar karakter tersebut. Karakter * digunakan ketika melakukan expression pada selected object, bukan keseluruhan dari variable maps. Lalu, * akan mengevaluasi atribut/variable dari `th:object`, sementara $ akan melakukan evaluasi terhadap keseluruhan atribut/variable pada `th:object`. Selama tidak ada object yang dipilih, maka * dan $ digunakan untuk hal yang sama. 

4. **Bagaimana kamu menyelesaikan latihan nomor 3?**
Saya menambahkan atribut `th:text` pada elemen HTML dengan expression `${NamaPage}` saat pembuatan fragment navbar. Lalu, saat mengimplementasikan fragment tersebut pada HTML, saya mengisi parameter pada pemanggilan fragment navbar tersebut dengan judul halaman HTML sesuai tempat pengimplementasian fragment.

**Contoh:**
- pada page:`<nav th:replace="fragments/fragment :: navbar('View Resep')"></nav>`
- pada fragment: `<a th:text="${NamaPage}" class="nav-item nav-link active text-secondary" th:href="@{/}">`

## Tutorial 5

1. **Apa itu Postman? Apa kegunaannya?**
Postman merupakan aplikasi atau development tool API yang digunakan untuk melakukan build, test, dan modify API. Postman berfungsi sebagai REST Client dimana dapat digunakan untuk uji REST API. Dengan Postman, kita sebagai developer dapat mendokumentasikan, tes, mendesain, debug, menerbitkan, dan memonitor API pada satu tempat. Developer tidak harus menulis HTTP client network code, tetapi membuat test suites yang dinamakan "Collections" ketika menggunakan Postman untuk melakukan testing. Postman akan berinteraksi dengan API secara otomatis.


2. **Jelaskan fungsi dari anotasi @JsonIgnoreProperties dan @JsonProperty.**
- @JsonIgnoreProperties berfungsi untuk memberikan perintah pada class untuk mengabaikan properti logis yang ditentukan dalam serialisasi dan deserialisasi JSON. Sebagai contoh, ketika kita memberikan true untuk element ignoreUnknown, maka bidang JSON akan diabaikan jika data JSON memiliki bidang yang tidak mempunyai properti logis.

- @JsonProperty merupakan anotasi yang memiliki fungsi untuk mengubah nama variabel. @JsonProperty memberitahu Jackson ObjectMapper untuk memetakan nama property JSON ke nama bidang Java yang diberikan anotasi.


3. **Apa kegunaan atribut WebClient?**
WebClient yang digunakan pada RestServiceImpl merupakan sebuah interface yang disediakan oleh Spring Framework yang merupakan bagian dari reactive client. WebClient memiliki fungsi sebagai poin akses utama dari web / HTTP requests. Selain itu, WebClient juga berfungsi untuk menginstansiasi sebuah akses poin URL serta mengelola request dan response atas URL tersebut.


4. **Apa itu ResponseEntity dan BindingResult? Apa kegunaannya?**
- ResponseEntity merupakan salah satu class yang terdapat di java dan mewakili respons HTTP, termasuk header, body, dan status. Seperti @ResponseBody yang menempatkan return value ke body dari response, ResponseEntity juga memungkinkan kita untuk dapat menambahkan header dan kode status. 

- BindingResult merupakan objek Spring yang menyimpan hasil dari validasi, binding, dan error atas model objek yang divalidasikan. BindingResult berisikan informasi mengenai kesalahan, seperti field yang diperlukan, adanya ketidakcocokan jenis atau kesalahan dalam melakukan pemanggilan method. BindingReslut digunakan dengan cara diletakkan setelah parameter objek validasi. 

## Tutorial 6

1. **Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi! Di bagian mana (dalam kode yang telah anda buat) konsep tersebut diimplementasi?** 
- Otentikasi merupakan proses untuk melakukan verifikasi apakah pengguna yang ingin login dengan username tersebut telah terdaftar di database dan berhak untuk masuk dan mengakses aplikasi. Biasanya melibatkan username dan password, tetapi dapat menyertakan metode lain yang dapat menunjukkan identitas seperti sidik jari.
- Berikut merupakan contoh implementasi otentifikasi pada class `WebSecurityConfig`:
@Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{auth.userDetailsService(userDetailsService).passwordEncode(encoder());}

- Otorisasi merupakan proses untuk menentukan hak pengguna apakah pengguna memiliki akses ke halaman tertentu yang telah diotentifikasi dan menentukan apakah orang yang sudah diidentifikasi (diotentikasi), diperbolehkan untuk memanipulasi sumber daya tertentu. Biasanya ditentukan dengan mencari apakah orang itu memiliki akses ke sumber daya tertentu.
- Berikut merupakan contoh implementasi otorisasi pada class `WebSecurityConfig`:
authorizeRequests()
.antMatchers("/css/**").permitAll()
.antMatchers("/js/**").permitAll()
.antMatchers("/resep/**").hasAnyAuthority("APOTEKER","ADMIN")

 Sedangkan otorisasi merupakan 
2. **Apa itu BCryptPasswordEncoder? Jelaskan secara singkat cara kerjanya!**
- BCryptPasswordEncoder merupakan salah satu fungsi password hashing. BCryptPasswordEncoder bertugas untuk melakukan encrypt password user sebelum disimpan ke database. BCryptPasswordEncoder juga bertugas untuk melakukan encrypt terhadap password pada saat user ingin melakukan login. Cara kerjanya BCryptPasswordEncoder adalah saat kita membuat user baru dengan membuat username dan password baru, maka setelah kita klik 'save', maka password akan dienkripsi menggunakan fungsi BCrypt sehingga password yang terlihat pada database adalah password yang sudah dienkripsi.

3. **Jelaskan secara singkat apa itu UUID beserta penggunaannya!** 
- UUID (Universally Unique Identifier) merupakan kode identifikasi unik yang diberikan oleh sistem secara acak dengan algoritma tertentu. UUID digunakan untuk memungkinkan sistem mendistribusi/mengenerate id pengguna secara unik dengan hashing sebanyak 32 karakter secara acak yang bertujuan untuk meningkatkan keamanan data pengguna sehingga id pengguna aman dan tidak mudah untuk diretas. Mirip seperti BCrypt, bedanya kali ini adalah ID, bukan password. Saat kita membuat user baru, sistem akan otomatis melakukan pemberian kode unik yang akan terlihat pada database dengan tipe UUID. Pada tutorial ini, UUID digunakan di UserModel.java

4. **Apa kegunaan class UserDetailsServiceImpl.java? Mengapa harus ada class tersebut padahal kita sudah memiliki class UserRoleServiceImpl.java?**
- Class UserDetailsServiceImpl.java mengimplementasi interface UserDetailService yang sudah disediakan oleh spring security. Class tersebut berguna untuk mengambil informasi otentikasi dan otorisasi pengguna. Tujuannya agar Spring Boot Security dapat melakukan otorisasi terhadap pengguna yang melakukan login sesuai dengan rolenya yang sudah terdaftar di database. Class ini harus ada karena class UserServiceImpl dan RoleServiceImpl tidak dapat memberikan informasi kepada Spring boot mengenai otentikasi dan otorisasi dari akun-akun yang ada pada database sistem.

## **Tutorial 7**

**1. Jelaskan apa yang Anda lakukan di latihan dalam satu paragraf per-soal. Berikan screenshot sebagai ilustrasi dari apa yang Anda jelaskan**
- Pada latihan **pertama**, saya menambahkan validasi pada komponen Item, dimana sebelumnya, jika salah satu item dari movie list ditekan, maka state item akan menjadi checked. Oleh karena itu saya menambahkan validasi berikut pada tag input:

```https://drive.google.com/file/d/1whMbMJ3GqDGw33eTCETI8lucjhrAdT0r/view?usp=sharing```


- Pada latihan **kedua**, saya membuat button yang dapat menghapus semua item yang ada pada list favItems. Untuk membuatnya, yang pertama saya lakukan adalah membuat function yang dapat mengubah state favItems menjadi list kosong. Berikut adalah functionnya:

```https://drive.google.com/file/d/1Sx0_AW0k4LUIaP9eD3lk-5g-CVVlSx4H/view?usp=sharing```

lalu setelah membuat function tersebut, saya membuat div yang memuat validasi bahwa button hanya ditampilkan jika terdapat item pada favItems beserta tag button yang dapat memanggil function clearFavItem setiap kali button di click. Berikut adalah div dan buttonnya:

```https://drive.google.com/file/d/1n0S7jd9ibr6jTWj8t_O26c8vbPwH4lW5/view?usp=sharing```

- Pada latihan **ketiga**, saya membuat function baru bernama handle handleFavItemClick yang akan digunakan untuk menghandle item yang khusus terletak pada list favItems dan saya juga menghilangkan bagian kode fungsi handleItemClick yang dapat memanggil fungsi .splice() untu menghapus item dari list favItems. Berikut adalah potongan kode kedua fungsi:

```https://drive.google.com/file/d/1KTDh-jWi_Yln57DFzQRPhnOnWLvXrSGz/view?usp=sharing```

- Pada latihan **keempat**, saya menambahkan sebuah switch dimana setiap switch nyala, maka bagian list favItems akan ditampilkan. Untuk mencapainya saya menambahkan validasi pada tag div yang memuat list favItems, membuat function yang dapat merubah state dari textDisplay (state yang menentukan jika list favItems ditunjukkan atau tidak), dan membuat switch dengan action yang dapat memanggil fungsi yang telah dibuat. Berikut adalah potongan kode untuk fungsi yang dibuat:

```https://drive.google.com/file/d/1Q9mRK903IFCruVFyoKgNnLsGeixCrNUL/view?usp=sharing```

Berikut adalah potongan kode untuk switch yang dibuat:

```https://drive.google.com/file/d/1uyiIUuH9BLGaahGJ6qg3gONQttw98czn/view?usp=sharing```

Dan berikut adalah potongan kode untuk validasi div yang ditunjukkan atau di hide:

```https://drive.google.com/file/d/1tH_B420cwI_tHMid6C5ie4OG6TpcdRl0/view?usp=sharing```

- Terakhir, untuk latihan **kelima**, saya membuat komponen baru pada folder components yang dinamakan EmptyState. Lalu, pada komponen tersebut, saya membuat file index.js dengan isi berikut:

```https://drive.google.com/file/d/1WuQRxalRjq8yKQFO9W75Ic_GD5v7oYjn/view?usp=sharing```

Lalu, saya memanggil EmptyState tersebut pada komponen List sehingga jika komponen list belum memiliki items, yang akan dirender oleh program adalah komponen state. Berikut adalah potongan kodenya:

```https://drive.google.com/file/d/1ezFAnZFNldT_0n8cjkxcrzs0j3OrDQ4i/view?usp=sharing```

**2. Menurut pemahaman kamu selama pengerjaan tutorial ini, apa perbedaan antara state dan props?**
- Props merupakan singkatan dari property yang setara dengan argumen pada sebuah function di bahasa pemrograman seperti java atau python. Pada tutorial ini, contoh dari props adalah item pada function handleFavItemClick = (item). Pada umumnya, props digunakan untuk melakukan komunikasi data antar component dari parent component ke child component.

- Sedangkan state adalah data private yang dimiliki component yang terus berubah sesuai dengan perilaku program. Contoh state pada tutorial ini dapat dilihat pada favItems, dimana favItems akan berubah sesuai dengan penambahan dan pengurangan props item yang di klik pada list favItems. State digunakan untuk komunikasi data internal. Component yang dapat memiliki state yaitu hanya class component saja. 


**3. Apa keuntungan menggunakan component (e.g. List, Item) di React? Berikan contohnya!**
- Keuntungan menggunakan component pada react adalah sifat re-usable yang dimilikinya. Setiap component,seperti pada tutorial yaitu Item dan List memiliki logika sendiri dan mengontrol proses renderingnya sendiri. Jika kita menggunakan fitur komponen, kita dapat menggunakan kode yang terdapat didalamnya kapan saja dan dimana saja dan dapat membantu kita dalam membuat aplikasi yang konsisten.

**4. Menurut kamu, apa saja kelebihan menggunakan React dalam pengembangan web?**
Menurut saya dalam mengembangkan sebuah web, react dapat memberikan banyak keuntungan, yang diantaranya adalah:
- Penggunaan React mudah untuk dipelajari dan implementasikan terlebih jika sudah memahami programming
- Membuat aplikasi web dinamis menjadi lebih mudah 
- Proses rendering yang lebih cepat karena terdapat virtual DOM
- Banyak digunakan oleh perusahaan 
- Terdapat developer toolset yang sangat membantu seperti React Dev Tools pada Google Chrome, dan lainnya
   

**5. Menurut kamu, apa saja kekurangan menggunakan React dalam pengembangan web?**
Kekurangan yang saya rasakan dari react diantaranya adalah:
- Ukuran library yang besar 
- Sulitnya memahami flow dan juga bahasa pemrograman yang digunakan pada react jika belum pernah memiliki pengalaman programming sebelumnya sehingga butuh pelatihan yang cukup intensif
- Hanya mencakup lapisan UI aplikasi dan tidak ada yang lain (frontend)