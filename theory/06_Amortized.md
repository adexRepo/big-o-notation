# Amortisasi (Penyusutan)
Suatu teknik analisa dalam mengevaluasi complexity dari beberapa complexity
outputnya adalah mengganti complexity yang besar menjadi complexity yang rendah

# Analisa Amortisasi
Amortisasi dapat di evaluasi dengan beberapa method
1. Aggregate method     == menghitung complexity terbesar lalu menghitung amortisasi
2. Accounting method    == menggunakan perhitungan biaya untuk setiap operasi
3. Potential method     == seperti accounting tapi pakai fungsi potensial

# Contoh kasus
1. Dynamic Array    Struktur data array dynamic yang punya kemampuan adaptasi kapasitasnya
2. Queue            Struktur data yang merepresentasikan FIFO (first in first out)
3. Stack            Struktur data yang merepresentasikan LIFO (last in first out)

*disini hanya bahas Dynamic array

# Dynamic Array
Kemampuan array yang mampu beradaptasi ukurannya berdasarkan kapasiatas muatannya
jika muatannya penuh maka akan membuat ruang baru untuk muatan baru
di java initial kapasitas array by [default] ialah 10 jika dimasukan muatan lebih dari 10
maka akan dibuat 10 lagi 10 * 2, menjadi 20, jika ditambah lagi muatannya dan total
muatannya yang masuk adalah 23 maka tetap array akan menyediakan tempat baru sebanyak 20*2
hal ini karena array akan menyiapkan [2x] dari ruangan sebelumnya