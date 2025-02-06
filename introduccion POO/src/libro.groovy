plugins {
    id 'java'
    id 'groovy'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.codehaus.groovy:groovy-all:3.0.9'
    implementation 'com.google.code.gson:gson:2.11.0'//ultima version
    implementation 'com.google.api-client:google-api-client:1.32.1'
    implementation 'com.google.oauth-client:google-oauth-client:1.32.1'
    implementation 'com.google.http-client:google-http-client:1.39.2'
    implementation 'com.google.http-client:google-http-client-gson:1.39.2'
}