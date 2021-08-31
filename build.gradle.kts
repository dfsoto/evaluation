apply(plugin = "java")
apply(plugin = "idea")
apply(plugin = "net.serenity-bdd.aggregator")

version "1.0-SNAPSHOT"

var sourceCompatibility = 1.8

repositories {
    mavenCentral()
}
buildscript {
    repositories {

        mavenCentral()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:2.4.2")
    }
}
ext {
    var serenityVersion = "2.5.0"
    var serenityCucumberVersion = "1.9.51"
}

dependencies { "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.7.2")
    "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    "implementation"("net.serenity-bdd:serenity-gradle-plugin:2.4.34")
    "implementation"("net.serenity-bdd:serenity-screenplay-rest:2.5.6")
    "implementation"("net.serenity-bdd:serenity-cucumber:1.9.51")
    "implementation"("io.cucumber:cucumber-core:6.10.2")
    "testImplementation"("org.assertj:assertj-core:3.20.2")
    "testImplementation"("org.slf4j:slf4j-simple:1.7.32")
    "testImplementation"("io.cucumber:cucumber-java:6.10.4")
    "testImplementation"("io.cucumber:cucumber-junit:6.11.0")
}

gradle.startParameter.isContinueOnFailure = true