package inc.fabudi.dynamicui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ThirdActivity : AppCompatActivity() {
    private val alphaStep = 0.1f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val iv = findViewById<ImageView>(R.id.imageView3)
        Glide.with(this).load("https://loremflickr.com/300/300?t=${System.currentTimeMillis()}").centerCrop().into(iv)

        findViewById<View>(R.id.addAlpha).setOnClickListener {
            if (iv.animation == null || iv.alpha < 1.0f && iv.animation.hasEnded()) {
                iv.animate().alpha(iv.alpha + alphaStep).setDuration(500).start()
            }
        }

        findViewById<View>(R.id.removeAlpha).setOnClickListener {
            if (iv.animation == null || iv.alpha > .0f && iv.animation.hasEnded()) {
                iv.animate().alpha(iv.alpha - alphaStep).setDuration(500).start()
            }
        }
    }
}