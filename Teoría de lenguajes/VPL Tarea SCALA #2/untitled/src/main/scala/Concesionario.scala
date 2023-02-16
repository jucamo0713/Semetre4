/* SOFASA considera en su linea de ensamble y mantenimiento de automóviles,
de tres tipos de Sandero: Stepway, Aventure y Track.

Para la Línea de ensamble es indispensable calcular las siguientes
características de la ficha técnica, las cuales dependen del cilindraje
en centimetros cúbicos (cc) y la cantidad de válvulas (cv) del motor,
Cantidad de KM recorridos (cKM) y año del modelo (mod). Para los cálculos
se considera como año de referencia (aRef) el 2018.

Además, cada característica depende de una constante estimada para cada tipo
de automovi (kAuto).

pesoMxChasis está dado en toneladas, y se define como: (cc / cv * 0.7) + (cv * kAuto)
vidaUtilBandas está dado en KM, y se define como: (cKM / (aRef - mod)) * kauto
caballosFuerzaDesgaste está dado en HP, y se define como: (cc * cv) / (aRef - mod) + cKM * kAuto

Para el Stepway, kAuto es 0.012
Para el Aventure, kAuto es 0.048
Para el Track, kAuto es 0.271

La siguiente es una posible implementación mediante programación Funcional en Escala.
Por favor completa los espacios solicitados.
*/

object Concesionario {

  //PUNTO REGEX NO BORRAR ESTE CODIGO

  import scala.util.matching.Regex

  case class Vehiculo(nombre: String, color: String, placa: String)

  // la lista de vehiculos
  val fruit = List(Vehiculo("VPL", "rojo", "LCE88B"), Vehiculo("VPL", "rojo", "L0CW883"), Vehiculo("VPL", "rojo", "ABPH000"), Vehiculo("VPL", "rojo", "LCW88A"), Vehiculo("VPL", "rojo", "LLL1112"),
    Vehiculo("VPL", "rojo", "LCW883"), Vehiculo("VPL", "rojo", "MCM81I"), Vehiculo("VPL", "rojo", "UDU276"), Vehiculo("VPL", "rojo", "DBD31B"), Vehiculo("VPL", "rojo", "BZW693"), Vehiculo("VPL", "rojo", "EDH74d"),
    Vehiculo("VPL", "rojo", "SFE04Z"), Vehiculo("VPL", "rojo", "EDH74V"), Vehiculo("VPL", "rojo", "WYJ555"), Vehiculo("VPL", "rojo", "aAA123"), Vehiculo("VPL", "rojo", "HVI938"),
    Vehiculo("VPL", "rojo", "URY248"), Vehiculo("VPL", "rojo", "TAY31S"), Vehiculo("VPL", "rojo", "TAY32S"), Vehiculo("VPL", "rojo", "VMH106"), Vehiculo("VPL", "rojo", "YYN85U"),
    Vehiculo("VPL", "rojo", "A1A2A3"), Vehiculo("VPL", "rojo", "ETM64L"), Vehiculo("VPL", "rojo", "EEEEEEEEEEEEEOOOOOOOOOOO123"))

  def MotoCarro(v: Vehiculo): String = {
    val patternCarro = new Regex("[A-Z]{3}[0-9]{3}");
    val patternMoto = new Regex("[A-Z]{3}[0-9]{2}[A-Z]{1}");
    if (v.placa.length == 6) patternCarro.findAllIn(v.placa).length match {
      case 1 => "Es un Carro"
      case 0 => patternMoto.findAllIn(v.placa).length match {
        case 1 => "Es una Moto"
        case 0 => "Placa no reconocida"
      }
    } else "Placa no reconocida";
  } //funcion para determinar si es un carro o moto o ninguna de las 2

  val respuestapunto4: List[String] = for (i <- fruit) yield MotoCarro(i); //Aqui va el YIELD para que imprima la respuesta del punto 4


  // No Cambiar este Método, es el caso de prueba

