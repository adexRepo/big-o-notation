## Accounting Method
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

Aturan:
1 Saldo awal $3 per operasi
2 Setiap operasi -$1  (dikenakan biaya)
3 Biaya lebih masuk ke bank
4 bank >= 0

misalkan kita ingin memasukkan 4 nilai
bank = $0
[1] = $3 [rule 1]
[2] = $3 [rule 1]
[3] = $3 [rule 1]
[4] = $3 [rule 1]
---> tiap memasukkan nilainya biaya -$1 [rule 2]
bank = $8 [rule 3]
[1] = $3 - $1 == $2 [rule 2]
[2] = $3 - $1 == $2 [rule 2]
[3] = $3 - $1 == $2 [rule 2]
[4] = $3 - $1 == $2 [rule 2]

-- lalu dimasukan 4 nilai lagi
bank = $8 - $4 = $4
[1]  = $2 - $1 = $1
[2]  = $2 - $1 = $1
[3]  = $2 - $1 = $1
[4]  = $2 - $1 = $1
[5]  = $3 [rule 1] >> $3 - $1 = $2 [rule 2]
[6]  = $3 [rule 1] >> $3 - $1 = $2 [rule 2]
[7]  = $3 [rule 1] >> $3 - $1 = $2 [rule 2]
[8]  = $3 [rule 1] >> $3 - $1 = $2 [rule 2]

maka bank
bank = $4 + $8 = 12 [rule 3]
[1] = $2
[2] = $2
[3] = $2
[4] = $2
[5] = $2
[6] = $2
[7] = $2
[8] = $2

dan seterusnya
sehingga kesimpulannya 

saldo bank $12 >= 0 
Amortized O($3) ini sama dengan O(1)