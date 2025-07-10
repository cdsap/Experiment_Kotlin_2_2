plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.jvm) apply false

}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.kotlin.compose.plugin)


                implementation(libs.android.gradle.plugin)
                implementation(libs.hilt.plugin)

}

gradlePlugin {
    plugins {
        register("androidLibPlugin") {
            id = "awesome.androidlib.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidLib"
        }
    }
}
gradlePlugin {
    plugins {
        register("androidAppPlugin") {
            id = "awesome.androidapp.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidApp"
        }
    }
}
