# Muhammad Syahdan Junus 

|  |                         |  |
|-----|-------------------------|-----|
|Nama| Muhhammad Syahdan Junus |
|NIM| 312210285               |
|Kelas| TI.22.A.3               |
|Mata Kuliah| Pemograman Mobile       |

## A. Splash Launcer

### MainLauncherSplashLogo.java:

- Kelas MainLauncherSplashLogo mewarisi dari AppCompatActivity.
- Mengatur layout aktivitas ke activity_launcer_splash_logo.xml.
- Menyembunyikan status bar untuk tampilan layar penuh.
- Menunda perpindahan ke aktivitas MainHomePage selama 3 detik.
- Setelah 3 detik, membuka MainHomePage dan menutup Splash.

### activity_launcer_splash_logo.xml:

- Layout MotionLayout dengan dua elemen utama:

  - ConstraintLayout backgroundLayout sebagai latar belakang.
  - ImageView blueLogo untuk menampilkan logo aplikasi.

- Atribut elemen:
  - backgroundLayout berukuran 200dp x 200dp dengan warna latar belakang dari colors.xml.
  - blueLogo berukuran 150dp x 150dp, menampilkan gambar dari drawable/dreaming, diposisikan di tengah layer.

### Kesimpulan:

Kode ini menampilkan splash screen sederhana dengan logo aplikasi selama 3 detik sebelum beralih ke aktivitas utama.

## B. Home Page

### MainHomePage.java:

- Kelas MainHomePage mewarisi dari AppCompatActivity.
- Mengatur layout aktivitas ke activity_home.xml.
- Menyembunyikan status bar untuk tampilan layar penuh.
- Menginisialisasi tombol untuk setiap kartu menu.
- Menyetel listener klik untuk setiap tombol untuk berpindah ke aktivitas yang sesuai.

### activity_home.xml:

- Layout RelativeLayout dengan elemen-elemen seperti TextView, LinearLayout utama, dan tiga LinearLayout horizontal untuk kartu.
  Setiap kartu di dalam CardView memiliki ikon dan teks yang jelas.

### Kesimpulan:

Kode ini membuat halaman beranda yang rapi dan mudah digunakan dengan tampilan kartu yang menarik.

## C. Hello

### MainHello.java:

- Kelas MainHello mewarisi dari AppCompatActivity.
- Metode onCreate() memanggil metode super.onCreate() dan mengatur layout aktivitas ke activity_main.xml.

### activity_main.xml:

- Layout ConstraintLayout dengan TextView yang menampilkan teks "Apa kabar?" dengan warna biru dari colors.xml.

### Kesimpulan:

Kode ini membuat aktivitas dasar yang menampilkan teks sederhana menggunakan ConstraintLayout.

## D. Count

### MainCount.java:

- Kelas MainCount mewarisi dari AppCompatActivity.
- Metode onCreate mengatur layout aktivitas ke activity_count.xml dan menghubungkan komponen UI.

activity_count.xml:

- Layout ConstraintLayout dengan elemen Button dan TextView yang diatur dengan berbagai atribut.

### Kesimpulan:

Kode ini menampilkan aplikasi Android dengan dua tombol dan sebuah TextView untuk menghitung dan menampilkan nilai.

## E. News

### ScrollingIcecold.java:

- Kelas ScrollingIcecold mewarisi dari AppCompatActivity.
- Metode onCreate mengatur layout aktivitas ke activity_scrollicecold.xml.

### activity_scrollicecold.xml:

- Layout RelativeLayout dengan elemen-elemen seperti TextView, ScrollView, dan LinearLayout.

### Kesimpulan:

Kode ini membuat aktivitas untuk menampilkan artikel dengan tampilan yang rapi dan mudah dibaca menggunakan ScrollView.

## F. Alarm

- Terdapat dua kelas utama, `AlarmActivity` dan `AlarmReceiver`, untuk mengatur alarm.
- Layout XML `activity_sleepalarm.xml` digunakan untuk menentukan tata letak antarmuka.

### Fungsi:

- Menampilkan tata letak untuk mengatur alarm dengan tombol toggle dan time picker.
- Menggunakan AlarmManager dan PendingIntent untuk menjadwalkan dan mengelola alarm.
- Menggunakan broadcast receiver (AlarmReceiver) untuk menanggapi alarm yang aktif.

### Kesimpulan:

Proyek ini berhasil membuat aplikasi pengatur alarm dengan antarmuka pengguna yang sederhana dan efektif.

## G. Fibonacci

- Kelas `MainActivity.java` mengelola logika utama aplikasi dan antarmuka pengguna.
- Layout XML `activity_toast.xml` mendefinisikan tata letak antarmuka pengguna.

### Fitur:

- Pengguna memasukkan batas Fibonacci yang diinginkan.
- Tombol "Count" menghitung nilai Fibonacci berikutnya hingga mencapai batas.
- Tombol "Show Fibonacci" menampilkan pesan tentang deret Fibonacci.
- Tombol "Reset" mengembalikan nilai Fibonacci ke 0 dan mengosongkan input batas.

### Kesimpulan:

Aplikasi berhasil menampilkan deret Fibonacci dengan fungsionalitas untuk menghitung, menampilkan pesan, dan mereset nilai.

## H. Chat

- Dua kelas utama, MainActivityOne dan SecondActivity, digunakan untuk membuat aplikasi obrolan.
- Layout XML activity_satu.xml dan activity_dua.xml digunakan untuk menentukan antarmuka pengguna.

### Fitur:

- Pengguna dapat memasukkan pesan di MainActivityOne dan mengirimkannya ke SecondActivity.
- SecondActivity menerima dan menampilkan balasan.

### Kesimpulan:

Proyek ini menciptakan aplikasi sederhana yang memungkinkan pengguna berinteraksi melalui aktivitas dan bertukar pesan.

## I. Maps

- Kelas `MapActivity.java` digunakan untuk menampilkan peta dengan menggunakan Intent dan Uri.
- Layout XML `activity_map.xml` digunakan untuk menentukan tata letak antarmuka pengguna.

### Fungsi:

- Menampilkan peta pada layar dengan menggunakan aplikasi peta eksternal.
- Menggunakan koordinat lokasi yang ditentukan dalam kode.

### Kesimpulan:

Aplikasi ini berhasil menampilkan peta dengan menggunakan aplikasi peta eksternal dan koordinat lokasi tertentu.

## J. Movie

1. Tab Activity:

Menggunakan TabLayout dan ViewPager untuk mengorganisir konten film dalam tab.
Menggunakan adapter Halaman untuk mengelola konten dalam ViewPager.

2. Fragment:

Menggunakan fragment untuk menampilkan daftar film dalam kategori "Action", "Fantasy", dan "Romantic".
Menggunakan OnClickListener untuk memulai aktivitas Exoplayer1Activity ketika gambar film diklik.

3. ExoPlayer:

Menggunakan ExoPlayer untuk memutar video dalam Exoplayer1Activity.
Menggunakan StyledPlayerView sebagai antarmuka pemutar video.
URI video diperoleh dari informasi yang dikirimkan melalui Intent atau secara statis dalam metode getVideoUri.

### Kesimpulan:

Penggunaan Tab Activity, Fragment, dan ExoPlayer meningkatkan pengalaman pengguna dengan menyediakan antarmuka yang terstruktur, modular, dan memungkinkan pemutaran video yang dikelola dengan baik.

# Demo Dreaming Apps

https://github.com/muhammadriyadussolihin/RIYADAPPS_UAS_PEMOGRAMAN_MOBILE/assets/116700346/7a322a21-810d-446c-aaa1-72556473b521
