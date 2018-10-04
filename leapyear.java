class leapyear {
  public static void main(String[] args) {
  for (int leapYear = 1900; leapYear <= 2020;
  leapYear += 4) {
  if((leapYear - 1) % 40 == 0) {
  System.out.print(leapYear + " ");
  }
 }
}
}
