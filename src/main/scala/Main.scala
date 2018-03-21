import hw.streams.Generator

object Main extends hw.streams.SolutionLike { // do not change this line

  // This helper function is very useful
  def cons[A](head: A, tail: =>Generator[A]): Generator[A] = new Generator[A] {
    def next() = (head, tail)
  }

  // The example from the project description
  val ones: Generator[Int] = cons(1, ones)

  def from(x: Int): Generator[Int] = ???

  def map[A,B](f: A => B, agen: Generator[A]): Generator[B] = ???

  val pow: Generator[Int] = ones // replace

  def nth[A](agen: Generator[A], index: Int): A = ???

  def filter[A](pred: (A) => Boolean, agen: Generator[A]): Generator[A] = ???

  def interleave[A](agen1: Generator[A], agen2: Generator[A]): Generator[A] = ???

  def sift(n: Int, agen: Generator[Int]): Generator[Int] = ???

  val prime: Generator[Int] = ones // replace

  def total(agen: Generator[Double]): Generator[Double] = ???
}