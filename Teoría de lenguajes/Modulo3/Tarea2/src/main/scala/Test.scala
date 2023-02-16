object Test {

  // No Cambiar este Método, es el caso de prueba
  def main(args: Array[String]): Unit = {
    val Numero = scala.io.StdIn.readInt()
    if (Numero < 8) println(result(Numero)) else result(Numero)
  }


  val f2: (Double, Double, Double) => Boolean = (a: Double, b: Double, c: Double) => a + b > c;

  def verificarTriangulo: ((Double, Double, Double) => Boolean, Double, Double, Double) => Boolean =
    (f: (Double, Double, Double) => Boolean, a: Double, b: Double, c: Double) => f(a, b, c) && f(b, c, a) && f(c, a, b);

  def reverse: String => String = (a: String) => a.reverse;

  def palindromo: (String => String, String) => Boolean = (r: String => String, a: String) => a.equals(r(a));

  val filtro: Char => Boolean = (a: Char) => Array('a', 'e', 'i', 'o', 'u').count((x) => x.equals(a)) == 1;

  def vocal1: (Char => Boolean, String) => String = (f: Char => Boolean, word: String) => word.filter(f);

  def vocal2: (Char => Boolean, String) => String = (f: Char => Boolean, word: String) =>
    word.map(f = (x) => if (f(x)) {
      x;
    }
    else {
      ' ';
    }).split(' ').mkString("");

  def vocal3 = (f: Char => Boolean, word: String) => word.foreach((x) => if (f(x)) {
    print(x);
  })

  //añada aqui en comentarios los casos de prueba que utilizo y  que imprime.

  //No borrar, esto sirve para que minaslap pueda hacer la evaluacion atumatica
  var result = (x: Int) => x match {
    case 1 => verificarTriangulo(f2, 1, 3, 2) && verificarTriangulo(f2, 8, 3, 20)
    case 2 => verificarTriangulo(f2, 4, 3, 2)
    case 4 => palindromo(reverse, "annitalavalatinna") && palindromo(reverse, "allivesasevilla") && palindromo(reverse, "allisimariaavisayasivaairamisilla")
    case 7 => palindromo(reverse, "noespalindromo")
    case 8 => print(vocal1(filtro, "hola"))
    case 9 => print(vocal2(filtro, "suanaoria"))
    case 10 => vocal3(filtro, "quevivaeldoctor")
  }

}