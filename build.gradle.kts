plugins {
    application
    kotlin("jvm") version "1.4.20"
}

group = "me.mataha"
version = "1.0-SNAPSHOT"

application {
    mainClass.value("me.mataha.gradle.windows.exit.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
