package com.example.recycler.handlres

import android.util.Log
import com.example.recycler.data.Invitation

class MyHandlers {
    fun starClicked(invitation: Invitation) {
        Log.i("MyHandlers: ", "${invitation}をお気に入り")
    }
    fun garbateClicked(invitation: Invitation) {
        Log.i("MyHandlers: ", "${invitation}をゴミ箱へ")
    }
    fun itemClicked(invitation: Invitation) {
        Log.i("MyHandlers: ", "${invitation}の詳細へ")
    }
}