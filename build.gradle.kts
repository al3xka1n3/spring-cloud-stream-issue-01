plugins {
    java
}

group = "com.kaine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
        implementation(platform("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR1"))
        implementation("org.springframework.cloud:spring-cloud-starter-stream-kafka")

        implementation(platform("org.springframework.boot:spring-boot-dependencies:2.2.2.RELEASE"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}