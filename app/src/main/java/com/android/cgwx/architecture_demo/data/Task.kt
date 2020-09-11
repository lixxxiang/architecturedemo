package com.android.cgwx.architecture_demo.data

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity
data class Task constructor(
    @ColumnInfo(name = "title") var title: String? = null,
    @ColumnInfo(name = "description")
    var description: String? = null,

    @ColumnInfo(name = "completed")
    var completed: Boolean? = false,

    @ColumnInfo(name = "entryid")
    var entryid: String? = null
) {

}