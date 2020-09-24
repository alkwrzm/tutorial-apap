# Tutorial APAP

## Authors

**Mohammed Al Kwarizmi** - **1806185405** - **APAP - B** 
---
## Tutorial 1

### What I have learned today

### Github
1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?
Seperti yang dapat diartikan dari namanya, Issue Tracker merupakan suatu fitur untuk merekam atau melacak hal-hal yang terjadi pada repository kita. Hal-hal tersebut dapat berupa penambahan dan pembaharuan fitur, bugs, dan lain-lain. Pada Issue tracker terdapat label untuk mengelompokkan serta mengetahui Issue terkait apa yang muncul pada saat itu. Issue dapat didiskusikan seperti suatu forum dengan para kolaborator repository.

2. Apa perbedaan dari git merge dan git merge --squash?
Git merge merupakan suatu perintah untuk menggabungkan branch dengan master. Dengan perintah umum tersebut, commit yang ada di branch juga akan digabungkan satu persatu ke dalam master (commit akan memiliki 2 parent). Berbeda dengan git merge --squash, penambahan instruksi --squash berarti mengizinkan commit-commit dalam branch untuk digabung menjadi satu commit besar lalu digabungkan kedalam master (commit akan mempunyai hanya 1 parent, yaitu master). Penambahan instruksi tersebut digunakan untuk membuat dokumentasi terlihat lebih rapih karena beberapa commit yang terlihat tidak jauh berbeda akan digabung. History pada squash merge akan lebih “bersih” dibandingkan dengan normal merge.

3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu
aplikasi?
Git memiliki cukup banyak keunggulan dalam pengembangan suatu sistem atau aplikasi. Salah satunya adalah pengembangan aplikasi dapat dijalankan secara paralel tanpa harus menunggu suatu fitur diselesaikan. Salah satu contoh fitur yang sangat berguna untuk pengembangan sistem atau aplikasi dengan tim adalah adanya fitur branch dan merge, dengan fitur tersebut tim pengembang dapat mengembangkan aplikasi secara paralel tanpa harus menunggu kolabolator lain dan takut mengalami conflict antara versi satu sama lain.

### Spring
4. Apa itu library & dependency?
Library sendiri merupakan kumpulan suatu fungsi atau kode yang melayani suatu tujuan tertentu. Sebagai contoh, NumPy yang merupakan library dari python yang dapat menambahkan dukungan untuk array dan matriks multi-dimensi yang besar, bersama dengan banyak koleksi fungsi matematika tingkat tinggi untuk beroperasi pada array. Sedangkan dependency merupakan ketergantungan, dalam konteks pemrograman dependency merupakan keterhubungan class dengan class lainnya. Contohnya, Program X menggunakan Library Y.  X depends on Y. Y is X's dependency.

5. Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?
Saat berkerja dalam tim proyek pengembangan software, banyak aktivitas yang harus diseragamkan atau distandarisasi, seperti aturan penggunaan library, struktur folder, workflow, dan lain sebagainya. Keseragaman harus diberlakukan untuk seluruh proyek agar proyek berjalan dengan selaras dan tidak menyulitkan pengembang. Dengan alasan itu, penggunaan Maven yang merupakan suatu Java Build Tools yang menggunakan konsep Project Object Model (POM) dengan fungsi untuk menstandarkan dan memanage project, mempermudah proses build dalam suatu project, mendefinisikan secara jelas apa saja isi project dan mempermudah dalam membagi-bagikan (share) file .jar di semua project ini sangat dibutuhkan. Terdapat beberapa alternatif lain selain maven yaitu Ant + Ivy dan Gradle, namun sejauh ini Maven mempunyai fitur yang lebih lengkap untuk digunakan. 

6. Selain untuk pengembangan web, apa saja yang bisa dikembangkan dengan Spring framework?
Framework bernama Spring merupakan framework yang saat ini sedang populer yang dapat membantu membuat aplikasi yang berbasis JVM (Java Virtual Machine) yang fleksibel. Spring biasanya digunakan dengan tujuan untuk mengatasi masalah desain sistem dalam pengembangan aplikasi enterprise. Untuk salah satu contoh implementasi sederhana adalah membuat ”hello world” RESTful Web Service dengan Spring. Lalu, selain untuk pengembangan web, spring juga dapat digunakan untuk melakukan pengaturan deklarasi manajemen transaksi, remote access dengan menggunakan RMI atau layanan web lainnya, fasilitas mailing, dan beragam opsi untuk pengaturan data ke database.

7. Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya menggunakan
@RequestParam atau @PathVariable?
Anotasi @RequestParam dan @PathVariable di MVC Spring digunakan untuk mengambil nilai request parameter. Anotasi ini memiliki tujuan yang serupa tetapi terdapat beberapa perbedaan dalam penggunaannya. Perbedaan utama antara @RequestParam dan @PathVariable adalah @RequestParam digunakan untuk mengakses nilai parameter kueri, sedangkan @PathVariable digunakan untuk mengakses nilai dari template URI. @RequestParam lebih berguna untuk aplikasi web tradisional dimana data sebagaian besar diteruskan dalam parameter kueri sementara, sedangkan @PathVariable lebih berguna untuk layanan web dengan framework RESTful dimana URL berisi nilai-nilai.

### What I did not understand
- Cara serta alur kerja framework Spring
- Mengapa Spring? apakah ada framework yang lain yang lebih unggul dari Spring?
- Apa itu Spring initializer?