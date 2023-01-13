pluginManagement {
    repositories {
        gradlePluginPortal()
/*        maven {
            url = uri("https://repo.gradle.org/gradle/enterprise-libs-snapshots-local")
            credentials {
                username = System.getenv("ARTIFACTORY_USERNAME") ?: settings.extra.get("enterprise.snapshots.username").toString()
                password = System.getenv("ARTIFACTORY_PASSWORD") ?: settings.extra.get("enterprise.snapshots.password").toString()
            }
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
*/        
        mavenLocal()
        maven {
            url = uri("https://repo.gradle.org/gradle/enterprise-libs-release-candidates-local/")
        }
     
}

}

plugins {
    id("com.gradle.enterprise") version "3.11.4"

    // The version number has to be adjusted here after each major release.
    // id("com.gradle.enterprise.test-distribution") version ("2.3.5")
}

gradleEnterprise {
    buildScan {
        server = "https://events.gradle.com"
        //    if (System.getProperty("SMOKE_TEST") != null) "https://ge-unstable.grdev.net" else "https://ge-experiment.grdev.net"
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
    }
}

rootProject.name = "quick-demo"
