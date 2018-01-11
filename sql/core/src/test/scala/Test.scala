import org.apache.spark.sql.SparkSession

/**
  * Created by Administrator on 2017/6/12.
  */
object Test {
  def main(args: Array[String]): Unit = {

    val session: SparkSession = SparkSession.builder().master("local[*]").appName("lol").getOrCreate()
    val arr =List(List(1),List(2))
    val ints: List[Int] = arr.flatMap(x=>x)
    println(ints)
  }
}
