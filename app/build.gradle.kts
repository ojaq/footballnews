plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //moshi kotlin codegen
    id("com.google.devtools.ksp")
    //kotlin parcelize = parcelable data class
    id("kotlin-parcelize")
}

android {
    namespace = "com.ojaq.footballnews"
    compileSdkPreview = "UpsideDownCake"

    defaultConfig {
        applicationId = "com.ojaq.footballnews"
        minSdk = 33
        targetSdk= 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //splash screen api 12
    //display splashscreen in android 12 -
    implementation("androidx.core:core-splashscreen:1.0.1")

    //image loader - picasso
    //image downloader makes it easier to display images
    implementation("com.squareup.picasso:picasso:2.8")

    //moshi
    //json converter - serialize and deserialize object to and from JSON
    //1 of libraries JSON converters for data serialize
    implementation("com.squareup.moshi:moshi:1.14.0")
    //kotlin codegen
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")

    //retrofit - request http/https web service
    //http client - retrofit with okhttp
    //to retrieve and upload JSON (or other structured data) via a rest based webservice
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
}