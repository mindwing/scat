/**
 * Created by mindwing on 2015-08-25.
 */
object Scat {
  def main(args: Array[String]) {
    val firstArg = if (!args.isEmpty) args(0) else ""

    val result =
      firstArg match {
        case "find" => Find.find(args)
        case "help" => Help.help
        case _ => Help.error
      }

    println(result)
  }
}
