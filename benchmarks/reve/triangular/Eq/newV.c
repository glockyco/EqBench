int g(int n, int s)
{
  int r;
  r = 0;
  if (n <= 0) {
    r = s;//change
  } else {
    r = g(n - 1, n + s);//change
  }
  return r;
}
int triangle(int n) {
  int r;
  r = g(n, 0);//change
  return r;
}