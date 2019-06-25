package com.vitali.kotlinmvvmretrofitdagger.ui


import android.os.Bundle
import androidx.annotation.LayoutRes
import com.vitali.kotlinmvvmretrofitdagger.R
import com.vitali.kotlinmvvmretrofitdagger.base.BaseActivity
import com.vitali.kotlinmvvmretrofitdagger.base.replaceFragment

class MainActivity : BaseActivity() {

    @LayoutRes
    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState == null)
            replaceFragment(R.id.fragmentContainer, ListFragment.newInstance())
    }
}
