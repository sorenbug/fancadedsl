package tf.bug.fancadedsl

import shapeless.{HList, Nat}
import shapeless.nat._

trait ScriptBlock[A] {

  type IsEffect <: Boolean
  type ExtraEffects <: Nat

  type Inputs <: HList
  type Outputs <: HList

}

object ScriptBlock {

  type Aux[A, I <: HList, O <: HList, E <: Boolean, X <: Nat] = ScriptBlock[A] {
    type IsEffect = E
    type ExtraEffects = X
    type Inputs = I
    type Outputs = O
  }

}
