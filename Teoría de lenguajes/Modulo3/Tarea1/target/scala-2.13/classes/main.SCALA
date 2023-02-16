object Test {
  //Desarrollar las siguientes funciones anónimas y asignarlas a las constantes

  //(val) siguientes:

  //1 – val mcd (máximo común divisor) de 3 números.

  //2 – val celsius que convierte grados fahrenheit a celsius a.

  //3 – val millas que convierte kms en millas.(un kilometro equivale a 0.62137 millas)

  //4 – val area_circulo: devuelve el area de un círculo a partir del radio. (use como valor de pi=3.1416)

  //5 – Crear una funcion anónima para hacer una tasa de cambio (Euros A Pesos Colombianos) Utilizando la siguiente conversion: 1 Euro = 4.384,32 Pesos Colombianos

  //(val).

  // No Cambiar este Método, es el caso de prueba
  def main(args: Array[String]) {
    val Numero = scala.io.StdIn.readInt()
    println(result(Numero))
  }


  val mcd1: (Int, Int, Int) => Int = (n1: Int, n2: Int, n3: Int) => mcd(mcd(n1, n2), n3);

  def mcd(n1: Int, n2: Int): Int = {
    if (n2 != 0) {
      return mcd(n2, n1 % n2)
    } else {
      return n1;
    };
  }

  val celsius: Double => Double = (f:Double)=> (f-32)*(5/9);

  val millas: Double => Double = (k: Double) => k * 0.62137;

  val area_circulo: Double => Double = (r: Double)=> r*r*3.1416;

  val Pesos: Double => Double = (e: Double)=> e*4384.32;

  //No borrar, esto sirve para que minaslap pueda hacer la evaluacion atumatica
  var result = (x: Int) => x match {
    case 1 => List(mcd1(25, 50, 15), mcd1(5, 7, 11), mcd1(100, 10, 50))
    case 4 => List(celsius(0), celsius(32), celsius(100))
    case 7 => List(millas(100), millas(666), millas(333))
    case 10 => List(area_circulo(10), area_circulo(100), area_circulo(666))
    case 13 => List(Pesos(1), Pesos(1000), Pesos(666))

  }
}
