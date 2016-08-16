#include <JniTest.h>
JNIEXPORT jstring JNICALL Java_com_jni_test_JniTest_getStringFromJni(JNIEnv *env, jobject obj) {
	return env->NewStringUTF("你好吗");
}
