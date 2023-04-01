## Aturan untuk mengukur complexity
1. Hilangkan konstanta
2. Hilangkan yang tidak dominan
3. Tambahkan jika berbeda langkah
4. Kalikan jika langkah sama
5. Variable berdasarkan input

# Rule 1 Remove Contanta
- O(2N)  adalah O(N)
- O(3N)  adalah O(N)
- O(..N) adalah O(N)
note : konstanta dalam mengukur kompleksity tidak berlaku karena nilai itu adalah nilai tetap
src : src\rule\Rule_1.java

# Rule 2 Remove not dominant
- O(N^2 + N)        adalah O(N^2) >> karena N^2 lebih dominan dari N
- O(N + Log N)      adalah O(N)   >> O(N) lebih dominan dibanding LogN
- O(N^n + 100N^2)   adalah O(N^n)

dominan matrix
O(N^n) > O(N^3) > O(N^2) > O(N) > O(Log n) > O(1)

src : src\rule\Rule_2.java

# Rule 3 Add if different way
ini seperti pada remove constanta bedanya adalah parameternya ada 2

O(M + N)
M adalah parameter pertama (arrMin)
N adalah parameter kedua (arrMax)

case ini dibedakan
1. parameter nya berbeda
2. tidak ada jaminan isi panjang nya sama

src : src\rule\Rule_3.java

# Rule 4 Multiply if same way
/ dalam perulangan sama atau dalam innerloop sama
- harus dari parameter yang berbeda

O(N * M) atau O(NM)
N = adalah input array A
M = adalah input array B

src : src\rule\Rule_4.java

# Rule 5 Variable based on input
ini hanya masalah naming saja, biasanya kita pakai N dan M
aslinya bedasarkan nama parameter.