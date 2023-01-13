plugins {
    `java-library`
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.7.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.test {
    onlyIf { true }
    useJUnitPlatform()
    //maxParallelForks = 2
    testLogging {
        events("PASSED", "FAILED", "SKIPPED")
        events ("SKIPPED")
        displayGranularity = 1
    }
     predictiveSelection {
         enabled.set(true)
     }
    distribution {
        maxLocalExecutors.set(0)
        enabled.set(true)
    }

    outputs.upToDateWhen { true }
    outputs.cacheIf { true }
    finalizedBy(tasks.jacocoTestReport)

   // doLast {
   //     System.out.println("\nPredictive Test Selection: 12 test classes selected, 23 test classes not selected (saving 1h 9m 53s)")
   // }

}
tasks.jacocoTestReport {
    dependsOn(tasks.test)
}

fun isSmokeTest(): Boolean = System.getProperties().contains("SMOKE_TEST")
