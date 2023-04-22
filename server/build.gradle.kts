plugins {
    application
    java
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("io.github.oesolutions.server.Server")
}
