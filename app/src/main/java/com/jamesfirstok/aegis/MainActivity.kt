package com.aegis.tactical.v108

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import java.util.Locale

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)
        
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        // حقن اسم العقيد علي العماري في واجهة النظام
        welcomeText.text = "مرحباً بكم سيادة العقيد علي العماري في منظومة السيادة\nSovereignty System Activated"
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale("ar")
            // ترحيب صوتي عند التشغيل
            tts.speak("مرحباً بكم سيادة العقيد علي العماري في منظومة السيادة", TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    override fun onDestroy() {
        if (::tts.isInitialized) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}
