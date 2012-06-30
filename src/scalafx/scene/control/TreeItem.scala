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

package scalafx.scene.control

import javafx.scene.{ control => jfxsc }
import javafx.{ event => jfxe }
import scalafx.Includes._
import scalafx.scene.Node
import scalafx.util.SFXDelegate
import scalafx.collections.ObservableBuffer

object TreeItem {
  implicit def sfxTreeItemTojfx[T](v: TreeItem[T]) = v.delegate

  /**
   * An EventType used when the TreeItem receives a modification to its
   * expanded property, such that the TreeItem is now in the collapsed state.
   */
  def branchCollapsedEvent = jfxsc.TreeItem.branchCollapsedEvent

  /**
   * An EventType used when the TreeItem receives a modification to its
   * expanded property, such that the TreeItem is now in the expanded state.
   */
  def branchExpandedEvent = jfxsc.TreeItem.branchExpandedEvent

  /**
   * An EventType used when the TreeItem receives a direct modification to its
   * children list.
   */
  def childrenModificationEvent = jfxsc.TreeItem.childrenModificationEvent

  /**
   * An EventType used when the TreeItem receives a modification to its
   * graphic property.
   */
  def graphicChangedEvent = jfxsc.TreeItem.graphicChangedEvent

  /**
   * The general EventType used when the TreeItem receives a modification that
   *  results in the number of children being visible changes.
   */
  def treeItemCountChangeEvent = jfxsc.TreeItem.treeItemCountChangeEvent

  /**
   * The base EventType used to indicate that an event has occurred within a
   *  TreeItem.
   */
  def treeNotificationEvent = jfxsc.TreeItem.treeNotificationEvent

  /**
   * An EventType used when the TreeItem receives a modification to its value
   *  property.
   */
  def valueChangedEvent = jfxsc.TreeItem.valueChangedEvent

}

/**
 * Wraps [[javafx.scene.control.TreeItem]] class.
 */
class TreeItem[T](override val delegate: jfxsc.TreeItem[T] = new jfxsc.TreeItem[T])
  extends SFXDelegate[jfxsc.TreeItem[T]] {

  /**
   * Creates a TreeItem with the value property set to the provided object.
   */
  def this(value: T) = this(new jfxsc.TreeItem[T](value))

  /**
   * Creates a TreeItem with the value property set to the provided object,
   * and the graphic set to the provided Node.
   */
  def this(value: T, graphic: Node) = this(new jfxsc.TreeItem[T](value, graphic))

  /**
   * The expanded state of this TreeItem.
   */
  def expanded = delegate.expandedProperty
  def expanded_=(v: Boolean) {
    expanded() = v
  }

  /**
   * The node that is generally shown to the left of the value property.
   */
  def graphic = delegate.graphicProperty
  def graphic_=(v: Node) {
    graphic() = v
  }

  /**
   * Represents the TreeItem leaf property, which is true if the TreeItem has no children.
   */
  def leaf = delegate.leafProperty

  /**
   * A property that represents the parent of this TreeItem.
   */
  def parent = delegate.parentProperty

  /**
   * A property representing the application-specific data contained within
   * this TreeItem.
   */
  def value = delegate.valueProperty
  def value_=(v: T) {
    value.set(v)
  }

  /**
   * Registers an event handler to this TreeItem.
   */
  def addEventHandler[T <: jfxe.Event](eventType: jfxe.EventType[T], eventFilter: jfxe.EventHandler[T]) =
    delegate.addEventHandler(eventType, eventFilter)

  /**
   * Unregisters a previously registered event handler from this TreeItem.
   */
  def removeEventHandler[T <: jfxe.Event](eventType: jfxe.EventType[T], eventHandler: jfxe.EventHandler[T]) =
    delegate.removeEventHandler(eventType, eventHandler)

  /**
   * Construct an event dispatch chain for this target.
   */
  def buildEventDispatchChain(tail: jfxe.EventDispatchChain) =
    delegate.buildEventDispatchChain(tail)

  /**
   * The children of this TreeItem.
   */
  def children: ObservableBuffer[jfxsc.TreeItem[T]] = delegate.getChildren

  /**
   * Returns the next sibling of the TreeItem.
   */
  def nextSibling = delegate.nextSibling

  /**
   * Returns the next sibling after the given node.
   */
  def nextSibling(afterNode: TreeItem[T]) = delegate.nextSibling(afterNode)

  /**
   * Returns the previous sibling of the TreeItem.
   */
  def previousSibling = delegate.previousSibling

  /**
   * Returns the previous sibling previous the given node.
   */
  def previousSibling(afterNode: TreeItem[T]) = delegate.previousSibling(afterNode)

}