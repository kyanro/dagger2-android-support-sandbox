package com.kyanro.dagger2sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kyanro.dagger2sample.data.repo.AppRepo
import com.kyanro.dagger2sample.data.repo.NameRepo
import com.kyanro.dagger2sample.data.repo.StringRepo
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appRepo: AppRepo

    @Inject
    lateinit var nameRepo: NameRepo

    @Inject
    lateinit var stringRepo: StringRepo

    private fun myLog(msg: String) {
        Log.d("mylog", msg)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLog(appRepo.getAppName())
        myLog(nameRepo.getRepoName())
        myLog(stringRepo.getStringName())
    }
}
