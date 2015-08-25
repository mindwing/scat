package scat

/**
 * Created by mindwing on 2015-08-25.
 */
object Find {
  def find(args: Array[String]) = {
    if (args.length >= 2) {
      JFind.find(args(1))
    } else {
      "[err] lack of argument"
    }
  }
}
