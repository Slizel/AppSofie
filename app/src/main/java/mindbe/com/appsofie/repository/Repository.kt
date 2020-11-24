package mindbe.com.appsofie.repository

import mindbe.com.appsofie.api.RetrofitInstance
import mindbe.com.appsofie.model.Task
import retrofit2.Response

class Repository {

    suspend fun getCustomTasks(email: String): Response<List<Task>> {
        return RetrofitInstance.api.getCustomTasks(email)
    }






}