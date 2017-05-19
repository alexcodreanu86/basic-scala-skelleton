package com.basic

import org.scalatest._

class BasicTest extends FunSpec with Matchers {
  it("returns true") {
    new Basic().isTrue() should be (false)
  }
}
