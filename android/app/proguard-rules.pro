-keep class com.melofaai.builder.** { *; }
-keep class com.google.android.material.** { *; }
-keep interface com.google.android.material.** { *; }
-dontwarn com.google.android.material.**

# Gson
-keep class com.google.gson.** { *; }
-keep interface com.google.gson.** { *; }
-dontwarn com.google.gson.**

# Retrofit
-keep class retrofit2.** { *; }
-keep interface retrofit2.** { *; }
-dontwarn retrofit2.**

# OkHttp
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }
-dontwarn okhttp3.**
