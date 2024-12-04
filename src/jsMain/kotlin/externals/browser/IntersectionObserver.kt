@file:Suppress("FunctionName", "unused")
package externals.browser

import org.w3c.dom.DOMRectReadOnly
import org.w3c.dom.Element

external interface IntersectionObserverOptions
{
    // An Element or Document object which is an ancestor of the intended target, whose bounding rectangle will be considered the viewport. Any part of the target not visible in the visible area of the root is not considered visible.
    var root: Element?
    // A string which specifies a set of offsets to add to the root's bounding_box when calculating intersections, effectively shrinking or growing the root for calculation purposes. The syntax is approximately the same as that for the CSS margin property; see The root element and root margin in Intersection Observer API for more information on how the margin works and the syntax. The default is "0px 0px 0px 0px".
    var rootMargin: String?
    // Either a single number or an array of numbers between 0.0 and 1.0, specifying a ratio of intersection area to total bounding box area for the observed target. A value of 0.0 means that even a single visible pixel counts as the target being visible. 1.0 means that the entire target element is visible. See Thresholds in Intersection Observer API for a more in-depth description of how thresholds are used. The default is a threshold of 0.0.
    var threshold: Array<Number>?
}
fun IntersectionObserverOptions(block: IntersectionObserverOptions.() -> Unit = {}): IntersectionObserverOptions =
    js("{}").unsafeCast<IntersectionObserverOptions>().apply(block)

external interface IntersectionObserverEntry
{
    // Returns the bounds rectangle of the target element as a DOMRectReadOnly. The bounds are computed as described in the documentation for Element.getBoundingClientRect().
    val boundingClientRect: DOMRectReadOnly
    // Returns the ratio of the intersectionRect to the boundingClientRect.
    val intersectionRatio: Number
    // Returns a DOMRectReadOnly representing the target's visible area.
    val intersectionRect: DOMRectReadOnly
    // A Boolean value which is true if the target element intersects with the intersection observer's root. If this is true, then, the IntersectionObserverEntry describes a transition into a state of intersection; if it's false, then you know the transition is from intersecting to not-intersecting.
    val isIntersecting: Boolean
    // Returns a DOMRectReadOnly for the intersection observer's root.
    val rootBounds: DOMRectReadOnly
    // The Element whose intersection with the root changed.
    val target: Element
    // A DOMHighResTimeStamp indicating the time at which the intersection was recorded, relative to the IntersectionObserver's time origin.
    val time: Double
}

typealias IntersectionObserverCallback = (entries: Array<IntersectionObserverEntry>, observer: IntersectionObserver) -> Unit

external class IntersectionObserver(callback: IntersectionObserverCallback)
{
    constructor(callback: IntersectionObserverCallback, options: IntersectionObserverOptions)

    // The Element or Document whose bounds are used as the bounding box when testing for intersection. If no root value was passed to the constructor or its value is null, the top-level document's viewport is used.
    val root: Element

    // An offset rectangle applied to the root's bounding box when calculating intersections, effectively shrinking or growing the root for calculation purposes. The value returned by this property may not be the same as the one specified when calling the constructor as it may be changed to match internal requirements. Each offset can be expressed in pixels (px) or as a percentage (%). The default is "0px 0px 0px 0px".
    val rootMargin: String

    // A list of thresholds, sorted in increasing numeric order, where each threshold is a ratio of intersection area to bounding box area of an observed target. Notifications for a target are generated when any of the thresholds are crossed for that target. If no value was passed to the constructor, 0 is used.
    val thresholds: Array<Number>

    // Stops the IntersectionObserver object from observing any target.
    fun disconnect()
    // Tells the IntersectionObserver a target element to observe.
    fun observe(targetElement: Element)
    // Returns an array of IntersectionObserverEntry objects for all observed targets.
    fun takeRecords(): Array<IntersectionObserverEntry>
    // Tells the IntersectionObserver to stop observing a particular target element.
    fun unobserve(targetElement: Element)
}