int f(int i, int j)
{
  int r;
  r = 0;
  if (i == 0) {
    r = j;
  } else {
    if (i == 1) {//change
      r = j + 1;//change
    } else {//change
      if (i == 2) {//change
      r = j;//change
    } else {//change
      r = f(i - 1, j + 1);
    }}
  }
  return r;
}
