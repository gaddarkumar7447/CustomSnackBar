package com.example.snackbar

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowInsets
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMargins
import com.example.snackbar.databinding.LayoutDangerBinding
import com.example.snackbar.databinding.LayoutInfoBinding
import com.example.snackbar.databinding.LayoutNetworkErrorBinding
import com.example.snackbar.databinding.LayoutSuccessBinding
import com.example.snackbar.databinding.LayoutWarningBinding
import com.google.android.material.snackbar.Snackbar

class SnackBar {
    companion object {
        //Constant value
        private const val SUCCESS = 200
        private const val INFO = 300
        private const val WARNING = 400
        private const val ERROR = 500
        private const val NETWORKERROR = 600
        const val LENGTH_LONG = Snackbar.LENGTH_LONG
        const val LENGTH_SHORT = Snackbar.LENGTH_SHORT
        const val LENGTH_INDEFINITE = Snackbar.LENGTH_INDEFINITE

        fun success(view: View, msg: String, length: Int): Snackbar {
            return createSanckbar(view, msg, length, SUCCESS)
        }

        fun info(view: View, msg: String, length: Int): Snackbar {
            return createSanckbar(view, msg, length, INFO)
        }

        fun warning(view: View, msg: String, length: Int): Snackbar {
            return createSanckbar(view, msg, length, WARNING)
        }

        fun error(view: View, msg: String, length: Int): Snackbar {
            return createSanckbar(view, msg, length, ERROR)
        }

        fun networkError(view: View, msg: String, length: Int): Snackbar {
            return createSanckbar(view, msg, length, NETWORKERROR)
        }

        @SuppressLint("WrongConstant")
        private fun createSanckbar(view: View, msg: String, length: Int, type: Int): Snackbar {

            val snackBar = Snackbar.make(view, "", length)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)

            snackBar.view.updateLayoutParams<FrameLayout.LayoutParams> {
                gravity = Gravity.TOP
                if ((Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)) {
                    val systemBarTopInset: Int = ViewCompat.getRootWindowInsets(view)
                        ?.getInsets(WindowInsets.Type.statusBars())
                        ?.bottom
                        ?: 0
                    updateMargins(top = topMargin + systemBarTopInset)
                }
                ViewCompat.setLayoutDirection(snackBar.view, ViewCompat.LAYOUT_DIRECTION_LOCALE)
            }

            val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
            snackBarLayout.setPadding(0, 0, 0, 0)

            when (type) {
                SUCCESS -> {
                    val binding = LayoutSuccessBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                INFO -> {
                    val binding = LayoutInfoBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                WARNING -> {
                    val binding = LayoutWarningBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                ERROR -> {
                    val binding = LayoutDangerBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }

                NETWORKERROR -> {
                    val binding = LayoutNetworkErrorBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
            }
            return snackBar
        }
    }
}