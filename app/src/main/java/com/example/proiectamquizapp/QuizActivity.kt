package com.example.proiectamquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proiectamquizapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    companion object{
        var questionModelList : List<QuestionModel> = listOf()
    }

    lateinit var binding: ActivityQuizBinding

    var currentQuestionIndex = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadQuestions()
    }

    private fun loadQuestions(){
        binding.apply {
            questionIndicatorTextview.text = "Question ${currentQuestionIndex+1}/ ${questionModelList.size}"
            questionProgressIndicator.progress =
                (currentQuestionIndex.toFloat() / questionModelList.size.toFloat() * 100).toInt()
            questionTextview.text = questionModelList[currentQuestionIndex].question

        }
    }

}