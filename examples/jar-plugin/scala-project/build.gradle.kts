// This project adds smithy models to a JAR created by a Kotlin project

plugins {
    scala
    id("software.amazon.smithy.gradle.smithy-jar").version("0.10.1")
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.11")
}

repositories {
    mavenLocal()
    mavenCentral()
}