  def main(args: Array[String]) {
    //cc,cv,cKM,mod
    def lSanderos = List(Stepway(1600, 16, 90221, 2011), Aventure(1600, 16, 90221, 2011), Track(1600, 16, 90221, 2011),
      Stepway(1600, 8, 15000, 2016), Aventure(1600, 16, 50000, 2011), Track(1200, 16, 100221, 2010),
      Aventure(1800, 8, 54685, 2013), Track(1100, 16, 9000, 2013), Aventure(1600, 16, 15488, 2014), Track(1400, 16, 2000, 2016))

    val aSanderos = calculadoraSanderos.calCaracteristicas(lSanderos)
    val Numero = scala.io.StdIn.readInt()
    if (Numero == 1) {
      aSanderos.foreach { f => println(f.getCaracteristicas()) }
    } else {
      println(result(Numero))
    }

  }

  var result = (x: Int) => x match {
    case 2 => respuestapunto4
  }

  def redondeo(numero: Double): Double = {
    BigDecimal(numero).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  abstract class Sandero(cc: Int, cv: Int, cKM: Int, mod: Double) {
    val kAuto: Double

    def pesoMxChasis: Double = ((cc.doubleValue() / cv.doubleValue) * 0.7) + (cv.doubleValue * kAuto)

    def vidaUtilBandas: Double = (cKM.doubleValue() / (2018 - mod)) * kAuto

    def caballosFuerzaDesgaste: Double = (cc.doubleValue() * cv.doubleValue()) / (2018 - mod) + cKM.doubleValue() * kAuto

    def getCaracteristicas(): String
  }

  //Para las case class se considera el siguiente orden (cc,cv,cKM,mod)

  case class Stepway(cc: Int, cv: Int, cKM: Int, mod: Double) extends Sandero(cc, cv, cKM, mod) {
    override val kAuto: Double = 0.012;

    override def getCaracteristicas(): String = {
      "Stepway, modelo: " + this.mod + " | Chasis Mx: " + redondeo(this.pesoMxChasis) + " Ton, Bandas: " + redondeo(this.vidaUtilBandas) + " km, C.F. Desgaste: " + redondeo(this.caballosFuerzaDesgaste) + " HP."
    }
  }; //Completa esta clase -----------------------------------
  //Ej de retorno para getCaracteristicas(), si Stepway(1600,16,90221,2011):
  // Stepway, modelo: 2011 | Chasis Mx: 70.192 Ton, Bandas: 154.665 km, C.F. Desgaste: 4739.795 HP.

  case class Aventure(cc: Int, cv: Int, cKM: Int, mod: Double) extends Sandero(cc, cv, cKM, mod) {
    override val kAuto: Double = 0.048;

    override def getCaracteristicas(): String = {
      "Aventure, modelo: " + this.mod + " | Chasis Mx: " + redondeo(this.pesoMxChasis) + " Ton, Bandas: " + redondeo(this.vidaUtilBandas) + " km, C.F. Desgaste: " + redondeo(this.caballosFuerzaDesgaste) + " HP."
    }
  }; //Completa esta clase ----------------------------------
  //Ej de retorno para getCaracteristicas(), si Aventure(1600,16,90221,2011):
  //Aventure, modelo: 2011 | Chasis Mx: 70.768 Ton, Bandas: 618.658 km, C.F. Desgaste: 7987.751 HP.

  case class Track(cc: Int, cv: Int, cKM: Int, mod: Double) extends Sandero(cc, cv, cKM, mod) {
    override val kAuto: Double = 0.271;

    override def getCaracteristicas(): String = {
      "Track, modelo: " + this.mod + " | Chasis Mx: " + redondeo(this.pesoMxChasis) + " Ton, Bandas: " + redondeo(this.vidaUtilBandas) + " km, C.F. Desgaste: " + redondeo(this.caballosFuerzaDesgaste) + " HP."
    }
  }; //Completa esta clase -------------------------------------
  //Ej de retorno para getCaracteristicas(), si Track(1600,16,90221,2011):
  //Track, modelo: 2011 | Chasis Mx: 74.336 Ton, Bandas: 3492.842 km, C.F. Desgaste: 28107.034 HP.


  object calculadoraSanderos {
    def calCaracteristicas(lSanderos: List[Sandero]): List[Sandero] = lSanderos.map(x => x)
  }
}