import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.kotlin.dsl.extra
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

group = "xctest_parser"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        classpath(Plugins.KOTLIN)
    }
}

plugins {
    application
    jacoco
    // TODO: https://github.com/TestArmada/flank/issues/195
    kotlin("jvm") version Versions.KOTLIN
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

apply {
    plugin("kotlin")
}

application {
    mainClassName = "main"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    compile(Libs.KOTLIN_STD_LIB)
}

val javaVersion = "1.8"
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = javaVersion
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = javaVersion
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
