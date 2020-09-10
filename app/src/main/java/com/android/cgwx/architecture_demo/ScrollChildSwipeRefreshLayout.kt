package com.android.cgwx.architecture_demo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class ScrollChildSwipeRefreshLayout(context: Context, attrs: AttributeSet? = null) :
    SwipeRefreshLayout(context, attrs) {
    override fun canChildScrollUp(): Boolean {
        val scrollUpChild: View? = null
        return scrollUpChild?.canScrollVertically(-1) ?: super.canChildScrollUp()
    }
}