package stan.androiddemo.project.Mito

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_about_mito.*


import stan.androiddemo.R

class AboutMitoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_mito)
        toolbar.setNavigationOnClickListener { onBackPressed() }

        btn_clear_cache.setOnClickListener {
            //清空缓存
        }


    }


}
