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
Asumsikan Papa hanya mengetahui nama pasien bukan atribut lain. Maka, program belum dapat memenuhi permintaan melalui nama pasien, karena sejauh ini program hanya dapat memberikan info resep melalui permintaan dengan parameter nomor resep. Oleh karena itu Papa dapat melihat resep pasien bernama Quanta melalui fitur lihat semua resep dengan path `http://localhost:8080/resep/viewall` lalu mencari pasien bernama Quanta secara manual pada list tersebut. Permasalahan ini dapat diperbaiki dengan cara membuat Controller yang dapat meng-handle permintaan view resep dengan parameter nama pasien.

5. **Tambahkan 1 contoh resep lainnya sesukamu. Lalu cobalah untuk mengakses [Link](http://localhost:8080/resep/viewall), apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.**
Saya memasukan link seperti berikut `http://localhost:8080/resep/add?noResep=2&namaDokter=Mama%20ANAP&namaPasien=Kamu&catatan=Viva%20Fasilkom`. Lalu, program menampilkan halaman dengan keterangan bahwa resep (dengan nomor resep yang diinput) berhasil ditambahkan. Setelah itu, saya membuka view list seluruh resep dan menemukan resep baru yang telah saya tambahkan tadi disana. Setelah saya mengakses link yang diberikan pada perintah, berikut halaman yang ditampilkan [Link](https://drive.google.com/file/d/1aXe9TYsrT8IPbBwFw4aUwPZJy1AXDk3e/view?usp=sharing).