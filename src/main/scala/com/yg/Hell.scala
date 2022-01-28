package com.yg
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

import java.util.Properties

object Hell {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("Mysql Selection")
      .setMaster("local")

    val spark = SparkSession.builder.config(conf).getOrCreate()

    val prop = new Properties()
    prop.put("user", "root")
    prop.put("password", "18651865")

    val tableDf = spark.read.jdbc("jdbc:mysql://localhost:13306/horus?" +
      "useUnicode=true&characterEncoding=utf8&useSSL=false",
      "crawl_unit1", prop)
//    tableDf.createOrReplaceTempView("tempTable")
    tableDf.show(10)

    println("Changed Query ..")
    tableDf.createOrReplaceTempView("aya")
    tableDf.sqlContext.sql("select * from aya where CRAWL_NO > 1000").show(10)

    println("Successfully Finished ..")
  }
}
