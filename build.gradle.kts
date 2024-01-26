// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        maven { url = uri("https://choquo.com/maven") }
    }
    dependencies{
        classpath("com.chaquo.python:gradle:15.0.1")
        classpath("com.android.tools.build:gradle-api:8.2.2")
    }
}
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.chaquo.python") version "15.0.1" apply false
}