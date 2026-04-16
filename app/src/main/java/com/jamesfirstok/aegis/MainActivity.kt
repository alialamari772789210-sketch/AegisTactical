package com.jamesfirstok.aegis

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // هذا هو الكود الذي ظهر في الصورة الأولى
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // إعداد عرض الواجهة
        webView = WebView(this)
        setContentView(webView)

        // تفعيل الإعدادات التقنية (كما في سجلات Aegis)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        
        // الرابط الذي سيفتحه التطبيق (رابط واجهة Stitch الخاصة بك)
        webView.loadUrl("https://your-aegis-interface-url.com")
    }
}
