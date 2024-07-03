package ru.itis.firsttrialandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment ()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText=view.findViewById<EditText>(R.id.carCountEditText) //edit_text
        val buttonSend= view.findViewById<Button>(R.id.bottom_navigation)//button_send

        buttonSend.setOnClickListener()
        {
            val text = editText.text.toString()
            if(text.isEmpty())
            {
                Snackbar.make(view,"Para o envio do texto teras que preeencher ", Snackbar.LENGTH_LONG).show()
            }else
            {
                val action= HomeFragment.actionNavHometoNavResult(text)
                findNavController().navigate(action)
            }
        }
    }

    companion object {
        fun actionNavHometoNavResult(text: String): Any {

            return TODO("Provide the return value")
        }

    }
}

private fun NavController.navigate(action: Any) {
    TODO("Not yet implemented")
}
