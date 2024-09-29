package com.mycompany.DonationManagement;

import service.LayananDonasi;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LayananDonasi donationService = new LayananDonasi();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n" +
        "-----------------------------------\n" +
        "   Sistem Manajemen Donasi Online  \n" +
        "-----------------------------------\n" +
        "                                   \n" +
        "    [1] Menu Donatur               \n" +
        "    [2] Menu Donasi                \n" +
        "    [3] Exit                       \n" +
        "                                   \n" +
        "-----------------------------------");
            System.out.print("Pilih (1-3): ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    manageDonors(donationService, scanner);
                    break;
                case 2:
                    manageDonations(donationService, scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

        private static void manageDonors(LayananDonasi donationService, Scanner scanner) {
            boolean donorMenu = true;
            while (donorMenu) {
                System.out.println("\n" +
                    "-----------------------------------\n" +
                    "        Menu Kelola Donatur        \n" +
                    "-----------------------------------\n" +
                    "                                   \n" +
                    "    [1] Tambah Donatur             \n" +
                    "    [2] Lihat Daftar Donatur       \n" +
                    "    [3] Perbarui Data Donatur      \n" +
                    "    [4] Hapus Donatur              \n" +
                    "    [5] Kembali ke Menu Utama      \n" +
                    "                                   \n" +
                    "-----------------------------------");
                System.out.print("Pilih menu (1-5): ");
                int donorChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (donorChoice) {
                    case 1:
                        System.out.print("Masukkan nama donatur: ");
                        String name = scanner.nextLine();
                        System.out.print("Masukkan email donatur: ");
                        String email = scanner.nextLine();
                        donationService.tambahDonatur(name, email);
                        break;
                    case 2:
                        donationService.daftarSemuaDonatur();
                        break;
                    case 3:
                        System.out.print("Masukkan nama donatur yang akan diperbarui: ");
                        String currentName = scanner.nextLine();
                        System.out.print("Masukkan nama baru donatur: ");
                        String newName = scanner.nextLine();
                        System.out.print("Masukkan email baru donatur: ");
                        String newEmail = scanner.nextLine();
                        donationService.perbaruiDonatur(currentName, newName, newEmail);
                        break;
                    case 4:
                        System.out.print("Masukkan nama donatur yang akan dihapus: ");
                        String deleteName = scanner.nextLine();
                        donationService.hapusDonatur(deleteName);
                        break;
                    case 5:
                        donorMenu = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }

        private static void manageDonations(LayananDonasi donationService, Scanner scanner) {
            boolean donationMenu = true;
            while (donationMenu) {
                System.out.println("\n" +
                    "-----------------------------------\n" +
                    "           Menu Donasi             \n" +
                    "-----------------------------------\n" +
                    "                                   \n" +
                    "    [1] Tambah Donasi              \n" +
                    "    [2] Lihat Daftar Donasi        \n" +
                    "    [3] Perbarui Donasi            \n" +
                    "    [4] Hapus Donasi               \n" +
                    "    [5] Kembali ke Menu Utama      \n" +
                    "                                   \n" +
                    "-----------------------------------");
                System.out.print("Pilih menu (1-5): ");
                int donationChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (donationChoice) {
                    case 1:
                        System.out.print("Masukkan nama donatur: ");
                        String donorName = scanner.nextLine();
                        System.out.print("Masukkan jumlah donasi: ");
                        double amount = scanner.nextDouble();
                        donationService.tambahDonasi(donorName, amount);
                        break;
                    case 2:
                        donationService.daftarSemuaDonasi();
                        break;
                    case 3:
                        System.out.print("Masukkan nama donatur untuk memperbarui donasi: ");
                        String nameToUpdate = scanner.nextLine();
                        System.out.print("Masukkan jumlah donasi baru: ");
                        double newAmount = scanner.nextDouble();
                        donationService.perbaruiDonasi(nameToUpdate, newAmount);
                        break;
                    case 4:
                        System.out.print("Masukkan nama donatur untuk menghapus donasi: ");
                        String nameToDelete = scanner.nextLine();
                        donationService.hapusDonasi(nameToDelete);
                        break;
                    case 5:
                        donationMenu = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
}
