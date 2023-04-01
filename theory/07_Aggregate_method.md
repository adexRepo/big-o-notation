## Aggregate Method
__________________________________________________
|   insert   |  Capacity |Resize     | Cost      |   
|    init    |     1     |           |   O(1)    |
|      1     |     1     |           |   O(1)    |
|      2     |  +1 => 2  |           |   O(2N)   | 2 karena 1 * 2
|      3     |  +2 => 4  |           |   O(2N)   | 2 karena 2 * 2
|      4     |     4     |           |   O(1)    |
|      5     |  +4 => 8  |           |   O(2N)   | 2 karena 4 * 2
|      6     |     8     |           |   O(1)    |
|      7     |     8     |           |   O(1)    |
|      8     |     8     |           |   O(1)    |
|      9     |  +8 => 16 |           |   O(2N)   | 2 karena 8 * 2
|     10     |    16     |           |   O(1)    |
| Worst Cost |  O(2N)    |Amortize   |   O(1)    |

diatas ini adalah data yang didapat dari Dynamic array sebelumnya
note : O(2N) menjadi O(N) >> rule 1

# Formula Aggregate : 
Amortized = Cost Tertinggi / Total Operasi

# Perhitungan
Cost Tertinggi = O(N)
Total Operasi  = N

Amortized = O(N / N)
Amortized = O(1)

artinya complexity nya bisa di naikan hingga O(1)
dengan cara inisialnya langsung dimasukkan 10
sehingga akhirnya cost yang dibutuhkan tiap memasukan data adalah O(1)
