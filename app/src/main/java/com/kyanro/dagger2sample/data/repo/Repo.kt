package com.kyanro.dagger2sample.data.repo

import android.app.Application
import com.kyanro.dagger2sample.MyApplication

class AppRepo(val app: MyApplication) {
    fun getAppName(): String = "app repo"
}

class NameRepo(val name: String) {
    fun getRepoName(): String = "name repo: $name"
}

class StringRepo(val str: String) {
    fun getStringName(): String = "string repo: $str"
}