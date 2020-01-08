package com.anhs.calculator


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_calculator.*

/**
 * A simple [Fragment] subclass.
 */
class Calculator : Fragment(), View.OnClickListener {


    private var input1 = 0.0
    private var input2 = 0.0

    private var sum = false
    private var sub = false
    private var mul = false
    private var div = false
    private var per = false

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_calculator, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListener()
    }

    private fun setListener() {
        buttonZero.setOnClickListener(this)
        buttonOne.setOnClickListener(this)
        buttonTwo.setOnClickListener(this)
        buttonThree.setOnClickListener(this)
        buttonFour.setOnClickListener(this)
        buttonFive.setOnClickListener(this)
        buttonSix.setOnClickListener(this)
        buttonSeven.setOnClickListener(this)
        buttonEight.setOnClickListener(this)
        buttonNine.setOnClickListener(this)
        buttonDot.setOnClickListener(this)
        buttonSum.setOnClickListener(this)
        buttonSubtract.setOnClickListener(this)
        buttonMultipli.setOnClickListener(this)
        buttonDivide.setOnClickListener(this)
        buttonPercent.setOnClickListener(this)
        buttonAc.setOnClickListener(this)
        buttonC.setOnClickListener(this)
        buttonEqual.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonZero -> {
                enterNumber("0")
            }
            R.id.buttonOne -> {
                enterNumber("1")
            }
            R.id.buttonTwo -> {
                enterNumber("2")
            }
            R.id.buttonThree -> {
                enterNumber("3")
            }
            R.id.buttonFour -> {
                enterNumber("4")
            }
            R.id.buttonFive -> {
                enterNumber("5")
            }
            R.id.buttonSix -> {
                enterNumber("6")
            }
            R.id.buttonSeven -> {
                enterNumber("7")
            }
            R.id.buttonEight -> {
                enterNumber("8")
            }
            R.id.buttonNine -> {
                enterNumber("9")
            }
            R.id.buttonDot -> {
                enterNumber(",")
            }
            R.id.buttonSum -> {
                sum = true
                input1 = textResult.text.toString().toDouble()
                textResult.text = "0"
            }
            R.id.buttonSubtract -> {
                sub = true
                input1 = textResult.text.toString().toDouble()
                textResult.text = "0"
            }
            R.id.buttonMultipli -> {
                mul = true
                input1 = textResult.text.toString().toDouble()
                textResult.text = "0"
            }
            R.id.buttonDivide -> {
                div = true
                input1 = textResult.text.toString().toDouble()
                textResult.text = "0"
            }
            R.id.buttonPercent -> {
                per = true
                input1 = textResult.text.toString().toDouble()
                textResult.text = "0"
            }
            R.id.buttonAc -> {
                val ac = 0
                textResult.text = ac.toString()
            }
            R.id.buttonC -> {
                val number = textResult.text.toString().length

                val delete = textResult.text.toString().substring(0, number - 1)
                textResult.text = delete
            }
            R.id.buttonEqual -> {
                if (sum) {
                    input2 = textResult.text.toString().toDouble()
                    textResult.text = (input1 + input2).toString()
                    sum = false
                } else if (sub) {
                    input2 = textResult.text.toString().toDouble()
                    textResult.text = (input1 - input2).toString()
                    sub = false
                } else if (mul) {
                    input2 = textResult.text.toString().toDouble()
                    textResult.text = (input1 * input2).toString()
                    mul = false
                } else if (div) {
                    input2 = textResult.text.toString().toDouble()
                    textResult.text = (input1 / input2).toString()
                    div = false
                } else if (per) {
                    input2 = textResult.text.toString().toDouble()
                    textResult.text = (input1 * input2 / 100).toString()
                    per = false
                }
            }
        }
    }

    private fun enterNumber(s: String) {
        textResult.text = textResult.text.toString() + s
    }

}



