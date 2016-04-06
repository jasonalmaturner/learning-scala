object HelloWorld {
  val me : String = "Jason Turner";
  def main (args: Array[String]) {
    println(me)
    things.sayName();
    things.loopName();
    println(addStuff.addInt(5, 6));
  }
}

object things {
  val disMe : String = "Jason";
  def sayName () {
    println(disMe);
  }

  def loopName () {
    var i = 0;
    for (i <- 0 to 10) {
      println(disMe + " " + i);
    }
  }
}

object addStuff {
  def addInt(a:Int = 0, b:Int = 0) : Int = {
    var sum:Int = 0;
    sum = a + b;

    return sum;
  }
}
