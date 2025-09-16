plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // Elimina el plugin de compose separado, ya está incluido en kotlin.android
}

// Añade esta configuración para las versiones
buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20") // Versión actualizada
    }
}