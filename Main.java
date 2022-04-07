class Main {
  public static int toplama(int a,int b){
    return a+b;
}
public static void bölme(int a,int b) {
  try {
    int c=0;
    c=a/b;
      System.out.println(c);
  } catch (ArithmeticException e) {
      System.out.println("Sıfıra bölme hatası oluştu");
  }
}
    public static void main(String[] args) {
     
    }
  }