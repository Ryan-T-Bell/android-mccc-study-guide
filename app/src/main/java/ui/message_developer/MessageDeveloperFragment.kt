package ui.message_developer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.armyprogrammer.mcccstudyguide.R

class MessageDeveloperFragment : Fragment() {

    private lateinit var messageDeveloperViewModel: MessageDeveloperViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        messageDeveloperViewModel =
                ViewModelProviders.of(this).get(MessageDeveloperViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_message_developer, container, false)

        messageDeveloperViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        return root
    }
}
