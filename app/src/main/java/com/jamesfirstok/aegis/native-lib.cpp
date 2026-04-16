#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_jamesfirstok_aegis_MainActivity_validateSecurity(
        JNIEnv* env,
        jobject /* this */) {
    
    // مفتاح التشفير الخاص للارتباط بالقمر الصناعي AEGIS-992-DELTA
    std::string securityKey = "AEGIS-992-DELTA-AUTHENTICATED";
    return env->NewStringUTF(securityKey.c_str());
}
