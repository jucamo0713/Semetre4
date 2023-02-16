object Test {

  // No Cambiar este Método, es el caso de prueba
  def main(args: Array[String]) {
    val Numero = scala.io.StdIn.readInt()
    println(result(Numero))

  }


  def concatenacion(a: List[_], list: List[_]): List[Any] = {
    a.map(_ + list.head.toString)
  }

  def potencia(a: List[_]): List[Any] = {
    if (a.size > 1) {
      val cola = potencia(a.tail)
      cola ::: concatenacion(cola, a) ::: List(a.head)
    } else a.head.toString.toList
  }


  def permutacion(n: Int, l: List[_]): List[List[_]] = (l, n) match {
    case (Nil, _) => List(List())
    case (head :: tail, n) => {
      val len = n
      val mapeo = (0 to len - 1).map(l.splitAt(_)).toList.filter(filtro => !filtro._1.contains(filtro._2.head))
      mapeo.flatMap(i => permutacion(n - 1, i._1 ::: i._2.tail).map(i._2.head :: _))
    }
  }

  import scala.math

  def sucesion(n: Int, c: Double, l: List[Double]): List[Double] = {
    if (n != 0) {
      var ant = sucesion(n - 1, c, l);
      return ((math.pow(ant.head, 2) + ant.head - 1) / (ant.head + c)) :: ant;
    } else {
      return List(0);
    }
  }

  def sucesiontail(n: Int, c: Double, l: List[Double]): List[Double] = {
    if (l.isEmpty) {
      return sucesiontail(n, c, 0 :: l);
    } else if (l.length <= n) {
      return sucesiontail(n, c, ((math.pow(l.head, 2) + l.head - 1) / (l.head + c)) :: l);
    } else {
      return l;
    }
  }

  //No borrar, esto sirve para que minaslap pueda hacer la evaluacion atumatica
  var Juan = "Juan"
  var Anamaria = "Anamaria"
  var Pablo = "Pablo"
  var Sofía = "Sofía"
  var Alejandro = "Alejandro"
  var a = 'a'
  var b = 'b'
  var c = 'c'
  var d = 'd'
  var e = 'e'
  var x = List(List(Juan, Anamaria, Pablo, Sofía, Alejandro), List(Juan, Anamaria, Pablo, Alejandro, Sofía), List(Juan, Anamaria, Sofía, Pablo, Alejandro), List(Juan, Anamaria, Sofía, Alejandro, Pablo), List(Juan, Anamaria, Alejandro, Pablo, Sofía), List(Juan, Anamaria, Alejandro, Sofía, Pablo), List(Juan, Pablo, Anamaria, Sofía, Alejandro), List(Juan, Pablo, Anamaria, Alejandro, Sofía), List(Juan, Pablo, Sofía, Anamaria, Alejandro), List(Juan, Pablo, Sofía, Alejandro, Anamaria), List(Juan, Pablo, Alejandro, Anamaria, Sofía), List(Juan, Pablo, Alejandro, Sofía, Anamaria), List(Juan, Sofía, Anamaria, Pablo, Alejandro), List(Juan, Sofía, Anamaria, Alejandro, Pablo), List(Juan, Sofía, Pablo, Anamaria, Alejandro), List(Juan, Sofía, Pablo, Alejandro, Anamaria), List(Juan, Sofía, Alejandro, Anamaria, Pablo), List(Juan, Sofía, Alejandro, Pablo, Anamaria), List(Juan, Alejandro, Anamaria, Pablo, Sofía), List(Juan, Alejandro, Anamaria, Sofía, Pablo), List(Juan, Alejandro, Pablo, Anamaria, Sofía), List(Juan, Alejandro, Pablo, Sofía, Anamaria), List(Juan, Alejandro, Sofía, Anamaria, Pablo), List(Juan, Alejandro, Sofía, Pablo, Anamaria), List(Anamaria, Juan, Pablo, Sofía, Alejandro), List(Anamaria, Juan, Pablo, Alejandro, Sofía), List(Anamaria, Juan, Sofía, Pablo, Alejandro), List(Anamaria, Juan, Sofía, Alejandro, Pablo), List(Anamaria, Juan, Alejandro, Pablo, Sofía), List(Anamaria, Juan, Alejandro, Sofía, Pablo), List(Anamaria, Pablo, Juan, Sofía, Alejandro), List(Anamaria, Pablo, Juan, Alejandro, Sofía), List(Anamaria, Pablo, Sofía, Juan, Alejandro), List(Anamaria, Pablo, Sofía, Alejandro, Juan), List(Anamaria, Pablo, Alejandro, Juan, Sofía), List(Anamaria, Pablo, Alejandro, Sofía, Juan), List(Anamaria, Sofía, Juan, Pablo, Alejandro), List(Anamaria, Sofía, Juan, Alejandro, Pablo), List(Anamaria, Sofía, Pablo, Juan, Alejandro), List(Anamaria, Sofía, Pablo, Alejandro, Juan), List(Anamaria, Sofía, Alejandro, Juan, Pablo), List(Anamaria, Sofía, Alejandro, Pablo, Juan), List(Anamaria, Alejandro, Juan, Pablo, Sofía), List(Anamaria, Alejandro, Juan, Sofía, Pablo), List(Anamaria, Alejandro, Pablo, Juan, Sofía), List(Anamaria, Alejandro, Pablo, Sofía, Juan), List(Anamaria, Alejandro, Sofía, Juan, Pablo), List(Anamaria, Alejandro, Sofía, Pablo, Juan), List(Pablo, Juan, Anamaria, Sofía, Alejandro), List(Pablo, Juan, Anamaria, Alejandro, Sofía), List(Pablo, Juan, Sofía, Anamaria, Alejandro), List(Pablo, Juan, Sofía, Alejandro, Anamaria), List(Pablo, Juan, Alejandro, Anamaria, Sofía), List(Pablo, Juan, Alejandro, Sofía, Anamaria), List(Pablo, Anamaria, Juan, Sofía, Alejandro), List(Pablo, Anamaria, Juan, Alejandro, Sofía), List(Pablo, Anamaria, Sofía, Juan, Alejandro), List(Pablo, Anamaria, Sofía, Alejandro, Juan), List(Pablo, Anamaria, Alejandro, Juan, Sofía), List(Pablo, Anamaria, Alejandro, Sofía, Juan), List(Pablo, Sofía, Juan, Anamaria, Alejandro), List(Pablo, Sofía, Juan, Alejandro, Anamaria), List(Pablo, Sofía, Anamaria, Juan, Alejandro), List(Pablo, Sofía, Anamaria, Alejandro, Juan), List(Pablo, Sofía, Alejandro, Juan, Anamaria), List(Pablo, Sofía, Alejandro, Anamaria, Juan), List(Pablo, Alejandro, Juan, Anamaria, Sofía), List(Pablo, Alejandro, Juan, Sofía, Anamaria), List(Pablo, Alejandro, Anamaria, Juan, Sofía), List(Pablo, Alejandro, Anamaria, Sofía, Juan), List(Pablo, Alejandro, Sofía, Juan, Anamaria), List(Pablo, Alejandro, Sofía, Anamaria, Juan), List(Sofía, Juan, Anamaria, Pablo, Alejandro), List(Sofía, Juan, Anamaria, Alejandro, Pablo), List(Sofía, Juan, Pablo, Anamaria, Alejandro), List(Sofía, Juan, Pablo, Alejandro, Anamaria), List(Sofía, Juan, Alejandro, Anamaria, Pablo), List(Sofía, Juan, Alejandro, Pablo, Anamaria), List(Sofía, Anamaria, Juan, Pablo, Alejandro), List(Sofía, Anamaria, Juan, Alejandro, Pablo), List(Sofía, Anamaria, Pablo, Juan, Alejandro), List(Sofía, Anamaria, Pablo, Alejandro, Juan), List(Sofía, Anamaria, Alejandro, Juan, Pablo), List(Sofía, Anamaria, Alejandro, Pablo, Juan), List(Sofía, Pablo, Juan, Anamaria, Alejandro), List(Sofía, Pablo, Juan, Alejandro, Anamaria), List(Sofía, Pablo, Anamaria, Juan, Alejandro), List(Sofía, Pablo, Anamaria, Alejandro, Juan), List(Sofía, Pablo, Alejandro, Juan, Anamaria), List(Sofía, Pablo, Alejandro, Anamaria, Juan), List(Sofía, Alejandro, Juan, Anamaria, Pablo), List(Sofía, Alejandro, Juan, Pablo, Anamaria), List(Sofía, Alejandro, Anamaria, Juan, Pablo), List(Sofía, Alejandro, Anamaria, Pablo, Juan), List(Sofía, Alejandro, Pablo, Juan, Anamaria), List(Sofía, Alejandro, Pablo, Anamaria, Juan), List(Alejandro, Juan, Anamaria, Pablo, Sofía), List(Alejandro, Juan, Anamaria, Sofía, Pablo), List(Alejandro, Juan, Pablo, Anamaria, Sofía), List(Alejandro, Juan, Pablo, Sofía, Anamaria), List(Alejandro, Juan, Sofía, Anamaria, Pablo), List(Alejandro, Juan, Sofía, Pablo, Anamaria), List(Alejandro, Anamaria, Juan, Pablo, Sofía), List(Alejandro, Anamaria, Juan, Sofía, Pablo), List(Alejandro, Anamaria, Pablo, Juan, Sofía), List(Alejandro, Anamaria, Pablo, Sofía, Juan), List(Alejandro, Anamaria, Sofía, Juan, Pablo), List(Alejandro, Anamaria, Sofía, Pablo, Juan), List(Alejandro, Pablo, Juan, Anamaria, Sofía), List(Alejandro, Pablo, Juan, Sofía, Anamaria), List(Alejandro, Pablo, Anamaria, Juan, Sofía), List(Alejandro, Pablo, Anamaria, Sofía, Juan), List(Alejandro, Pablo, Sofía, Juan, Anamaria), List(Alejandro, Pablo, Sofía, Anamaria, Juan), List(Alejandro, Sofía, Juan, Anamaria, Pablo), List(Alejandro, Sofía, Juan, Pablo, Anamaria), List(Alejandro, Sofía, Anamaria, Juan, Pablo), List(Alejandro, Sofía, Anamaria, Pablo, Juan), List(Alejandro, Sofía, Pablo, Juan, Anamaria), List(Alejandro, Sofía, Pablo, Anamaria, Juan))
  var y = List(List(e), List(d, e), List(d), List(c, e), List(c, d, e), List(c, d), List(c), List(b, e), List(b, d, e), List(b, d), List(b, c, e), List(b, c, d, e), List(b, c, d), List(b, c), List(b), List(a, e), List(a, d, e), List(a, d), List(a, c, e), List(a, c, d, e), List(a, c, d), List(a, c), List(a, b, e), List(a, b, d, e), List(a, b, d), List(a, b, c, e), List(a, b, c, d, e), List(a, b, c, d), List(a, b, c), List(a, b), List(a))
  var result: Int => Any = (x: Int) => x match {
    case 1 => potencia(List("a", "b", "c", "d", "e")).toString.canEqual(y)
    case 2 => permutacion(5, List("Juan", "Anamaria", "Pablo", "Sofía", "Alejandro")).canEqual(x)
    case 3 => sucesion(100, 0.182648129123671248912489124789129784789124789, List())
    case 4 => sucesiontail(100, 0.182648129123671248912489124789129784789124789, List())
  }

}