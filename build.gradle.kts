import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.toolchain.JavaLanguageVersion

allprojects {
    group = "dev.training"
    version = "0.1.0-SNAPSHOT"
}

val javaVersion = libs.versions.java.get().toInt()
val junitBom = libs.junit.bom
val junitJupiter = libs.junit.jupiter
val assertjCore = libs.assertj.core
val junitPlatformLauncher = libs.junit.platform.launcher

subprojects {
    apply(plugin = "java")

    extensions.configure<JavaPluginExtension> {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(javaVersion))
        }
    }

    dependencies {
        "testImplementation"(platform(junitBom))
        "testImplementation"(junitJupiter)
        "testImplementation"(assertjCore)
        "testRuntimeOnly"(junitPlatformLauncher)
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
