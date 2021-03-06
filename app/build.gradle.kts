/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.0/samples
 */

plugins{
    application
}

repositories{
    mavenCentral()
}

dependencies{
    testImplementation("org.testng:testng:7.4.0")

    implementation("com.google.guava:guava:30.0-jre")
}

application{
    mainClass.set("GradleDemo.App")
}

tasks.test{
    useTestNG()
}