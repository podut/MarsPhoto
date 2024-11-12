plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false
    id("org.sonarqube") version "5.1.0.4882"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

sonarqube {
    properties {
        property("sonar.projectKey", "MarsPhoto")
        property("sonar.projectName", "MarsPhoto")
        property("sonar.host.url", System.getenv("SONAR_HOST_URL") ?: "http://192.168.0.100:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN") ?: "your_sonar_token_here")
    }
}
