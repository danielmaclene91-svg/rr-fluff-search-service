plugins {
  kotlin("jvm") version "1.4.0"
}

dependencies {
  implementation("org.elasticsearch:elasticsearch:7.10.0")
  implementation("org.apache.lucene:lucene-core:8.6.0")
  implementation("ch.qos.logback:logback-classic:1.2.0")
  implementation("io.ktor:ktor-server-core:1.4.0")
  implementation("io.ktor:ktor-server-netty:1.4.0")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.0")
}