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
    implementation(libs.kotlin.wrappers.browser)
    implementation(libs.kotlin.wrappers.react)
    implementation(libs.kotlin.wrappers.react.dom)

    implementation(project(":react-components"))
}

kotlin {
    js(IR) {
        browser {
//            commonWebpackConfig {
//                cssSupport {
//                    enabled.set(true)
//                    mode.set("import")
//                }
//            }
        }
        binaries.executable()
    }
}
