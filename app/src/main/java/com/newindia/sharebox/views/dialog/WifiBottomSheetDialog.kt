package com.newindia.sharebox.views.dialog

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newindia.sharebox.R

/**
 * Created by KerriGan on 2017/6/2.
 */
open class WifiBottomSheetDialog:CloseBottomSheetDialog{

    constructor(context: Context,activity: Activity? = null):super(context,activity){

    }

    override fun onCreateView(): View?{
        var vg = super.onCreateView() as ViewGroup
        var child=LayoutInflater.from(context).inflate(R.layout.layout_main_activity_data,vg,false)
        vg.addView(child)
        return vg
    }


}