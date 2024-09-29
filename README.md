### Deskripsi
Program ini adalah Sistem Manajemen Donasi Online yang memungkinkan pengguna untuk mengelola data donatur dan donasi. Program ini berjalan pada terminal dan menggunakan input dari pengguna untuk melakukan berbagai operasi seperti menambah, melihat, memperbarui, dan menghapus data donatur serta donasi.

### Struktur Program
Program ini terdiri dari dua menu utama:
![image](https://github.com/user-attachments/assets/def121a6-3958-48d8-8cc1-fe02430f2302)
Menu Donatur: Mengelola data donatur.
Menu Donasi: Mengelola data donasi.
Pengguna dapat memilih opsi dari menu untuk melakukan operasi yang diinginkan. Operasi ini memanggil layanan (service) dari kelas LayananDonasi.

#### Kelas Utama: main
Kelas ini berfungsi sebagai titik masuk utama untuk menjalankan program.
![image](https://github.com/user-attachments/assets/12e8c84a-7383-4364-aa52-b346d04a7160)
LayananDonasi: Kelas yang bertanggung jawab untuk menangani semua logika bisnis terkait dengan manajemen donasi dan donatur.
Scanner: Digunakan untuk membaca input dari pengguna.
VARIABEL
donationService: Objek dari kelas LayananDonasi yang digunakan untuk memanggil metode yang terkait dengan donasi dan donatur.
scanner: Objek dari kelas Scanner untuk menerima input dari pengguna.
running: Variabel boolean untuk mengontrol jalannya program utama.
METODE MAIN
Metode ini mencakup logika utama dari program. Menampilkan menu utama dan memberikan opsi untuk:
1. Menu Donatur
2. Menu Donasi
3. Exit (Keluar dari program)
Ketika pengguna memilih opsi, program akan memanggil metode terkait untuk mengelola donatur atau donasi, atau keluar dari aplikasi.

#### Menu Donatur
Metode manageDonors() mengelola semua interaksi yang terkait dengan donatur. Menu ini menyediakan opsi untuk:
![image](https://github.com/user-attachments/assets/35260dfd-6cb4-437a-aa80-c923b4548bdd)
Tambah Donatur: Menambah data donatur baru.
Lihat Daftar Donatur: Menampilkan daftar semua donatur.
Perbarui Data Donatur: Memperbarui informasi donatur berdasarkan nama.
Hapus Donatur: Menghapus data donatur dari sistem.
Kembali ke Menu Utama: Kembali ke menu utama.

Beberapa Contoh Operasi Donatur:
Menambah Donatur:
![image](https://github.com/user-attachments/assets/85fdab9b-d438-4d00-91c5-ca39e3989b1b)
Pengguna diminta memasukkan nama dan email donatur, lalu metode ini akan menambah donatur ke sistem.
Memperbarui Donatur:
![image](https://github.com/user-attachments/assets/21b7cad2-1cae-408f-ac39-a1d484e10144)
Pengguna diminta memasukkan nama donatur yang ingin diperbarui beserta data baru.

#### Menu Donasi
Metode manageDonations() mengelola semua interaksi yang terkait dengan donasi. Menu ini menyediakan opsi untuk:
1. Tambah Donasi: Menambah data donasi baru berdasarkan nama donatur.
2. Lihat Daftar Donasi: Menampilkan semua donasi yang ada.
3. Perbarui Donasi: Memperbarui jumlah donasi untuk donatur yang telah ada.
4. Hapus Donasi: Menghapus data donasi dari sistem berdasarkan nama donatur.
5. Kembali ke Menu Utama: Kembali ke menu utama.

Contoh Operasi Donasi:
Menambah Donasi:
donationService.tambahDonasi(donorName, amount);
Pengguna diminta memasukkan nama donatur dan jumlah donasi yang akan ditambahkan.
Memperbarui Donasi:
donationService.perbaruiDonasi(nameToUpdate, newAmount);
Pengguna diminta memasukkan nama donatur yang ingin diperbarui beserta jumlah donasi yang baru.

#### Penanganan Input Salah
Untuk setiap menu, jika pengguna memasukkan input yang tidak valid, program akan memberikan pesan kesalahan dan meminta pengguna untuk mengulang masukan.

#### Penutupan Program
Ketika pengguna memilih untuk keluar (case 3 dalam menu utama), program akan menutup sesi input Scanner dan mengakhiri proses.
