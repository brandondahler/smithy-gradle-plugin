// This example builds the model and places it in the JAR.

plugins {
    `java-library`
    id("smithy-jar").version("0.7.0")
}

repositories {
    mavenLocal()
    mavenCentral()
}

smithy {
    tags.addAll("Foo", "com.baz:bar")
}