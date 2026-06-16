rootProject.name = "java-kotlin-training"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(
    "modules:java-core",
    "modules:java-domain"
)
