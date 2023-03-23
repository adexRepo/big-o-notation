## Time Complexity
misalkan ada sebuah box dikirim dari jakarta ke bogor menggunakan sepeda motor
sepeda motor dapat mengakut 1 box dalam waktu 1 jam, dan ini membutuhkan waktu 1 jam

waktu 1 jam disini adalah time kompleksiti yang diperlukan dalam proses mengantar 1 buah box 
case diatas itu [O(1)] --> karena satu box doang dan sudah fix

----
but jikalau box yang adalah 3 / 5 / n maka waktu yang dibutuhkan adalah
1 jam x 3 = 3 jam == butuh waktu 3 jam untuk 3 box == ga efisien kalo pakai motor karena motor cuman 1 box per perjalanan
1 jam x 5 = 5 jam == butuh waktu 5 jam untuk 5 box == ga efisien kalo pakai motor karena motor cuman 1 box per perjalanan
1 jam x n = N jam == butuh waktu N jam untuk n box == ga efisien kalo pakai motor karena motor cuman 1 box per perjalanan

pada case ini big o notation nya adalah 
3 box = O(3) == O(1) == konstant
5 box = O(5) == O(1) == konstant
n box = O(N) == O(N) == linear
