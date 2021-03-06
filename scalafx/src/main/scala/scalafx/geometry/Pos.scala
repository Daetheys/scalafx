/*
 * Copyright (c) 2011-2013, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.geometry

import javafx.{geometry => jfxg}
import scalafx.geometry.GeometryIncludes.jfxHPos2sfx
import scalafx.geometry.GeometryIncludes.jfxVPos2sfx
import scalafx.delegate.{ SFXEnumDelegateCompanion, SFXEnumDelegate }

/** Wrapper for [[javafx.geometry.Pos]] */
object Pos
  extends SFXEnumDelegateCompanion[jfxg.Pos, Pos] {

  val BASELINE_CENTER = new Pos(jfxg.Pos.BASELINE_CENTER)
  val BASELINE_LEFT = new Pos(jfxg.Pos.BASELINE_LEFT)
  val BASELINE_RIGHT = new Pos(jfxg.Pos.BASELINE_RIGHT)
  val BOTTOM_CENTER = new Pos(jfxg.Pos.BOTTOM_CENTER)
  val BOTTOM_LEFT = new Pos(jfxg.Pos.BOTTOM_LEFT)
  val BOTTOM_RIGHT = new Pos(jfxg.Pos.BOTTOM_RIGHT)
  val CENTER = new Pos(jfxg.Pos.CENTER)
  val CENTER_LEFT = new Pos(jfxg.Pos.CENTER_LEFT)
  val CENTER_RIGHT = new Pos(jfxg.Pos.CENTER_RIGHT)
  val TOP_CENTER = new Pos(jfxg.Pos.TOP_CENTER)
  val TOP_LEFT = new Pos(jfxg.Pos.TOP_LEFT)
  val TOP_RIGHT = new Pos(jfxg.Pos.TOP_RIGHT)

  protected override def unsortedValues: Array[Pos] = Array(
    TOP_LEFT, TOP_CENTER, TOP_RIGHT,
    CENTER_LEFT, CENTER, CENTER_RIGHT,
    BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT,
    BASELINE_LEFT, BASELINE_CENTER, BASELINE_RIGHT
  )
}

sealed case class Pos(override val delegate: jfxg.Pos)
  extends SFXEnumDelegate[jfxg.Pos] {

  /** Returns the horizontal positioning/alignment. */
  def hpos: HPos = delegate.getHpos

  /** Returns the vertical positioning/alignment. **/
  def vpos: VPos = delegate.getVpos
}