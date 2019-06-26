package com.vitali.kotlinmvvmretrofitdagger.utils

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.transaction

fun FragmentActivity.replaceFragment(@IdRes containerViewId: Int, fragment: Fragment)
{
    supportFragmentManager.transaction(now = false, allowStateLoss = false) {
        replace(containerViewId, fragment, fragment::class.java.simpleName)
    }
}

fun FragmentActivity.addFragment(@IdRes containerViewId: Int, fragment: Fragment)
{
    supportFragmentManager.beginTransaction()
        .add(containerViewId, fragment, fragment::class.java.simpleName)
        .addToBackStack(fragment::class.java.simpleName).commit()
}

fun FragmentActivity.findFragmentByTag(tag: String): Fragment? =
    supportFragmentManager.findFragmentByTag(tag)

fun FragmentActivity.findFragmentById(tag: Int): Fragment? =
    supportFragmentManager.findFragmentById(tag)

fun FragmentActivity.popFragmentBackStack()
{
    supportFragmentManager.popBackStack()
}

fun FragmentActivity.isFragmentStackEmpty():Boolean
{
    return supportFragmentManager.backStackEntryCount == 0
}

fun FragmentActivity.getFragmentStackCount():Int
{
    return supportFragmentManager.backStackEntryCount
}