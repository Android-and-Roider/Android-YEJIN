package com.example.a20220511shinyejin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.KeyEvent
import android.widget.Toast
import com.example.a20220511shinyejin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var initTime=0L
    var pauseTime = 0L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.btnStop.setOnClickListener {
            pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.btnStart.isEnabled = true
            binding.btnReset.isEnabled = true
            binding.btnStop.isEnabled = false

        }
        //색깔 들어오는게 true, 색깔 안 들어오는 게 false

        binding.btnStart.setOnClickListener {
            binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            binding.chronometer.start()
            binding.btnStart.isEnabled = false
            binding.btnReset.isEnabled = true
            binding.btnStop.isEnabled = true

        }

        binding.btnReset.setOnClickListener {

            binding.chronometer.base = SystemClock.elapsedRealtime()
            pauseTime=0L
            binding.btnStart.isEnabled = true
            binding.btnReset.isEnabled = false
            binding.btnStop.isEnabled = false

        }

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        //뒤로가기 버튼 눌렀을 때 처리
        if(keyCode == KeyEvent.KEYCODE_BACK) {

            //누른지 3초가 지났을 때
            if (System.currentTimeMillis() - initTime > 3000) {
                Toast.makeText(this, "종료하려면 한번 더 누르세요", Toast.LENGTH_LONG).show()
                initTime=System.currentTimeMillis()
                return true


            }


        }
        return super.onKeyDown(keyCode, event)
    }














}

