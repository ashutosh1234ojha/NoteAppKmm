buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("com.squareup.sqldelight:gradle-plugin:1.5.3")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

//plugins {
//    //trick: for the same plugin versions in all sub-modules
//    id("com.android.application").version("7.4.0").apply(false)
//    id("com.android.library").version("7.4.0").apply(false)
//    id("com.google.dagger.hilt.android") version "2.42" apply false
////    id("org.jetbrains.kotlin.multiplatform") version "1.3.41" apply false
//    id("com.squareup.sqldelight") version "1.5.3" apply false
////    id("app.cash.sqldelight") version "2.0.0-alpha05" apply false
//
//
//
//    kotlin("android").version("1.8.0").apply(false)
//    kotlin("multiplatform").version("1.8.0").apply(false)
//}
//
//tasks.register("clean", Delete::class) {
//    delete(rootProject.buildDir)
//}
