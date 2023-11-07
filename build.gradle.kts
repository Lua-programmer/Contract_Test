plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "io.github.luaprogrammer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.rest-assured:json-schema-validator:3.0.0")
    testImplementation("io.rest-assured:rest-assured:5.3.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}