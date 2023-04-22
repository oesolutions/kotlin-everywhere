plugins {
    alias(libs.plugins.kotlin.js)
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform(libs.kotlin.wrappers.bom))
    implementation(libs.kotlin.wrappers.emotion)
    implementation(libs.kotlin.wrappers.react)
    implementation(libs.kotlin.wrappers.react.dom)

    implementation(project(":shared"))
}
kotlin {
    js(IR) {
        browser()
        binaries.library()
    }
}
