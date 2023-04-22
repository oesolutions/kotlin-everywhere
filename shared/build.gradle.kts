plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js(IR) {
        browser()
        binaries.library()
    }
}
