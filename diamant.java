class diamant {
 public static void main(String args[]) {

  int a,b,c,d,e,f,g,h,ch,i;
  
  a = 5;
  b = a * 2 + 1;
  d = -a;
  e = 0;
  f = 2;
  g = 0;
  h = a;
  ch = a;
  i = -a;
  
  while (b > 0) {
   b--;

   f--;
   g++;

   ch--;
   i = i + 2;
   System.out.println(" ");
   d = i + ch;
   c = d;

   while (c <= h) {
    System.out.print(" ");
    c++;
        }
    e = g + 1;
    while (e > f) {
     e--;
     System.out.print("O");
   }
  }
 }
}


