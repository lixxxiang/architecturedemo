package com.android.cgwx.architecture_demo.tasks

import androidx.lifecycle.*
import com.android.cgwx.architecture_demo.data.Task
import kotlinx.coroutines.launch

class TasksViewModel(
    tasksRepository: TasksRepository, savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _forceUpdate = MutableLiveData<Boolean>(false)
    private val _items: LiveData<List<Task>> = _forceUpdate.switchMap {
        if (it) {
            _dataLoading.value = true
            viewModelScope.launch {
                tasksRepository.refreshTasks()
                _dataLoading.value = false
            }
        }
        tasksRepository.observeTasks().distinctUntilChanged().switchMap {
            fliterTasks(it)
        }
    }
    val items: LiveData<List<Task>> = _items
    private val _dataLoading = MutableLiveData<Boolean>()

    var empty: LiveData<Boolean> = Transformations.map(_items){
        it.isEmpty()
    }

    private fun fliterTasks(tasksResult:Result<List<Task>>): LiveData<List<Task>>{
        return MutableLiveData<List<Task>>()
    }
}