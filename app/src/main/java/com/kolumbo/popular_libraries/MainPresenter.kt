package com.kolumbo.popular_libraries

class MainPresenter(val view: MainView) {
    val model = CountersModel()

    fun counterClick1(id: Int) {
        when (id) {
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                view.setCounter1(nextValue.toString())
            }
        }
    }

    fun counterClick2(id: Int) {
        when (id) {
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                view.setCounter2(nextValue.toString())
            }
        }
    }

    fun counterClick3(id: Int) {
        when (id) {
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                view.setCounter3(nextValue.toString())
            }
        }
    }

}