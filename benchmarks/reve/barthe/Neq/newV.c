int f(int n, int c) {
   int i;
   int j;
   int x;
   i = 0;
   j = c;//change
   x = 0;
   while(i < n) {
      x = x + j;
      j = j + 5;//change
      if (i == 10) {//change
        j = 10;//change
      }
      i++;
   }
   return x;
}