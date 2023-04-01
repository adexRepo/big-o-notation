## Potential Method
sama seperti accounting
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


potensi >= 0

# Formula p(h) = 2N - size
- potensial p dari state(h)
- 2N worst cost dari tabel diatas
- size kapasitas array

# Perhitungan
note : disini hanya dihitung yang 2N saja karena yang paling worst cost disana

[1][2][][] -- size 4 isinya 2
p(h) = 2(N) - size
p(h) = 2(2) - 4 = 0

[1][2][3][] -- size 4 isinya 3
p(h) = 2(N) - size
p(h) = 2(3) - 4 = 2

[1][2][3][4][5][6][7][8][][][][][][][][]  -- size 16 isinya 8 biji
p(h) = 2(N) - size
p(h) = 2(8) - 16 = 0

[...][16][17][18][19][20][][][][][][][...] -- size 32 isinya 20
p(h) = 2(N) - size
p(h) = 2(20) - 32 = 8


# Formula Amortization Potential Method 
<img src="lib\amortitation-potential-method.png" width="128"/>

karena ada 2 yaitu complexity
- O(1) = konstant 
- O(N) = linear
maka perlu diterapkan kepada keduanya

O(1) Case = 
 = C(i)+(2i - size) - (2(i-1) - size)
 = 1 + (2i - size) - (2(i-1) - size)
 = 1 + (2i - size) + (size + 2 - 2i)    ==> algebra
 = 1 + 2i - size + size + 2 - 2i        ==> reduce
 = 1 + 2  = 3

amortization = O(3) atau complexitynya adalah O(1)

O(N) Case = 
 = C(i) + (2i - size) - (2(i-1) - size)
 = C(i+1) + (2i - size) - (2(i-1) - size)  ==> i = operasi pemindahan array dan 1 = memasukkan nilai
 = C(i+1) + (2i - 2i) - (2(i-1) - i)  ==> di O(N) i adalah size (2i karena expansi)
 = i + 1 + 2i - 2i - 2i + 2 - i
 = (1+2-2-2+1)i + (1+2)
 = (0)i + 3 = 3

amortization = O(3) atau complexitynya adalah O(1)