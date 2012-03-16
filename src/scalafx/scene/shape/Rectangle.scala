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

package scalafx.scene.shape

import scalafx.Includes._
import javafx.scene.{shape => jfxss}
import scalafx.scene.paint._
import scalafx.util.SFXDelegate

object Rectangle {
  implicit def sfxRectangle2jfx(v: Rectangle) = v.delegate
}

class Rectangle(override val delegate:jfxss.Rectangle = new jfxss.Rectangle()) extends Shape(delegate) with SFXDelegate[jfxss.Rectangle] {
  def this(width: Double, height: Double) = this(new jfxss.Rectangle(width, height))
  def this(x: Double, y: Double, width: Double, height: Double) = this(new jfxss.Rectangle(x, y, width, height))
  def this(width: Double, height: Double, fill: Paint) = this(new jfxss.Rectangle(width, height, fill))
  
  def x = delegate.xProperty
  def x_=(v: Double) {
    x() = v
  }

  def y = delegate.yProperty
  def y_=(v: Double) {
    y() = v
  }

  def width = delegate.widthProperty
  def width_=(v: Double) {
    width() = v
  }

  def height = delegate.heightProperty
  def height_=(v: Double) {
    height() = v
  }

  def arcWidth = delegate.arcWidthProperty
  def arcWidth_=(v: Double) {
    arcWidth() = v
  }

  def arcHeight = delegate.arcHeightProperty
  def arcHeight_=(v: Double) {
    arcHeight() = v
  }
}
