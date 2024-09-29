package service;

import model.Donatur;
import model.Donasi;
import java.util.ArrayList;

public class LayananDonasi {
    private ArrayList<Donatur> donatur;
    private ArrayList<Donasi> donasi;

    public LayananDonasi() {
        donatur = new ArrayList<>();
        donasi = new ArrayList<>();
    }

    // CRUD untuk Donatur
    public void tambahDonatur(String nama, String email) {
        donatur.add(new Donatur(nama, email));
        System.out.println("Donatur Baru Ditambahkan: " + nama);
    }

    public void perbaruiDonatur(String nama, String namaBaru, String emailBaru) {
        Donatur donor = cariDonaturBerdasarkanNama(nama);
        if (donor != null) {
            donor.setName(namaBaru);
            donor.setEmail(emailBaru);
            System.out.println("Donatur diperbarui: " + nama);
        } else {
            System.out.println("Donatur tidak ditemukan.");
        }
    }

    public void hapusDonatur(String nama) {
        Donatur donor = cariDonaturBerdasarkanNama(nama);
        if (donor != null) {
            donatur.remove(donor);
            System.out.println("Donatur dihapus: " + nama);
        } else {
            System.out.println("Donatur tidak ditemukan.");
        }
    }

    public void daftarSemuaDonatur() {
    if (donatur.isEmpty()) {
        System.out.println("Tidak ada donatur tersedia.");
    } else {
        for (Donatur donor : donatur) {
            System.out.println("Nama: " + donor.getName() + ", Email: " + donor.getEmail());
        }
    }
}

    private Donatur cariDonaturBerdasarkanNama(String nama) {
        for (Donatur donor : donatur) {
            if (donor.getName().equalsIgnoreCase(nama)) {
                return donor;
            }
        }
        return null;
    }

    // CRUD untuk Donasi
    public void tambahDonasi(String namaDonatur, double jumlah) {
        donasi.add(new Donasi(namaDonatur, jumlah));
        System.out.println("Donasi ditambahkan.");
    }

    public void perbaruiDonasi(String namaDonatur, double jumlahBaru) {
        Donasi donation = cariDonasiBerdasarkanNamaDonatur(namaDonatur);
        if (donation != null) {
            donation.setAmount(jumlahBaru);
            System.out.println("Donasi diperbarui.");
        } else {
            System.out.println("Donasi tidak ditemukan.");
        }
    }

    public void hapusDonasi(String namaDonatur) {
        Donasi donation = cariDonasiBerdasarkanNamaDonatur(namaDonatur);
        if (donation != null) {
            donasi.remove(donation);
            System.out.println("Donasi dihapus.");
        } else {
            System.out.println("Donasi tidak ditemukan.");
        }
    }

    public void daftarSemuaDonasi() {
    if (donasi.isEmpty()) {
        System.out.println("Tidak ada donasi tersedia.");
    } else {
        for (Donasi donasi : donasi) {
            System.out.println("Nama Donatur: " + donasi.getDonorName() + ", Jumlah Donasi: " + donasi.getAmount());
        }
    }
}


    private Donasi cariDonasiBerdasarkanNamaDonatur(String namaDonatur) {
        for (Donasi donation : donasi) {
            if (donation.getDonorName().equalsIgnoreCase(namaDonatur)) {
                return donation;
            }
        }
        return null;
    }
}
