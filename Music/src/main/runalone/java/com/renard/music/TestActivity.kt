package com.renard.music

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.renard.music.ui.fragment.MusicFragment

/**
 * 单独测试Activity
 */
class TestActivity : AppCompatActivity() {

    val musicFragment = MusicFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music_activity_test)
        supportFragmentManager.beginTransaction().replace(R.id.flay_root, musicFragment).commit()
    }

    override fun onBackPressed() {
        if (!musicFragment.onKeyBackPressed()) {
            super.onBackPressed()
        }
    }

}