cmake_minimum_required(VERSION 3.10.2)

project("aegis_security")

# هذا السطر يربط ملف native-lib.cpp الذي أنشأناه للتو
add_library( 
             security-lib
             SHARED
             native-lib.cpp )

find_library( 
              log-lib
              log )

target_link_libraries( 
                       security-lib
                       ${log-lib} )
