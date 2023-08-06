object Q_3 {
  def main(args: Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val inputString = scala.io.StdIn.readLine()
    val integersList = inputString.split(" ").map(_.toInt).toList

    print("Prime number List : " + filterPrime(integersList))
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1)
      false
    else if (n == 2)
      true
    else
      !(2 until n).exists(x => n % x == 0)
  }
}
