plugins {
    id("com.android.application")
}

android {
    namespace = "com.helloappssyahdan"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.helloappsti22a4"
        minSdk = 26
        targetSdk = 34
        versionCode = 111
        versionName = "1.1.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.paging:paging-common:3.2.1")
    implementation("androidx.media3:media3-ui:1.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    implementation("com.androidx.support:design:22.2.0")
    implementation("androidx.recyclerview:recyclerview:1.1.0")

    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.retrofit2:converter-gson:2.4.0")
    implementation("com.google.code.gson:gson:2.8.5")

    implementation("com.google.android.exoplayer:exoplayer:2.18.7")

}
