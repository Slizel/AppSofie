package mindbe.com.appsofie.fragments.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import mindbe.com.appsofie.MainViewModel
import mindbe.com.appsofie.MainViewModelFactory
import mindbe.com.appsofie.R
import mindbe.com.appsofie.repository.Repository

class AddFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)




           // val myEmail = "sofie@sofie.com"
           // viewModel.getCustomTasks(myEmail)
            viewModel.mCustomTasks.observe(requireActivity(), Observer { response ->

                if (response.isSuccessful) {

                    //

                } else {
                    //
                }
            })

        return view
    }
}