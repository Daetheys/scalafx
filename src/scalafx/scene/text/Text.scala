/*
 * Copyright (c) 2011, ScalaFX Project
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

package scalafx.scene.text

import javafx.scene.text.{FontWeight, FontPosture}
import scalafx.util.SFXDelegate
import scalafx.Includes._
import javafx.scene.{text => jfxst}
import javafx.geometry.VPos
import scalafx.scene.shape.Shape

object Text {
  implicit def sfxText2jfx(v: Text) = v.delegate
}

class Text(override val delegate: jfxst.Text) extends Shape(delegate) with SFXDelegate[jfxst.Text]{

  def this() = this(new jfxst.Text)
  def this(t: String) = this(new jfxst.Text(t))
  def this(x: Double, y: Double, t: String) = this(new jfxst.Text(x, y, t))

  def baselineOffset = delegate.baselineOffsetProperty

  def boundsType = delegate.boundsTypeProperty
  def boundsType_= (v: jfxst.TextBoundsType) {
    boundsType() = v
  }

  def font = delegate.fontProperty
  def font_= (v: jfxst.Font) {
    font() = v
  }

  def fontSmoothingType = delegate.fontSmoothingTypeProperty
  def fontSmoothingType_= (v: jfxst.FontSmoothingType) {
    fontSmoothingType() = v
  }

  def strikethrough = delegate.strikethroughProperty
  def strikethrough_= (v: Boolean) {
    strikethrough = v
  }

  def text = delegate.textProperty
  def text_= (v: String) {
    text() = v
  }

  def textAlignment = delegate.textAlignmentProperty
  def textAlignment_= (v: jfxst.TextAlignment) {
    textAlignment() = v
  }

  def textOrigin = delegate.textOriginProperty
  def textOrigin_= (v: VPos) {
    textOrigin() = v
  }

  def underline = delegate.underlineProperty
  def underline_= (v: Boolean) {
    underline() = v
  }

  def wrappingWidth = delegate.wrappingWidthProperty
  def wrappingWidth_= (v: Double) {
    wrappingWidth() = v
  }

  def x = delegate.xProperty
  def x_= (v: Double) {
    x() = v
  }

  def y = delegate.yProperty
  def y_= (v: Double) {
    y() = v
  }
}
