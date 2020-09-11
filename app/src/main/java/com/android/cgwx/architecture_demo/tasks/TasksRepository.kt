package com.android.cgwx.architecture_demo.tasks

import androidx.lifecycle.LiveData
import com.android.cgwx.architecture_demo.data.Task

interface TasksRepository {
    fun refreshTasks()
    fun observeTasks(): LiveData<Result<List<Task>>>
}