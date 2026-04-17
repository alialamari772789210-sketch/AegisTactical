cmake_minimum_required(VERSION 3.10.2)

# تعريف المشروع الأمني
project("aegis_security")

# ربط ملف التشفير C++ وتحويله إلى مكتبة أمنية
add_library( 
             security-lib
             SHARED
             native-lib.cpp )

# استدعاء مكتبة السجلات (Logging) لمراقبة محاولات الاختراق
find_library( 
              log-lib
              log )

# الدمج النهائي للمكتبة الأمنية مع نظام التشغيل
target_link_libraries( 
                       security-lib
                       ${log-lib} )
