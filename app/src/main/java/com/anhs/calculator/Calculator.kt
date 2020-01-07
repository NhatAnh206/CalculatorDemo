package com.example.caculator


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anhs.calculator.R
import kotlinx.android.synthetic.main.fragment_calculator.*

/**
 * A simple [Fragment] subclass.
 */
class Calculator : Fragment(), View.OnClickListener {


    var input1 = 0.0
    var input2 = 0.0

    var sum = false
    var sub = false
    var mul = false
    var div = false
    var per = false

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
        initView()
    }

    private fun initView() {
        bt_0.setOnClickListener(this)
        bt_1.setOnClickListener(this)
        bt_2.setOnClickListener(this)
        bt_3.setOnClickListener(this)
        bt_4.setOnClickListener(this)
        bt_5.setOnClickListener(this)
        bt_6.setOnClickListener(this)
        bt_7.setOnClickListener(this)
        bt_8.setOnClickListener(this)
        bt_9.setOnClickListener(this)
        bt_dot.setOnClickListener(this)
        bt_sum.setOnClickListener(this)
        bt_sub.setOnClickListener(this)
        bt_mul.setOnClickListener(this)
        bt_div.setOnClickListener(this)
        bt_per.setOnClickListener(this)
        bt_ac.setOnClickListener(this)
        bt_c.setOnClickListener(this)
        bt_result.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt_0 -> {
                enterNumber("0")
            }
            R.id.bt_1 -> {
                enterNumber("1")
            }
            R.id.bt_2 -> {
                enterNumber("2")
            }
            R.id.bt_3 -> {
                enterNumber("3")
            }
            R.id.bt_4 -> {
                enterNumber("4")
            }
            R.id.bt_5 -> {
                enterNumber("5")
            }
            R.id.bt_6 -> {
                enterNumber("6")
            }
            R.id.bt_7 -> {
                enterNumber("7")
            }
            R.id.bt_8 -> {
                enterNumber("8")
            }
            R.id.bt_9 -> {
                enterNumber("9")
            }
            R.id.bt_dot -> {
                enterNumber(",")
            }
            R.id.bt_sum -> {
                sum = true
                input1 = tv_result.text.toString().toDouble()
                tv_result.text = "0"
            }
            R.id.bt_sub -> {
                sub = true
                input1 = tv_result.text.toString().toDouble()
                tv_result.text = "0"
            }
            R.id.bt_mul -> {
                mul = true
                input1 = tv_result.text.toString().toDouble()
                tv_result.text = "0"
            }
            R.id.bt_div -> {
                div = true
                input1 = tv_result.text.toString().toDouble()
                tv_result.text = "0"
            }
            R.id.bt_per -> {
                per = true
                input1 = tv_result.text.toString().toDouble()
                tv_result.text = "0"
            }
            R.id.bt_ac -> {
                val ac = 0
                tv_result.text = ac.toString()
            }
            R.id.bt_c -> {
                var number = tv_result.text.toString().length

                var delete = tv_result.text.toString().substring(0, number - 1)
                tv_result.text = delete
            }
            R.id.bt_result -> {
                if (sum) {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 + input2).toString()
                    sum = false
                } else if (sub) {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 - input2).toString()
                    sub = false
                } else if (mul) {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 * input2).toString()
                    mul = false
                } else if (div) {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 / input2).toString()
                    div = false
                } else if (per) {
                    input2 = tv_result.text.toString().toDouble()
                    tv_result.text = (input1 * input2 / 100).toString()
                    per = false
                }
            }
        }
    }

    private fun enterNumber(s: String) {
        tv_result.text = tv_result.text.toString() + s
    }

}



