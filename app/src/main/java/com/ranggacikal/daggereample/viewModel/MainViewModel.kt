package com.ranggacikal.daggereample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ranggacikal.daggereample.model.FootbalClub
import com.ranggacikal.daggereample.repository.FootballRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val footballRepository: FootballRepository
) : ViewModel() {
    private val footballEmitter = MutableLiveData<List<FootbalClub>>()
    val footballClub: LiveData<List<FootbalClub>> = footballEmitter

    init {
        loadFootballClub()
    }

    private fun loadFootballClub() {
        footballEmitter.value = footballRepository.getFootballClub()
    }
}