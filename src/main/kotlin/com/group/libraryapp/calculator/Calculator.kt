package com.group.libraryapp.calculator

import com.querydsl.core.support.Context

class Calculator(
  var number: Int
) {

  fun add(operand: Int) {
    this.number += operand
  }

  fun minus(operand: Int) {
    this.number -= operand
  }

  fun multiply(operand: Int) {
    this.number *= operand
  }

  fun divide(operand: Int) {
    if (operand == 0) {
      throw IllegalArgumentException("0으로 나눌 수 없습니다")
    }
    this.number /= operand
  }
  fun temp( operand: Int, context: Context){

  }

  fun save(){

  }


  fun save( operand: Int, context: Context){

  }

}