package com.example.memorynotes.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.memorynotes.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addNote = view.findViewById<FloatingActionButton>(R.id.addNote)
        addNote.setOnClickListener { goToNoteDetails() }
    }

    private fun goToNoteDetails(id: Long = 0L) {
        val action = ListFragmentDirections.actionGoToNote(id)
        val notesListView = view?.findViewById<RecyclerView>(R.id.notesListView)
        if (notesListView != null) {
            Navigation.findNavController(notesListView).navigate(action)
        }
    }
}