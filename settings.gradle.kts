dependencyResolutionManagement {
    versionCatalogs {
        register("libs") {
            from(files("dependencies.toml"))
        }
    }
}

rootProject.name = "kotlin-everywhere"

include("react-components")
include("server")
include("shared")
include("web-app")
