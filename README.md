### Deskripsi
Program ini adalah Sistem Manajemen Donasi Online yang memungkinkan pengguna untuk mengelola data donatur dan donasi. Program ini berjalan pada terminal dan menggunakan input dari pengguna untuk melakukan berbagai operasi seperti menambah, melihat, memperbarui, dan menghapus data donatur serta donasi.

### Kelas Utama
1. Kelas 'main'
   Program ini terdiri dari dua menu utama:
![image](https://github.com/user-attachments/assets/def121a6-3958-48d8-8cc1-fe02430f2302)
    Pengguna dapat memilih antara dua menu:
    Menu Donatur: Menambahkan, melihat, memperbarui, dan menghapus donatur.
    Menu Donasi: Menambahkan, melihat, memperbarui, dan menghapus donasi.
2. Kelas LayananDonasi (dari file service.LayananDonasi):
   Menyimpan daftar donatur dan donasi dalam ArrayList.
   Menyediakan fungsi untuk menambahkan, memperbarui, menghapus, dan menampilkan daftar donatur dan donasi.

#### Cara Kerja Program
Menu Utama: Pengguna memilih salah satu dari tiga opsi:
[1] Menu Donatur: Mengelola donatur.
[2] Menu Donasi: Mengelola donasi.
[3] Exit: Keluar dari program.

Menu Donatur
Di sini pengguna bisa:
- Menambah donatur dengan memasukkan nama dan email.
  ![image](https://github.com/user-attachments/assets/1e9da1d4-f79b-4a1f-8de0-fb2c5387b904)
  
- Melihat daftar semua donatur yang ada.
  ![image](https://github.com/user-attachments/assets/5f5957f3-7ed9-4d87-9aee-c9b0f1b119d4)

- Memperbarui data donatur berdasarkan nama.
  ![image](https://github.com/user-attachments/assets/fb4cde80-8cad-428c-9156-b0ace43f26c4)

- Menghapus donatur dari daftar
  ![image](https://github.com/user-attachments/assets/6c9da196-d485-499f-9426-2c798e2f1fa0)


Menu Donasi
Di sini pengguna bisa:
- Menambah donasi dengan memasukkan nama donatur dan jumlah donasi.
  ![image](https://github.com/user-attachments/assets/53974324-6a66-4e23-95ea-2df446a01886)

- Melihat daftar semua donasi.
  ![image](https://github.com/user-attachments/assets/72247d42-7139-455a-b3a8-d849fa8142f7)

- Memperbarui jumlah donasi berdasarkan nama donatur.
  ![image](https://github.com/user-attachments/assets/43d47fc6-c7d8-4d58-a22c-5bc301b02053)

- Menghapus donasi berdasarkan nama donatur.
![image](https://github.com/user-attachments/assets/888088af-c0a8-4e9c-9260-ff5091dbe9aa)

#### Penanganan Input Salah
Untuk setiap menu, jika pengguna memasukkan input yang tidak valid, program akan memberikan pesan "PILIHAN TIDAK VALID" dan meminta pengguna untuk mengulang.

#### Penutupan Program
Ketika pengguna memilih untuk keluar (case 3 dalam menu utama), program akan menutup sesi input Scanner dan mengakhiri proses.
![image](https://github.com/user-attachments/assets/a05005fd-6e83-40c8-86ab-8d3f0e55c789)
