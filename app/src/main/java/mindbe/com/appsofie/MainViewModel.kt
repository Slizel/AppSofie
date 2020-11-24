package mindbe.com.appsofie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mindbe.com.appsofie.model.Task
import mindbe.com.appsofie.repository.Repository
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val mCustomTasks: MutableLiveData<Response<List<Task>>> = MutableLiveData()

    fun getCustomTasks(email: String){
        viewModelScope.launch {
            val response = repository.getCustomTasks(email)
        }
    }
}