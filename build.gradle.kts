plugins {
    id("java")
    id ("org.openrewrite.rewrite") version "6.28.1" apply false

}

group = "de.sroeck.openrewritereproducer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    // lazily apply open-rewrite to all sub-modules
    plugins.apply("org.openrewrite.rewrite")
}
