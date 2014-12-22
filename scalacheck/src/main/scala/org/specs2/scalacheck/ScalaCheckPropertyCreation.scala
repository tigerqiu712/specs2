package org.specs2
package scalacheck

import org.scalacheck._
import org.scalacheck.util.{FreqMap, Pretty}
import execute.AsResult
import ScalaCheckProperty._

trait ScalaCheckPropertyCreation {

  /** create a ScalaCheck property from a function */
  def prop[T, R](result: T => R)(
    implicit arbitrary: Arbitrary[T], shrink: Shrink[T], pretty: T => Pretty, prettyFreqMap: FreqMap[Set[Any]] => Pretty,
             asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction1[T, R] =
    ScalaCheckFunction1(result, arbitrary, Some(shrink), collector = None, pretty, prettyFreqMap, asResult, context = None, parameters)

  /** create a ScalaCheck property from a function of 2 arguments */
  def prop[T1, T2, R](result: (T1, T2) => R)(implicit
                                             arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,
                                             prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                             asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction2[T1, T2, R] =
    ScalaCheckFunction2(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 3 arguments */
  def prop[T1, T2, T3, R](result: (T1, T2, T3) => R)(implicit
                                                     arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,
                                                     prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                     asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction3[T1, T2, T3, R] =
    ScalaCheckFunction3(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 4 arguments */
  def prop[T1, T2, T3, T4, R](result: (T1, T2, T3, T4) => R)(implicit
                                                             arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,arbitrary4: Arbitrary[T4], shrink4: Shrink[T4], pretty4: T4 => Pretty,
                                                             prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                             asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction4[T1, T2, T3, T4, R] =
    ScalaCheckFunction4(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,arbitrary4, Some(shrink4), collector4 = None, pretty4 = pretty4,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 5 arguments */
  def prop[T1, T2, T3, T4, T5, R](result: (T1, T2, T3, T4, T5) => R)(implicit
                                                                     arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,arbitrary4: Arbitrary[T4], shrink4: Shrink[T4], pretty4: T4 => Pretty,arbitrary5: Arbitrary[T5], shrink5: Shrink[T5], pretty5: T5 => Pretty,
                                                                     prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                                     asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction5[T1, T2, T3, T4, T5, R] =
    ScalaCheckFunction5(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,arbitrary4, Some(shrink4), collector4 = None, pretty4 = pretty4,arbitrary5, Some(shrink5), collector5 = None, pretty5 = pretty5,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 6 arguments */
  def prop[T1, T2, T3, T4, T5, T6, R](result: (T1, T2, T3, T4, T5, T6) => R)(implicit
                                                                             arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,arbitrary4: Arbitrary[T4], shrink4: Shrink[T4], pretty4: T4 => Pretty,arbitrary5: Arbitrary[T5], shrink5: Shrink[T5], pretty5: T5 => Pretty,arbitrary6: Arbitrary[T6], shrink6: Shrink[T6], pretty6: T6 => Pretty,
                                                                             prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                                             asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction6[T1, T2, T3, T4, T5, T6, R] =
    ScalaCheckFunction6(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,arbitrary4, Some(shrink4), collector4 = None, pretty4 = pretty4,arbitrary5, Some(shrink5), collector5 = None, pretty5 = pretty5,arbitrary6, Some(shrink6), collector6 = None, pretty6 = pretty6,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 7 arguments */
  def prop[T1, T2, T3, T4, T5, T6, T7, R](result: (T1, T2, T3, T4, T5, T6, T7) => R)(implicit
                                                                                     arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,arbitrary4: Arbitrary[T4], shrink4: Shrink[T4], pretty4: T4 => Pretty,arbitrary5: Arbitrary[T5], shrink5: Shrink[T5], pretty5: T5 => Pretty,arbitrary6: Arbitrary[T6], shrink6: Shrink[T6], pretty6: T6 => Pretty,arbitrary7: Arbitrary[T7], shrink7: Shrink[T7], pretty7: T7 => Pretty,
                                                                                     prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                                                     asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction7[T1, T2, T3, T4, T5, T6, T7, R] =
    ScalaCheckFunction7(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,arbitrary4, Some(shrink4), collector4 = None, pretty4 = pretty4,arbitrary5, Some(shrink5), collector5 = None, pretty5 = pretty5,arbitrary6, Some(shrink6), collector6 = None, pretty6 = pretty6,arbitrary7, Some(shrink7), collector7 = None, pretty7 = pretty7,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)


  /** create a ScalaCheck property from a function of 8 arguments */
  def prop[T1, T2, T3, T4, T5, T6, T7, T8, R](result: (T1, T2, T3, T4, T5, T6, T7, T8) => R)(implicit
                                                                                             arbitrary1: Arbitrary[T1], shrink1: Shrink[T1], pretty1: T1 => Pretty,arbitrary2: Arbitrary[T2], shrink2: Shrink[T2], pretty2: T2 => Pretty,arbitrary3: Arbitrary[T3], shrink3: Shrink[T3], pretty3: T3 => Pretty,arbitrary4: Arbitrary[T4], shrink4: Shrink[T4], pretty4: T4 => Pretty,arbitrary5: Arbitrary[T5], shrink5: Shrink[T5], pretty5: T5 => Pretty,arbitrary6: Arbitrary[T6], shrink6: Shrink[T6], pretty6: T6 => Pretty,arbitrary7: Arbitrary[T7], shrink7: Shrink[T7], pretty7: T7 => Pretty,arbitrary8: Arbitrary[T8], shrink8: Shrink[T8], pretty8: T8 => Pretty,
                                                                                             prettyFreqMap: FreqMap[Set[Any]] => Pretty,
                                                                                             asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R] =
    ScalaCheckFunction8(result,
      arbitrary1, Some(shrink1), collector1 = None, pretty1 = pretty1,arbitrary2, Some(shrink2), collector2 = None, pretty2 = pretty2,arbitrary3, Some(shrink3), collector3 = None, pretty3 = pretty3,arbitrary4, Some(shrink4), collector4 = None, pretty4 = pretty4,arbitrary5, Some(shrink5), collector5 = None, pretty5 = pretty5,arbitrary6, Some(shrink6), collector6 = None, pretty6 = pretty6,arbitrary7, Some(shrink7), collector7 = None, pretty7 = pretty7,arbitrary8, Some(shrink8), collector8 = None, pretty8 = pretty8,
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)
}

object ScalaCheckPropertyCreation {
  def allPropMethods(n: Int): String =
    (2 to n).map(propMethod).mkString("\n")

  def propMethod(n: Int): String =
    s"""
  /** create a ScalaCheck property from a function of $n arguments */
  def prop[${TNList(n)}, R](result: (${TNList(n)}) => R)(implicit
    ${(1 to n).map(i => s"arbitrary$i: Arbitrary[T$i], shrink$i: Shrink[T$i], pretty$i: T$i => Pretty").mkString(",")},
    prettyFreqMap: FreqMap[Set[Any]] => Pretty,
    asResult: AsResult[R], parameters: Parameters): ScalaCheckFunction$n[${TNList(n)}, R] =
    ScalaCheckFunction$n(result,
      ${(1 to n).map(i => s"arbitrary$i, Some(shrink$i), collector$i = None, pretty$i = pretty$i").mkString(",")},
      prettyFreqMap = prettyFreqMap,
      asResult, context = None, parameters)
     """

}