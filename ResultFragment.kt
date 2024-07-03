package ru.itis.firsttrialandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

private val <ResultFragmentArgs> ResultFragmentArgs.inputText: CharSequence?
    get() = Unit.toString()

class ResultFragment<ResultFragmentArgs> : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result,container,false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView=view.findViewById<TextView>(R.id.text_result)
        val args: ResultFragmentArgs by navArgs()
        textView.text=args.inputText
    }
}