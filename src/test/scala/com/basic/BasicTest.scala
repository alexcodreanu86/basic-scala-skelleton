package com.basic

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers._

class BasicTest extends AnyFunSpec with should.Matchers {
  it("returns true") {
    new Basic().isTrue() should be (false)
  }
}
