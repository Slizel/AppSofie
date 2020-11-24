package mindbe.com.appsofie.api

import mindbe.com.appsofie.model.Task
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface TaskApi {


    @GET("/task")
    suspend fun getCustomTasks(
            @Query("email") email: String
    ): Response<List<Task>>

}