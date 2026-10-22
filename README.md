# Aplikasiku

Aplikasi Android pertama (Kotlin) — aplikasi penghitung sederhana untuk belajar.
Dikembangkan lewat **Termux** di HP, APK dibangun otomatis oleh **GitHub Actions**.

## Struktur Proyek

```
app/
  src/main/
    AndroidManifest.xml
    java/com/example/aplikasiku/MainActivity.kt   <- logika aplikasi
    res/layout/activity_main.xml                  <- tampilan aplikasi
    res/values/strings.xml                        <- teks aplikasi
.github/workflows/build-apk.yml                   <- workflow build APK otomatis
```

## Cara Kerja di Termux

### 1. Persiapan (sekali saja)

```bash
pkg update && pkg upgrade
pkg install git

git config --global user.name "erkfley"
git config --global user.email "email-kamu@example.com"
```

### 2. Clone repo ke Termux

```bash
git clone https://github.com/erkfley/aplikasi-androidku.git
cd aplikasi-androidku
```

Saat diminta password, gunakan **Personal Access Token** (buat di https://github.com/settings/tokens), bukan password GitHub.

### 3. Edit kode

```bash
pkg install nano
nano app/src/main/java/com/example/aplikasiku/MainActivity.kt
```

### 4. Kirim perubahan ke GitHub

```bash
git add .
git commit -m "deskripsi perubahan"
git push
```

### 5. Download APK

Setiap kali `git push`, GitHub Actions otomatis membangun APK:

1. Buka https://github.com/erkfley/aplikasi-androidku/actions
2. Klik workflow run terbaru (tunggu sampai centang hijau)
3. Scroll ke bawah, download artifact **aplikasiku-debug-apk**
4. Ekstrak ZIP, instal `app-debug.apk` di HP kamu

## Ide Pengembangan Selanjutnya

- Tambah tombol kurang (-1)
- Simpan hitungan supaya tidak hilang saat aplikasi ditutup (SharedPreferences)
- Ubah warna dan tema di `themes.xml`
- Tambah layar kedua (Activity baru)
